package org.dao.Service;

import org.entity.Planet;
import org.hibernate.Session;

import org.hibernate.Transaction;
import utils.HibernateUtil;


public class PlanetDaoServiceImp implements PlanetDaoService {

    @Override
    public void add(Planet planet) {
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession();){

            Transaction transaction = session.beginTransaction();
            session.persist(planet);
            transaction.commit();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Planet planet) {
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession();){
            Transaction tx = session.beginTransaction();
            session.delete(planet);
            tx.commit();
        }
    }
}
