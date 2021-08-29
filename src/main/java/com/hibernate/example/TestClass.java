package com.hibernate.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TestClass {

    public static void main(String[] args){
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = new Employee();
        employee.setName("EMp");

        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.setContractDuration(24);
        contractEmployee.setPayPerHour(500);
        contractEmployee.setName("ContractEmp");

        RegularEmployee regularEmployee = new RegularEmployee();
        regularEmployee.setSalary(100000);
        regularEmployee.setAddress("Pune");
        regularEmployee.setName("RegularEmp");

        session.save(employee);
        session.save(contractEmployee);
        session.save(regularEmployee);

        transaction.commit();
        session.close();
    }
}
