package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        Scanner sc=new Scanner(System.in);
        String url = "jdbc:postgresql://localhost:5432/dummy";
        String username="postgres";
        String password="devine143";
        ArrayList<String> originaldata=new ArrayList<>();
        ArrayList<String> updateddata=new ArrayList<>();
        Connection connection=DriverManager.getConnection(url,username,password);
        System.out.println("Connection Established");
        Statement st= connection.createStatement();
        String createscript="insert into public.students values(6,'Banoth',0)";
        String updatescript="update public.students set sname='Goutham' where sid=6";
        String deletescript="delete from public.students where sid=4";
        String readupdatedquery="select * from public.students";
        st.execute(createscript);
        st.execute(updatescript);
        st.execute(deletescript);
        ResultSet updatedres=st.executeQuery(readupdatedquery);
        while(updatedres.next()) {
            updateddata.add(updatedres.getInt("sid")+" "+updatedres.getString("sname")+" "+updatedres.getInt("marks"));
        }
        System.out.println("Updated Database:-");
        for (int j = 0; j < updateddata.size(); j++) {
            System.out.println(updateddata.get(j));
        }
        connection.close();
        System.out.println("Connection Closed");
    }
}
