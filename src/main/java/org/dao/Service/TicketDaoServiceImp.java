package org.dao.Service;

import org.entity.Ticket;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

public class TicketDaoServiceImp implements TicketDaoService {

    @Override
    public void add(Ticket ticket) {

        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession();) {

            Transaction transaction = session.beginTransaction();
            session.persist(ticket);
            transaction.commit();

        } catch (Exception e) {

            throw new RuntimeException(e);

        }
    }

    @Override
    public void delete(Ticket ticket) {

        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession();) {

            Transaction tx = session.beginTransaction();
            session.delete(ticket);
            tx.commit();

        }
    }




}

