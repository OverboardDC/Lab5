package com.training.homework.controller;

import com.training.homework.view.GlobalConstants;

import java.util.Locale;
import java.util.ResourceBundle;

public interface RegexConstants {

    ResourceBundle bundle = ResourceBundle.getBundle(GlobalConstants.GLOBAL_REGEX_BUNDLE_NAME,
            new Locale(GlobalConstants.GLOBAL_LANGUAGE));

    String MESSAGE_AUTHOR_REGEX = bundle.getString("message.author.regex");
    String MESSAGE_TOPIC_REGEX = bundle.getString("message.topic.regex");
    String MESSAGE_TEXT_REGEX = bundle.getString("message.text.regex");
}
