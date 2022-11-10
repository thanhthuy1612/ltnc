package com.example.btl.Base;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public abstract class BaseModel {
    public BaseModel(){
    }
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
}
