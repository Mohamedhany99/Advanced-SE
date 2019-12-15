/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import com.mongodb.MongoClient;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * 
 */
public class RMIServer {
        public static void main(String[] args) {
        try {
            
            // My remote object [Skeleton]
            CalculatorInterface c = new emp();
            
            // My RMI Registry
            Registry registry = LocateRegistry.createRegistry(1097);
            
            //Add my object to the RMI Registry
            registry.bind("calc", c);
            System.out.println("My calculator is ready...");   
        } catch (Exception ex) {
           System.out.println("Exception occured"+ex);
        }   
    }
}

