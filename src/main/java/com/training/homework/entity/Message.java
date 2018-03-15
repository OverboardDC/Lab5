package com.training.homework.entity;

import com.training.homework.view.AdditionalSymbols;
import com.training.homework.view.GlobalConstants;
import com.training.homework.view.TextConstants;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Message implements Cloneable {

    private int id;
    private String author;
    private String topic;
    private String text;
    private Date creationDate;
    private Date lastEditDate;

    public Message(String author, String topic, String text) {
        this.author = author;
        this.topic = topic;
        this.text = text;
        creationDate = new Date();
        lastEditDate = new Date();
    }

    public Message(int id, String author, String topic, String text, Date creationDate, Date lastEditDate) {
        this.id = id;
        this.author = author;
        this.topic = topic;
        this.text = text;
        this.creationDate = creationDate;
        this.lastEditDate = lastEditDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(Date lastEditDate) {
        this.lastEditDate = lastEditDate;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return TextConstants.MESSAGE_HEADING + AdditionalSymbols.SPACE + TextConstants.ID_FIELD +
                AdditionalSymbols.COLON + AdditionalSymbols.SPACE + id + AdditionalSymbols.NEW_LINE +

                TextConstants.AUTHOR_FIELD + AdditionalSymbols.COLON +
                AdditionalSymbols.SPACE + author + AdditionalSymbols.NEW_LINE +

                TextConstants.TOPIC_FIELD + AdditionalSymbols.COLON +
                AdditionalSymbols.SPACE + topic + AdditionalSymbols.NEW_LINE +

                TextConstants.TEXT_FIELD + AdditionalSymbols.COLON +
                AdditionalSymbols.SPACE + text + AdditionalSymbols.NEW_LINE +

                TextConstants.CREATION_DATE_TIME + AdditionalSymbols.COLON +
                AdditionalSymbols.SPACE + formatDate(creationDate) + AdditionalSymbols.NEW_LINE +

                TextConstants.LAST_EDIT_DATE_TIME + AdditionalSymbols.COLON +
                AdditionalSymbols.SPACE + formatDate(lastEditDate) + AdditionalSymbols.NEW_LINE;
    }

    private String formatDate(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(GlobalConstants.DATE_TIME_PATTERN);
        return simpleDateFormat.format(date);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message = (Message) o;
        return id == message.id &&
                Objects.equals(author, message.author) &&
                Objects.equals(topic, message.topic) &&
                Objects.equals(text, message.text) &&
                Objects.equals(creationDate, message.creationDate) &&
                Objects.equals(lastEditDate, message.lastEditDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, topic, text, creationDate, lastEditDate);
    }
}
