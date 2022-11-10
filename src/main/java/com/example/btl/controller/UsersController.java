package com.example.btl.controller;

import com.example.btl.Base.BaseController;
import com.example.btl.Utils.AES;
import com.example.btl.Utils.ResourceNotFoundException;
import com.example.btl.model.Users;

import com.example.btl.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.RejectedExecutionException;


@RestController
@RequestMapping(value = "/users")
public class UsersController extends BaseController<Users,UsersRepository>{
    @Autowired
    public UsersRepository repository;

    @Override
    public UsersRepository get() {
        return repository;
    }
    @GetMapping(path = "/findByUsernameAndPassword")
    public ResponseEntity<?> findByUserNameAndPassword(@RequestParam(name="username", required = false) String username, @RequestParam(name="password",required = false) String password, HttpServletRequest request){
        password = AES.encrypt(password);
        return repository.findByUsernameAndPassword(username,password).isPresent()?ResponseEntity.ok(repository.findByUsernameAndPassword(username,password).get()):ResponseEntity.ok(Optional.empty());
    }
    @GetMapping(path = "/findByUsername")
    public ResponseEntity<?> findByUsername(@RequestParam(name="username", required = false) String username, HttpServletRequest request){
        return repository.getUsersByUsername(username).isPresent()?ResponseEntity.ok(repository.getUsersByUsername(username).get()):ResponseEntity.ok(Optional.empty());
    }
}
