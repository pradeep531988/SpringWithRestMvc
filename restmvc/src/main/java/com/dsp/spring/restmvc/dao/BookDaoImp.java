package com.dsp.spring.restmvc.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dsp.spring.restmvc.model.Book;

/**
 * 
 * @author psubrama
 *
 */
@Repository
public class BookDaoImp implements IBookDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public long save(Book book) {
        sessionFactory.getCurrentSession().save(book);
        return book.getId();
    }
    
    public Book get(long id) {
        return sessionFactory.getCurrentSession().get(Book.class, id);
    }
    
    public List<Book> list() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Book> cq = cb.createQuery(Book.class);
        Root<Book> root = cq.from(Book.class);
        cq.select(root);
        Query<Book> query = session.createQuery(cq);
        return query.getResultList();
    }
    
    public void update(long id, Book book) {
        Session session = sessionFactory.getCurrentSession();
        Book book2 = session.byId(Book.class).load(id);
        book2.setTitle(book.getTitle());
        book2.setAuthor(book.getAuthor());
        session.flush();
    }
    
    public void delete(long id) {
        Session session = sessionFactory.getCurrentSession();
        Book book = session.byId(Book.class).load(id);
        session.delete(book);
    }
    
}
