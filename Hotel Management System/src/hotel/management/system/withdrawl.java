/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener{
    JButton withdraw,back;
    JTextField amt;
    String pinnumber;
    Withdrawl(String pinnumber)
    {
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2= i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel t= new JLabel("Enter the amount you want to Withdraw");
        t.setForeground(Color.WHITE);
        t.setFont(new Font("System", Font.BOLD,16));
        t.setBounds(170,300,400,20);
        image.add(t);
        
        amt= new JTextField();
        amt.setFont(new Font("Raleway",Font.BOLD,22));
        amt.setBounds(170,350,320,20);
        image.add(amt);
        
        withdraw= new JButton("withdraw");
        withdraw.setBounds(355,485,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        back= new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==withdraw)
        {
            String num=amt.getText();
            Date dt=new Date();
            if(num.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to withdraw");
                
            }
            else{
                try{
                Conn c=new Conn();
                String query= "insert into bank values('"+pinnumber+"','"+dt+"','Withdrawl','"+num+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+num+" withdraw Successfully");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                }
                catch(Exception e)
                {e.printStackTrace();
            }   
            
        }
        }
        else if(ae.getSource()==back)
        {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
        public static void main(String args[])
        {
            new Withdrawl("");
        }
        
 /*
        Transactions page
        
        Jbutton withdrawl;
        
        //actionPerformed function
        else if(ae.getSource()== withdrawl)
        {
            setVisible(false);
        new Withdrawl(pinnumber).setVisible(true);
        }
        */
}