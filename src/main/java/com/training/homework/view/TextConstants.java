package com.training.homework.view;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * The text constants for output. Uses resource bundle
 * for localisation.
 *
 * @author Eugene Kushpii
 * @version 1.0
 */
public interface TextConstants {

    ResourceBundle bundle = ResourceBundle.getBundle(GlobalConstants.GLOBAL_MESSAGES_BUNDLE_NAME,
            new Locale(GlobalConstants.GLOBAL_LANGUAGE));

    String GREETING = bundle.getString("greeting");
    String MESSAGES_LIST_HEADING = bundle.getString("messages.list.heading");
    String MESSAGE_HAS_BEEN_ADDED = bundle.getString("message.has.been.added");
    String SELECT_MESSAGE_EDIT = bundle.getString("select.message.edit");
    String MESSAGE_HAS_BEEN_EDITED = bundle.getString("message.has.been.edited");
    String SELECT_MESSAGE_REMOVE = bundle.getString("select.message.remove");
    String MESSAGE_HES_BEEN_REMOVED = bundle.getString("message.has.been.removed");

    String MENU_HEADING = bundle.getString("menu.heading");
    String MENU_VIEW_MESSAGES = bundle.getString("menu,view.messages");
    String MENU_ADD_MESSAGE = bundle.getString("menu.add.message");
    String MENU_EDIT_MESSAGE = bundle.getString("menu.edit.message");
    String MENU_REMOVE_MESSAGE = bundle.getString("menu.remove.message");
    String MENU_EXIT = bundle.getString("menu.exit");

    String INPUT_FIELD = bundle.getString("input.field");
    String WRONG_INPUT = bundle.getString("wrong.input");
    String THE_LIST_IS_EMPTY = bundle.getString("the.list.is.empty");

    String MESSAGE_HEADING = bundle.getString("message.heading");
    String ID_FIELD = bundle.getString("id.field");
    String AUTHOR_FIELD = bundle.getString("author.field");
    String TOPIC_FIELD = bundle.getString("topic.field");
    String TEXT_FIELD = bundle.getString("text.field");
    String CREATION_DATE_TIME = bundle.getString("creation.date.time");
    String LAST_EDIT_DATE_TIME = bundle.getString("last.edit.date.time");

    String SEPARATOR = "============================================================";
}
