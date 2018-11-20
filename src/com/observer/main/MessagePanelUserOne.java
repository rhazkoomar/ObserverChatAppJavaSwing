/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.observer.main;

import java.awt.event.KeyEvent;

/**
 *
 * @author Raj Kumar Rb
 */
public class MessagePanelUserOne extends javax.swing.JPanel implements MessageHandler{

    /**
     * Creates new form MessagePanel
     */
    public MessagePanelUserOne(UserOne userOne,String user) {
        this.userOne=userOne;
        this.user=user;
        userOne.setMessageHandler(this);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bottomPanel = new javax.swing.JPanel();
        messageField = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageArea = new javax.swing.JTextArea();

        messageField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                messageFieldKeyPressed(evt);
            }
        });

        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        messageArea.setColumns(20);
        messageArea.setRows(5);
        jScrollPane1.setViewportView(messageArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        // TODO add your handling code here:
        if(!messageField.getText().equals("")){
            String message=user+ ": "+messageField.getText();
            userOne.sendMessage(message);
            messageField.setText("");
            handleMessage(message);
        }
    }//GEN-LAST:event_sendButtonActionPerformed

    private void messageFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_messageFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(!messageField.getText().equals("")){
            String message=user+ ": "+messageField.getText();
            userOne.sendMessage(message);
            messageField.setText("");
            handleMessage(message);
        }

        }
    }//GEN-LAST:event_messageFieldKeyPressed

    @Override
    public void handleMessage(String message) {
         messageArea.append("\r\n"+(String)message);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea messageArea;
    private javax.swing.JTextField messageField;
    private javax.swing.JButton sendButton;
    // End of variables declaration//GEN-END:variables
    private UserOne userOne;
    private String user;

//    @Override
//    public void update(Observable o, Object arg) {
//        messageArea.append("\r\n"+(String)arg);
//    }

}