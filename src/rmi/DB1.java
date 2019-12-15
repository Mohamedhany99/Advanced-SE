/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

/**
 *
 * 
 */
public class DB1 {

    private static MongoClient client;
    private static MongoDatabase database;
    private static MongoCollection<Document> collection;
    private static Gson gson = new Gson();
    
    
    
    
    public DB1() {
        client = new MongoClient();
        database = client.getDatabase("RS"); // Database name
        collection = database.getCollection("jobs"); // Collection name
        System.out.println("asdads");
    }

    public void insertCourse(jobs s) {
        collection.insertOne(Document.parse(gson.toJson(s)));
    }

    public void deleteStudent(String email) {
        boolean result = collection.deleteOne(Filters.eq(email)).wasAcknowledged();
        int r = (int)collection.deleteOne(Filters.eq(email)).getDeletedCount();
    }


    public ArrayList<emp> getAllStudents() {
      ArrayList<Document> docs = collection.find().into(new ArrayList<Document>());
        ArrayList<emp> s = new ArrayList<emp>();
        for (int i = 0; i < docs.size(); i++) {
            Document doc = docs.get(i);
            s.add(gson.fromJson(doc.toJson(), emp.class));
        }
        return s;
    }

  



}
