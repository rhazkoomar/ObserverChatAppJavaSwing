/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.observer.main;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Raj Kumar Rb
 */
public class UserOne extends Observable implements Observer {

    private MessageHandler messageHandler;
    
//    public synchronized void onMessage(String message){
//        
//    }
     public void sendMessage(String message){
       setChanged();
       notifyObservers(new String(message));
   }
    
    @Override
    public void update(Observable o, Object arg) {
        if(messageHandler!=null){
            messageHandler.handleMessage((String)arg);
        }
    }

    public MessageHandler getMessageHandler() {
        return messageHandler;
    }

    public void setMessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }
    
}
