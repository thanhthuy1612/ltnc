package com.example.btl.Controller;

import com.example.btl.Base.BaseController;
import com.example.btl.Model.Schedule;
import com.example.btl.Repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/schedule")
@CrossOrigin(allowedHeaders = "*")
public class ScheduleController extends BaseController<Schedule, ScheduleRepository> {
    @Autowired
    public ScheduleRepository repository;

    @Override
    public ScheduleRepository get() {
        return repository;
    }
}
