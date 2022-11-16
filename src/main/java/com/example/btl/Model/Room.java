package com.example.btl.Model;

import com.example.btl.Base.BaseModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "room")
@NoArgsConstructor
@Getter
@Setter
public class Room extends BaseModel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private Collection<Schedule> scheduleRoom;
}
