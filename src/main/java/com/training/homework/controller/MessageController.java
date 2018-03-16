package com.training.homework.controller;

import com.training.homework.entity.Message;
import com.training.homework.model.Model;
import com.training.homework.view.TextConstants;
import com.training.homework.view.View;

import java.util.Date;

/**
 * This class is controller which has interface
 * methods for operating with the message.
 *
 * @author Eugene Kushpii
 * @version 1.0
 */
public class MessageController {

    private Model model;
    private View view;
    private InputUtilController inputUtilController;

    MessageController(Model model, View view) {
        this.model = model;
        this.view = view;
        inputUtilController = new InputUtilController(model, view);
    }

    /**
     * This method allows user to see
     * the messages list from the model class.
     */
    public void viewMessagesList(){
        if(!model.getMessages().isEmpty()) {
            view.printMessagesList(model.getMessages());
        } else {
            view.printTheListIsEmpty();
        }
    }

    /**
     * Method adds new message to the list in
     * the model class.
     */
    public void addNewMessage(){
        model.addMessage(createNewMessage());
        view.printMessageHasBeenAdded();
    }

    /**
     * Utility method which creates new message entity
     * using user input.
     *
     * @return returns created message
     */
    private Message createNewMessage(){
        int id = model.getMessages().size() + 1;
        String author = inputAuthor();
        String topic = inputTopic();
        String text = inputText();
        Date date = new Date();
        return new Message(id, author, topic, text, date, date);
    }

    private String inputAuthor(){
        return inputUtilController.inputStringField(TextConstants.AUTHOR_FIELD, RegexConstants.MESSAGE_AUTHOR_REGEX);
    }

    private String inputTopic(){
        return inputUtilController.inputStringField(TextConstants.TOPIC_FIELD, RegexConstants.MESSAGE_TOPIC_REGEX);
    }

    private String inputText(){
        return inputUtilController.inputStringField(TextConstants.TEXT_FIELD, RegexConstants.MESSAGE_TEXT_REGEX);
    }

    /**
     * Method removes message from the list
     * by id from user input
     */
    public void removeMessage(){
        if(!model.getMessages().isEmpty()) {
            view.printSelectMessageToRemove();
            model.removeMessage(inputUtilController.inputMessageId());
            view.printMessageHasBeenRemoved();
        } else {
            view.printTheListIsEmpty();
        }
    }

    /**
     * Method allows to edit the necessary message
     * by id. Method changes only text of the message.
     */
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
