/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;
import com.mongodb.MongoClient;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import org.bson.Document;
import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;


/**
 *
 * @author lenovo
 */
public class emp extends UnicastRemoteObject implements CalculatorInterface{

     DB s = new DB();
    String name;
    String password;
    String department;
    String id;
public emp() throws RemoteException {}
    public emp(String name, String password, String department, String id) throws RemoteException  {
        this.name = name;
        this.password = password;
        this.department = department;
        this.id = id;
    }
   
     
     
     
//       @Override
//public emp login(String x,String y) throws RemoteException{
//       System.out.println("My calculator is ready...222");
//   
//x = "t";
//y = "y";
//
//       emp temp22 = new emp();
//ArrayList<emp> semp = new ArrayList<emp>();
//semp =  s.getAllStudents();
//                for (int i = 0; i < semp.size(); i++) {
//                   temp22 = semp.get(i);
//                  
//                      System.out.println("My calculator is ready...");
//                }
//                return temp22;
//}


    public String getName()  throws RemoteException {
        return name;
    }

    public void setName(String name)  throws RemoteException {
        this.name = name;
    }

    public String getPassword() throws RemoteException  {
        return password;
    }

    public void setPassword(String password)  throws RemoteException {
        this.password = password;
    }

    public String getDepartment() throws RemoteException  {
        return department;
    }

    public void setDepartment(String department) throws RemoteException  {
        this.department = department;
    }

    public String getId() throws RemoteException  {
        return id;
    }

    public void setId(String id)  throws RemoteException {
        this.id = id;
    }
    
}
