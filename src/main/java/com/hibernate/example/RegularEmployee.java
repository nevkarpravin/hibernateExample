package com.hibernate.example;

import javax.persistence.*;

@Entity
//@DiscriminatorValue(value = "RegularEmployee") -- Single Table
/*@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "id")),
        @AttributeOverride(name ="name", column = @Column(name = "name"))
})*/
@PrimaryKeyJoinColumn(name = "id") // Table Per subclass
public class RegularEmployee extends Employee{

    @Column
    private int salary;
    @Column
    private String address;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
