package com.example.btl.controller;

import com.example.btl.Base.BaseController;
import com.example.btl.model.Ticket;
import com.example.btl.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@RestController
@RequestMapping(value = "/ticket")
@CrossOrigin(allowedHeaders = "*")
public class TicketController extends BaseController<Ticket, TicketRepository> {
    @Autowired
    public TicketRepository repository;

    @Override
    public TicketRepository get() {
        return repository;
    }
    @GetMapping(path = "/findByRowAndColumn")
    public ResponseEntity<?> findByRowAndColumn(@RequestParam(name="rowTicket", required = false) Integer rowTicket, @RequestParam(name="columnTicket",required = false) Integer columnTicket, HttpServletRequest request){
        return repository.findByRowColumn(rowTicket,columnTicket).isPresent()?ResponseEntity.ok(repository.findByRowColumn(rowTicket,columnTicket).get()):ResponseEntity.ok(Optional.empty());
    }
}
