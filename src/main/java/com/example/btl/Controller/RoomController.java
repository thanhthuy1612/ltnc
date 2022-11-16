package com.example.btl.Controller;

import com.example.btl.Base.BaseController;
import com.example.btl.Model.Room;
import com.example.btl.Repository.RoomRepository;
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
