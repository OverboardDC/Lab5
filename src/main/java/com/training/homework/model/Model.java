package com.training.homework.model;

import com.training.homework.entity.Message;

import java.util.ArrayList;
import java.util.Date;

public class Model {

    private ArrayList<Message> messages;

    public Model() {
        if(messages == null) messages = new ArrayList<>();
    }

    public void addMessage(Message message){
        messages.add(message);
    }

    public void removeMessage(int id){
        messages.remove(getMessageFromList(id));
    }

    public void editMessage(int id, String newText){
        Message message = getMessageFromList(id);
        if(message != null){
            message.setText(newText);
            message.setLastEditDate(new Date());
        }
    }

    private Message getMessageFromList(int id){
        for(int i = 0; i < messages.size(); i++){
            if (messages.get(i).getId() == id){
                return messages.get(i);
            }
        }
        return null;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }
}
