package com.example.btl.model;

import com.example.btl.Base.BaseModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "schedule")
@NoArgsConstructor
@Getter
@Setter
public class Schedule extends BaseModel{
    private Integer roomId;
    private Integer filmId;
    private ZonedDateTime date;
    private String nameFilm;
    private String nameRoom;
}
