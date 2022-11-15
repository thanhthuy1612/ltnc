package com.example.btl.model;

import com.example.btl.Base.BaseModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Collection;

@Entity
@Table(name = "schedule")
@NoArgsConstructor
@Getter
@Setter
public class Schedule extends BaseModel{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    //private Integer roomId;
    //private Integer filmId;
    private ZonedDateTime date;
    @ManyToOne
    @JoinColumn(name = "roomId")
    private Room room;
    @ManyToOne
    @JoinColumn(name = "filmId")
    private Film film;
    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL)
    private Collection<Ticket> ticketSchedule;
}
