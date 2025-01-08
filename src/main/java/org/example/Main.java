package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Grocery grocery = new Grocery();
        grocery.startGrocery();*/

        MobilePhone mobilePhone = new MobilePhone("4218402149024",new ArrayList<>());
        mobilePhone.addNewContact(new Contact("mehmet","32532523532532"));
        mobilePhone.addNewContact(new Contact("dsadsad","34414214214"));
        mobilePhone.addNewContact(new Contact("mehmet","32532523532532"));
        mobilePhone.addNewContact(new Contact("mehmet","32532523532532"));
        mobilePhone.printContacts();
        System.out.println(mobilePhone.findContact("mehmet"));
    }
}
