package com.training.homework.enums;

import com.training.homework.view.AdditionalSymbols;
import com.training.homework.view.TextConstants;

/**
 * This enum contains menu options(number and name).
 * Allows to add and remove by necessity new menu options easy and fast,
 * also allows to output it conveniently.
 *
 * @author Eugene Kushpii
 * @version 1.0
 */
public enum MenuOption {

    VIEW_MESSAGES(1, TextConstants.MENU_VIEW_MESSAGES),
    ADD_MESSAGE(2, TextConstants.MENU_ADD_MESSAGE),
    EDIT_MESSAGE(3, TextConstants.MENU_EDIT_MESSAGE),
    REMOVE_MESSAGE(4, TextConstants.MENU_REMOVE_MESSAGE),
    EXIT(5, TextConstants.MENU_EXIT);

    private final int optionNumber;
    private final String optionValue;

    MenuOption(int optionNumber, String optionValue) {
        this.optionNumber = optionNumber;
        this.optionValue = optionValue;
    }


    public int getOptionNumber() {
        return optionNumber;
    }

    public String getOptionValue() {
        return optionValue;
    }

    @Override
    public String toString() {
        return optionNumber + AdditionalSymbols.SPACE +
                AdditionalSymbols.DASH + AdditionalSymbols.SPACE +
                optionValue;
    }
}
