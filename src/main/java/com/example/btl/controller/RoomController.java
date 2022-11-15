package com.example.btl.controller;

import com.example.btl.Base.BaseController;
import com.example.btl.model.Room;
import com.example.btl.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/room")
@CrossOrigin(allowedHeaders = "*")
public class RoomController extends BaseController<Room, RoomRepository> {
    @Autowired
    public RoomRepository repository;

    @Override
    public RoomRepository get() {
        return repository;
    }
}
