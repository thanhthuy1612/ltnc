package com.example.btl.Model;

import com.example.btl.Base.BaseModel;
import com.example.btl.Utils.AES;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Collection;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class Users extends BaseModel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String fullName;
    private Integer gender;
    private ZonedDateTime birthday;
    private Integer type;
    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private Collection<Ticket> ticketUser;
    public void setPassword(String password) {
        this.password = AES.encrypt(password);
    }
}
