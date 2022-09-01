package com.cheng;

import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import org.apache.commons.io.FileUtils;


public class VulnerableCheng {
    public void fishyConnection() throws SQLException 
    {
        // Using an empty password to access a database
        Connection connnection = DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "login", "");;
    }

    //I/O function calls should not be vulnerable to path injection attacks
    public void pathInjection(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String file = req.getParameter("file");
    
        File fileUnsafe = new File(file);
        try {
          FileUtils.forceDelete(fileUnsafe); // Noncompliant
        }
        catch(IOException ex){
          System.out.println (ex.toString());
        }
    }

    //Dynamic code execution should not be vulnerable to injection attacks
    protected void codeInjection(HttpServletRequest req, HttpServletResponse resp) throws Exception {
      String input = req.getParameter("input");
    
      ScriptEngineManager manager = new ScriptEngineManager();
      ScriptEngine engine = manager.getEngineByName("JavaScript");
      engine.eval(input); // Noncompliant
    }

    //NoSQL operations should not be vulnerable to injection attacks
    public void nosqlInjection(HttpServletRequest req, HttpServletResponse resp) throws UnknownHostException
    {
        String input = req.getParameter("input");

        MongoClient mongoClient = new MongoClient();
        DB database             = mongoClient.getDB("exampleDatabase");
        DBCollection collection = database.getCollection("exampleCollection");
        BasicDBObject query     = new BasicDBObject();

        query.put("$where", "this.field == \"" + input + "\""); // Noncompliant
    }
    
}
