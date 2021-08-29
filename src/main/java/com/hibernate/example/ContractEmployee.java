package com.hibernate.example;

import javax.persistence.*;

@Entity
//@DiscriminatorValue("ContractEmployee")  -- Single Table
/*@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "id")),
        @AttributeOverride(name ="name", column = @Column(name = "name"))
})*/  // Table per class /
@PrimaryKeyJoinColumn(name = "id")  // Table Per subclass
public class ContractEmployee extends Employee {

    @Column
    private int contractDuration;

    @Column
    private int payPerHour;

    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }

    public int getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(int payPerHour) {
        this.payPerHour = payPerHour;
    }
}
