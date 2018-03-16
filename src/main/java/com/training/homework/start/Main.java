package com.training.homework.start;

import com.training.homework.controller.MenuController;
import com.training.homework.model.Model;
import com.training.homework.view.View;

/**
 * The class which starts the application.
 *
 * @author Eugene Kushpii
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        MenuController menuController = new MenuController(model, view);
        menuController.startProgram();
    }
}
