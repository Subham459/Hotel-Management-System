package hotel.management.system;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Reception extends JFrame implements ActionListener{

   JButton newcustomer;
   JButton room, dept, allemp,manager,customer,searchroom,update, rstatus,pickup;
    Reception()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        newcustomer= new JButton("New Customer Form");
        newcustomer.setBounds(10,30,200,30);
        newcustomer.setBackground(Color.BLACK);
        newcustomer.setForeground(Color.WHITE);
        newcustomer.addActionListener(this);
        add(newcustomer);
        
        room= new JButton("Rooms");
        room.setBounds(10,70,200,30);
        room.setBackground(Color.BLACK);
        room.setForeground(Color.WHITE);
        room.addActionListener(this);
        add(room);
        
        dept= new JButton("Department");
        dept.setBounds(10,110,200,30);
        dept.setBackground(Color.BLACK);
        dept.setForeground(Color.WHITE);
        dept.addActionListener(this);
        add(dept);
        
         allemp= new JButton("All Employee");
        allemp.setBounds(10,150,200,30);
        allemp.setBackground(Color.BLACK);
        allemp.setForeground(Color.WHITE);
        allemp.addActionListener(this);
        add(allemp);
        
        customer= new JButton("Customers Info");
        customer.setBounds(10,190,200,30);
        customer.setBackground(Color.BLACK);
        customer.setForeground(Color.WHITE);
        customer.addActionListener(this);
        add(customer);
        
        manager= new JButton("Manager Info");
        manager.setBounds(10,230,200,30);
        manager.setBackground(Color.BLACK);
        manager.setForeground(Color.WHITE);
        manager.addActionListener(this);
        add(manager);
        
        JButton checkout= new JButton("Checkout");
        checkout.setBounds(10,270,200,30);
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.WHITE);
        add(checkout);
        
        update= new JButton("Update Status");
        update.setBounds(10,310,200,30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        add(update);
        
        rstatus= new JButton("Room Status");
        rstatus.setBounds(10,350,200,30);
        rstatus.setBackground(Color.BLACK);
        rstatus.setForeground(Color.WHITE);
        rstatus.addActionListener(this);
        add(rstatus);
        
        pickup= new JButton("Pickup service");
        pickup.setBounds(10,390,200,30);
        pickup.setBackground(Color.BLACK);
        pickup.setForeground(Color.WHITE);
        pickup.addActionListener(this);
        add(pickup);
        
        searchroom= new JButton("Search Room");
        searchroom.setBounds(10,430,200,30);
        searchroom.setBackground(Color.BLACK);
        searchroom.setForeground(Color.WHITE);
        searchroom.addActionListener(this);
        add(searchroom);
        
        JButton logout= new JButton("Logout");
        logout.setBounds(10,470,200,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        add(logout);
        
        ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
        JLabel l= new JLabel(ic);
        l.setBounds(250,30,500,470);
        add(l);
        
        // Dashboard.java 
        // actionPerformed() {
        // else if(ae.getActionCommand().equals("Reception")
        //{ new Reception(); }  }
        setBounds(350,200,800,570);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()== newcustomer)
        {   setVisible(false);
            new AddCustomer();
        }
        else if(ae.getSource()== room)
        {
            setVisible(false);
            new Room();
        }
         else if(ae.getSource()== dept )
        {
            setVisible(false);
            new Department();
        }
         else if(ae.getSource()== allemp )
        {
            setVisible(false);
            new EmployeeInfo();
        }
        else if(ae.getSource()== manager )
        {
            setVisible(false);
            new ManagerInfo();
        }
        else if(ae.getSource()== customer )
        {
            setVisible(false);
            new CustomerInfo();
        }
        else if(ae.getSource()== searchroom )
        {
            setVisible(false);
            new SearchRoom();
        }
         else if(ae.getSource()== update )
        {
            setVisible(false);
            new UpdateCheck();
        }
         else if(ae.getSource()== rstatus )
        {
            setVisible(false);
            new UpdateRoom();
        }
        else if(ae.getSource()== pickup )
        {
            setVisible(false);
            new Pickup();
        }
        
        
          
    }
    public static void main(String args[])
    {
        new Reception();
        
        
    }
    
}
