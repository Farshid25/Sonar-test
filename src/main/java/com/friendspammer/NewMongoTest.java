package com.friendspammer;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import sun.security.krb5.internal.CredentialsUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javax.swing.UIManager.put;

public class NewMongoTest {

    public static void main(String[] args) {

        MongoClient mongoClient = new MongoClient("localhost", 27017);

        //MongoDatabase database = mongoClient.getDatabase("BEP");
        DB dd = mongoClient.getDB("BEP");
        System.out.println("connected with " + dd.getName());

        User user = new User();
        user.setProductID("1");
        user.setProductNaam("melk");
        user.setQuantity(4);
        user.setTotaalPrijs(10);
        List<User> users = new ArrayList<>();
        users.add(user);

    List<Integer> books = Arrays.asList(27464, 747854);
    DBObject User = new BasicDBObject("_id", "jo")
            .append("name", "Jo Bloggs")
            .append("address", new BasicDBObject("street", "123 Fake St")
                    .append("city", "Faketon")
            .append("books", books));

        DBCollection user1 = dd.getCollection("theshit");
        BasicDBObject doc1 = (BasicDBObject) new BasicDBObject("name", "farshid").
                append("age", 24).
                append("adres", "reiger").
                put("Factuurregels", User);

        //user1.insert(doc1, (DBObject) User);
        user1.insert(doc1);

        //find specifieke naam
        BasicDBObject d = new BasicDBObject("name", "farshid");
        Cursor findName = user1.find(d);
        while (findName.hasNext()){
            System.out.println(

            );
        }

        System.out.println();

        //find
        Cursor cursor = user1.find();
        while (cursor.hasNext()){
            System.out.println(cursor.next().get("_id"));
        }

        }}


            //"mongodb://localhost:27017"));
//    DB database = mongoClient.getDB("bep-project");
//    DBCollection collectio = database.getCollection("user1");


//    List<Integer> books = Arrays.asList(27464, 747854);
//    DBObject person = new BasicDBObject("_id", "jo")
//            .append("name", "Jo Bloggs")
//            .append("address", new BasicDBObject("street", "123 Fake St")
//                    .append("city", "Faketon")
//                    .append("state", "MA")
//                    .append("zip", 12345))
//            .append("books", books);
//
//    MongoClient mongoClient = new MongoClient();
//    DB database = mongoClient.getDB("Examples");
//    DBCollection collection = database.getCollection("people");
//
//collection.insert(person);

