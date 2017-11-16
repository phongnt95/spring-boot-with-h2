package com.example.demo.dao.impl;

import com.example.demo.dao.PeopleDao;
import com.example.demo.model.People;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class PeopleDaoImpl implements PeopleDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List getPeopleDetails() {
        Criteria criteria = entityManager.unwrap(Session.class).createCriteria(People.class);
        return criteria.list();
    }
}
