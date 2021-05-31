package com.company;

import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class CarDao {
    public Car findById(int id) {
        return HibernateSessionFactoryUtil.getSession().get(Car.class, id);
    }

    public void save(Car car) {
        Session session = HibernateSessionFactoryUtil.getSession();
        Transaction tx1 = session.beginTransaction();
        session.save(car);
        tx1.commit();
        session.close();
    }

    public void update(Car car) {
        Session session = HibernateSessionFactoryUtil.getSession();
        Transaction tx1 = session.beginTransaction();
        session.update(car);
        tx1.commit();
        session.close();
    }

    public void delete(Car car) {
        Session session = HibernateSessionFactoryUtil.getSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(car);
        tx1.commit();
        session.close();
    }

    public List<Car> findAll() {
        List<Car> cars = (List<Car>)  HibernateSessionFactoryUtil.getSession().createQuery("from Car").list();
        return cars;
    }
}

