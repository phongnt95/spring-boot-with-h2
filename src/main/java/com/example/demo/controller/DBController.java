package com.example.demo.controller;


import com.example.demo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class DBController {
    @Autowired
    private PeopleService peopleService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity peopleDetails() {

        List userDetails = peopleService.getPeopleDetails();
        return new ResponseEntity(userDetails, HttpStatus.OK);
    }
}
