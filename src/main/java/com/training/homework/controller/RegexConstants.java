package com.training.homework.controller;

public interface RegexConstants {

    String MESSAGE_AUTHOR_REGEX = "[A-Za-z]{1,20}+";
    String MESSAGE_TOPIC_REGEX = "[A-Za-z0-9]{2,20}+";
    String MESSAGE_TEXT_REGEX = "[a-zA-Z0-9\\s.,!@#$%^&!?\\(\\)]{1,120}+";
}
