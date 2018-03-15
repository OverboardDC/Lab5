package com.training.homework.view;

import com.training.homework.entity.Message;
import com.training.homework.enums.MenuOption;

import java.util.List;

public class View {

    public void printGreeting(){
        printMessage(TextConstants.GREETING, AdditionalSymbols.DOT);
    }

    public void printMenu(){
        printMessage(TextConstants.MENU_HEADING, AdditionalSymbols.COLON);
        for(int i = 0; i < MenuOption.values().length; i++){
            printMessage(MenuOption.values()[i].toString());
        }
    }

    public void printMessagesList(List<Message> messages){
        printMessage(TextConstants.MESSAGES_LIST_HEADING, AdditionalSymbols.COLON);
        for(Message message : messages){
            printMessage(AdditionalSymbols.NEW_LINE, message.toString(), AdditionalSymbols.NEW_LINE, TextConstants.SEPARATOR);
        }
    }

    public void printMessageHasBeenAdded(){
        printMessage(TextConstants.MESSAGE_HAS_BEEN_ADDED);
    }

    public void printSelectMessageToRemove(){
        printMessage(TextConstants.SELECT_MESSAGE_REMOVE);
    }

    public void printMessageHasBeenRemoved(){
        printMessage(TextConstants.MESSAGE_HES_BEEN_REMOVED);
    }

    public void printSelectMessageToEdit(){
        printMessage(TextConstants.SELECT_MESSAGE_EDIT);
    }

    public void printMessageHasBeenEdited(){
        printMessage(TextConstants.MESSAGE_HAS_BEEN_EDITED);
    }

    public void printInputValue(String field){
        printMessage(TextConstants.INPUT_FIELD, AdditionalSymbols.COLON, AdditionalSymbols.SPACE, field);
    }

    public void printTheListIsEmpty(){
        printMessage(TextConstants.THE_LIST_IS_EMPTY);
    }

    public void printWrongInput(){
        printMessage(TextConstants.WRONG_INPUT);
    }

    private void printMessage(String... strings) {
        System.out.println(getConcatenatedString(strings));
    }

    private String getConcatenatedString(String... strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strings) {
            stringBuilder.append(str);
        }
        return new String(stringBuilder);
    }
}
