/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrey
 */


import javax.swing.*;
public class mainwindow extends JFrame {
    public mainwindow(){
        setTitle("змейка");
        setSize(320,345);
        setLocation(400,400);
        add(new gamefield());
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        
}
    public static void main(String[] args) {
        mainwindow mw=new mainwindow(); 
    }
  
}
