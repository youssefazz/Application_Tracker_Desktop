/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application_tracker;

import entity.User;
import forms.TestUserClient;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;

/**
 *
 * @author Youssef-pc
 */
public class Application_Tracker {

    /**
     * @param args the command line arguments
     * @throws javax.naming.NamingException
     */
    public static void main(String[] args) throws NamingException {
        //DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
        TestUserClient.lookUpUserRemote().findAll().forEach(x->{System.out.println(x);});
    }
    
}
