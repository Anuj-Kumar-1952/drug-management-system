/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ak195
 */
public class Table {

    public static void main(String args[]) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
//        st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key ,userRole varchar(200),name varchar(200),dob varchar(50),mobilenumber varchar(50),email varchar(200),username varchar(200),password varchar(50),address varchar(200))");
//        st.executeUpdate("insert into appuser(userRole,name,dob,mobilenumber,email,username,password,address) values('Admin','Admin','19-05-2002','8295521952','ak1952002@gmail.com','Anuj','Anuj','India')");
//            st.executeUpdate("create table medicine(medicine_pk int AUTO_INCREMENT primary key ,uniqueID varchar(200),name varchar(200),companyname varchar(200),quantity bigint,price bigint)");
            st.executeUpdate("create table bill(bill_pk int AUTO_INCREMENT primary key ,billID varchar(200),billDate varchar(200),totalPaid bigint,generatedBy varchar(50))");

            JOptionPane.showMessageDialog(null, "Table Created Successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
