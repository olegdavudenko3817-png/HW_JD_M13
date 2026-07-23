package org.dao.Service;

import org.entity.Client;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

public class ClientDaoServiceImp implements ClientDaoService {

    @Override
    public void add(Client client) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            System.out.println("transaction: " + transaction.getClass().getName());
            System.out.println("Status: "  + transaction.getStatus());

            session.persist(client);
            transaction.commit();

        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Error saving client", e);
        }
    }

    @Override
    public void delete(Client client) {
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.delete(client);
            tx.commit();
        }
    }
}
