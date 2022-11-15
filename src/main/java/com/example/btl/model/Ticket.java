package com.example.btl.model;

import com.example.btl.Base.BaseModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "ticket")
@NoArgsConstructor
@Getter
@Setter
public class Ticket extends BaseModel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    //private Integer userId;
    //private Integer scheduleId;
    private Integer soldOut;
    private Integer rowTicket;
    private Integer columnTicket;
    @ManyToOne
    @JoinColumn(name = "userId")
    private Users users;
    @ManyToOne
    @JoinColumn(name = "scheduleId")
    private Schedule schedule;
}
