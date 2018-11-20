/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.observer.main;

import javax.swing.JFrame;

/**
 *
 * @author Raj Kumar Rb
 */
public class ObserverChatApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserOne userOne=new UserOne();
        UserTwo userTwo=new UserTwo();
        userOne.addObserver(userTwo);
        userTwo.addObserver(userOne);
        initOne("Raj",userOne);
        initTwo("Kumar",userTwo);     
    }
    public static void initOne(String user,UserOne userOne){
        MessagePanelUserOne messagePanelUserOne= new MessagePanelUserOne(userOne,user);
        JFrame frame= new JFrame("Chat: "+user);
        frame.getContentPane().add(messagePanelUserOne);
        frame.setSize(300,300);
        frame.pack();
        frame.show();
    }
    
    public static void initTwo(String user,UserTwo userTwo){
        MessagePanelUserTwo messagePanelUserTwo= new MessagePanelUserTwo(userTwo,user);
        JFrame frame= new JFrame("Chat: "+user);
        frame.getContentPane().add(messagePanelUserTwo);
        frame.setSize(300,300);
        frame.pack();
        frame.show();
    }
    
}
