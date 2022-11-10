package com.example.btl.controller;

import com.example.btl.Base.BaseController;
import com.example.btl.model.Ticket;
import com.example.btl.model.Users;
import com.example.btl.repository.TicketRepository;
import com.example.btl.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ticket")
public class TicketController extends BaseController<Ticket, TicketRepository> {
    @Autowired
    public TicketRepository repository;

    @Override
    public TicketRepository get() {
        return repository;
    }
}
