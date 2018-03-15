package com.training.homework.controller;

import com.training.homework.entity.Message;
import com.training.homework.model.Model;
import com.training.homework.view.TextConstants;
import com.training.homework.view.View;

import java.util.Date;

public class MessageController {

    private Model model;
    private View view;
    private InputUtilController inputUtilController;

    MessageController(Model model, View view) {
        this.model = model;
        this.view = view;
        inputUtilController = new InputUtilController(model, view);
    }

    public void viewMessagesList(){
        if(!model.getMessages().isEmpty()) {
            view.printMessagesList(model.getMessages());
        } else {
            view.printTheListIsEmpty();
        }
    }

    public void addNewMessage(){
        model.addMessage(createNewMessage());
        view.printMessageHasBeenAdded();
    }

    private Message createNewMessage(){
        int id = model.getMessages().size() + 1;
        String author = inputAuthor();
        String topic = inputTopic();
        String text = inputText();
        Date date = new Date();
        return new Message(id, author, topic, text, date, date);
    }

    private String inputAuthor(){
        return inputUtilController.inputStringValue(TextConstants.AUTHOR_FIELD, RegexConstants.MESSAGE_AUTHOR_REGEX);
    }

    private String inputTopic(){
        return inputUtilController.inputStringValue(TextConstants.TOPIC_FIELD, RegexConstants.MESSAGE_TOPIC_REGEX);
    }

    private String inputText(){
        return inputUtilController.inputStringValue(TextConstants.TEXT_FIELD, RegexConstants.MESSAGE_TEXT_REGEX);
    }

    public void removeMessage(){
        if(!model.getMessages().isEmpty()) {
            view.printSelectMessageToRemove();
            model.removeMessage(inputUtilController.inputMessageId());
            view.printMessageHasBeenRemoved();
        } else {
            view.printTheListIsEmpty();
        }
    }

    public void editMessage(){
        if(!model.getMessages().isEmpty()) {
            view.printSelectMessageToEdit();
            int messageId = inputUtilController.inputMessageId();
            String newText = inputText();
            model.editMessage(messageId, newText);
            view.printMessageHasBeenEdited();
        } else {
            view.printTheListIsEmpty();
        }
    }

}
