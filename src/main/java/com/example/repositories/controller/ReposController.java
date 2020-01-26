package com.example.repositories.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.repositories.domain.Repository;
import com.example.repositories.services.ReposService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;


@RestController
@RequestMapping("repositories")
public class ReposController {

    @Autowired
    ReposService reposService;

    @GetMapping("{login}")
    public List<Repository> greeting(@PathVariable("login") String login) {
        List<Repository> list = new ArrayList<>();
    try{
        list=reposService.getList(login);
    }
    catch (RuntimeException ex) {
        throw new ConstraintViolationException("error", Collections.emptySet());
    }

        return list;
    }


}