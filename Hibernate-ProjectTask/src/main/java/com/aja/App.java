package com.aja;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aja.Entity.Client;
import com.aja.Entity.Employee;
import com.aja.Entity.Project;
import com.aja.Entity.Task;


public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
       cfg.configure();
       SessionFactory Factory = cfg.buildSessionFactory();
       Session ses = Factory.openSession();
       Transaction txt = ses.beginTransaction();
       
       Client client = new Client();
       client.setClientName("Accenture");
       client.setEmail("abc@accenture.com");
       client.setPhone("9876543210");

       Project project = new Project();
       project.setProjectName("CRM Development");
       project.setProjectCode("CRM001");

       Employee employee = new Employee();
       employee.setEmployeeName("Ravi");
       employee.setEmail("ravi@company.com");
       employee.setDesignation("Java Developer");

       Task task1 = new Task();
       task1.setTaskName("Implement Login API");
       task1.setStatus("IN_PROGRESS");

       Task task2 = new Task();
       task2.setTaskName("User Registration");
       task2.setStatus("TODO");

      
       
       
    }
}
