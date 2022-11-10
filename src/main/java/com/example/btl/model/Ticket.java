package com.example.btl.model;

import com.example.btl.Base.BaseModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "ticket")
@NoArgsConstructor
@Getter
@Setter
public class Ticket extends BaseModel {
    //private Integer userId;
    private Integer scheduleId;
    private Integer soldOut;
    private Integer rowTicket;
    private Integer columnTicket;
    @ManyToOne
    @JoinColumn(name="userId", nullable=false)
    private Users users;
}
