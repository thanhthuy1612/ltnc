package com.example.btl.controller;

import com.example.btl.Base.BaseController;
import com.example.btl.model.Schedule;
import com.example.btl.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/schedule")
public class ScheduleController extends BaseController<Schedule, ScheduleRepository> {
    @Autowired
    public ScheduleRepository repository;

    @Override
    public ScheduleRepository get() {
        return repository;
    }
}
