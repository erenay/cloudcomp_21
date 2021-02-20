package com.opentechnica.demo;

import java.io.Serializable;

class Response implements Serializable {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}