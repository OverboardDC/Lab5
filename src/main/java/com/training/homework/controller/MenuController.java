package com.training.homework.controller;

import com.training.homework.model.Model;
import com.training.homework.view.View;

import java.util.InputMismatchException;

/**
 * The class which controls the menu in the program.
 * Class gets the menu option from user input and
 * invokes the according method from MessageController
 *
 * @author Eugene Kushpii
 * @version 1.0
 */
public class MenuController {

    private Model model;
    private View view;
    private InputUtilController inputUtilController;
    private MessageController messageController;

    public MenuController(Model model, View view) {
        this.model = model;
        this.view = view;
        inputUtilController = new InputUtilController(model, view);
        messageController = new MessageController(model, view);
    }

    /**
     * This method starts the program and
     * invokes the menu method
     */
    public void startProgram() {
        view.printGreeting();
        doOperation();
    }

    private void doOperation() {
        view.printMenu();
        switch (chooseMenuOption()) {
            case 1:
                messageController.viewMessagesList();
                break;
            case 2:
                messageController.addNewMessage();
                break;
            case 3:
                messageController.editMessage();
                break;
            case 4:
                messageController.removeMessage();
                break;
            case 5:
                System.exit(0);
            default:
                throw new InputMismatchException();
        }
        doOperation();
    }

    private int chooseMenuOption() {
        return inputUtilController.inputMenuOption();
    }
}
