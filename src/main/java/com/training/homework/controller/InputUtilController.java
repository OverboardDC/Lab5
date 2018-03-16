package com.training.homework.controller;

import com.training.homework.enums.MenuOption;
import com.training.homework.model.Model;
import com.training.homework.view.View;

import java.util.Scanner;

/**
 * This class completely controls the user input
 * from command line. Has methods for different
 * input options
 *
 * @author Eugene Kushpii
 * @version 1.0
 */
public class InputUtilController {

    private Model model;
    private View view;
    private Scanner scanner;

    InputUtilController(Model model, View view) {
        this.model = model;
        this.view = view;
        if (scanner == null) scanner = new Scanner(System.in);
    }

    public int inputMenuOption() {
        MenuOption lastOption = MenuOption.values()[MenuOption.values().length - 1];
        MenuOption firsOption = MenuOption.values()[0];
        return inputIntValue(firsOption.getOptionNumber(), lastOption.getOptionNumber());
    }

    public String inputStringField(String field, String regex){
        return inputStringValue(field, regex);
    }

    public int inputMessageId(){
        return inputIntValue(1, model.getMessages().size());
    }

    private String inputStringValue(String field, String regex) {
        String inputValue;
        view.printInputValue(field);
        while (!(scanner.hasNext() && (inputValue = scanner.nextLine()).matches(regex))) {
            view.printWrongInput();
        }
        return inputValue;
    }

    private int inputIntValue(int firstLimit, int secondLimit) {
        int inputValue;
        while (true) {

            if (!scanner.hasNextInt()) {
                view.printWrongInput();
                scanner.next();
            }

            if ((inputValue = scanner.nextInt()) < firstLimit || inputValue > secondLimit) {
                view.printWrongInput();
                continue;
            }
            scanner.nextLine();
            break;
        }
        return inputValue;
    }
}
