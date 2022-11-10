package com.example.btl.model;

import com.example.btl.Base.BaseModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "room")
@NoArgsConstructor
@Getter
@Setter
public class Room extends BaseModel {
    private String name;
}
