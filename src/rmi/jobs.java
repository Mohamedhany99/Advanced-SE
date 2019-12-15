/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author lenovo
 */
public class jobs extends UnicastRemoteObject implements CalculatorInterface{
    DB s = new DB();
    String jobName;
    String JobDesc;
    String Age;
    String Gender;
    String Salary;

    public jobs(String jobName, String JobDesc, String Age, String Gender, String Salary) throws RemoteException{
        this.jobName = jobName;
        this.JobDesc = JobDesc;
        this.Age = Age;
        this.Gender = Gender;
        this.Salary = Salary;
    }
    public jobs() throws RemoteException{}
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobDesc() {
        return JobDesc;
    }

    public void setJobDesc(String JobDesc) {
        this.JobDesc = JobDesc;
    }


    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

  
    
}
