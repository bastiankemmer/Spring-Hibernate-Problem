package com.example.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by bastiankemmer on 22.12.16.
 */
@Entity
@Table(name = "UserModel")
public class UserModel {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;

    private String firstName;
    private String lastName;

    // etc.


    public String getId() {
        return id;
    }

    public UserModel setId(String id) {
        this.id = id;

        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserModel setFirstName(String firstName) {
        this.firstName = firstName;

        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserModel setLastName(String lastName) {
        this.lastName = lastName;

        return this;
    }
}
