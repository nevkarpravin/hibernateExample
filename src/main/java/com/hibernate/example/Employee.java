package com.hibernate.example;

import javax.persistence.*;

@Entity
@Table(name="Employee")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)  --- Single Table / Table per hierarchy
//@DiscriminatorColumn(name="Emp_type", discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue(value = "Employee")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)  --- Table Per Class
@Inheritance(strategy = InheritanceType.JOINED)    // Table Per Subclass
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
