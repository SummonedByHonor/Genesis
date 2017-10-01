package com.model.dao;

import com.model.Shows;
import com.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ShowsDAO {
    public Integer addShow(Shows shows) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx = null;
//        Integer show_id = null;
//        try {
//            tx = session.beginTransaction();
//            show_id = (Integer) session.save(shows);
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//        return show_id;
//
        return 0;
    }
}
