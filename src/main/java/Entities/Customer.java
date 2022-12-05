package Entities;

import Abstract.IEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Customer implements IEntity {
    public String firstName;
    public String lastName;
    public LocalDate dateOfBirth;
    public String nationalityId;
    public int id;

    public Customer(int id){
        this.id=id;
    }
    public Customer(String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }
}