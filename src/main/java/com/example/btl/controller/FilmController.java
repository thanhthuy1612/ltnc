package com.example.btl.controller;

import com.example.btl.Base.BaseController;
import com.example.btl.model.Film;
import com.example.btl.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/film")
@CrossOrigin(allowedHeaders = "*")
public class FilmController extends BaseController<Film, FilmRepository> {
    @Autowired
    public FilmRepository repository;

    @Override
    public FilmRepository get() {
        return repository;
    }
}
