package com.example.demo;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="contacts")
public class Contact {

    private long id;
    private String firstname;
    private String lastname;
    private String email;
    private String cellno;

    @Id
    @GeneratedValue
    @Column(name="id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "first_name")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Column(name = "last_name")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "cell_no")
    public String getCellno() {
        return cellno;
    }

    public void setCellno(String cellno) {
        this.cellno = cellno;
    }




}
