package com.training.homework.controller;

import com.training.homework.enums.MenuOption;
import com.training.homework.model.Model;
import com.training.homework.view.View;

import java.util.Scanner;

public class InputUtilController {

    private Model model;
    private View view;
    private Scanner scanner;

    InputUtilController(Model model, View view) {
        this.model = model;
        this.view = view;
        if (scanner == null) scanner = new Scanner(System.in);
    }

    public String inputStringValue(String field, String regex) {
        String inputValue;
        view.printInputValue(field);
        while (!(scanner.hasNext() && (inputValue = scanner.nextLine()).matches(regex))) {
            view.printWrongInput();
        }
        return inputValue;
    }

    public int inputMenuOption() {
        MenuOption lastOption = MenuOption.values()[MenuOption.values().length - 1];
        MenuOption firsOption = MenuOption.values()[0];
        return inputIntValue(firsOption.getOptionNumber(), lastOption.getOptionNumber());
    }

    public int inputMessageId(){
        return inputIntValue(1, model.getMessages().size());
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
