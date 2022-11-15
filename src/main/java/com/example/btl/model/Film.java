package com.example.btl.model;

import com.example.btl.Base.BaseModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "film")
@NoArgsConstructor
@Getter
@Setter
public class Film extends BaseModel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer time;
    @OneToMany(mappedBy = "film", cascade = CascadeType.ALL)
    private Collection<Schedule> scheduleFilm;
}
