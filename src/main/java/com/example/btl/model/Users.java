package com.example.btl.model;

import com.example.btl.Base.BaseModel;
import com.example.btl.Utils.AES;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Set;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class Users extends BaseModel {
    private String username;
    private String password;
    private String fullName;
    private Integer gender;
    private ZonedDateTime birthday;
    private Integer type;
    public void setPassword(String password) {
        this.password = AES.encrypt(password);
    }
    @OneToMany(mappedBy="users")
    private Set<Ticket> ticket;
}
