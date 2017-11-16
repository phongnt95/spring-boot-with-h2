package com.example.demo.service.impl;

import com.example.demo.dao.PeopleDao;
import com.example.demo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleDao userDao;

    @Override
    public List getPeopleDetails() {
        return userDao.getPeopleDetails();
    }
}
