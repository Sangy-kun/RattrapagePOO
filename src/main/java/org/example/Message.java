package org.example;

import java.security.Timestamp;

public class Message {
    private String text;
    private Timestamp dateHeureCreation;
    private boolean indication;

    public Message(String text, Timestamp dateHeureCreation, boolean indication) {
        this.text = text;
        this.dateHeureCreation = dateHeureCreation;
        this.indication = indication;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getDateHeureCreation() {
        return dateHeureCreation;
    }

    public void setDateHeureCreation(Timestamp dateHeureCreation) {
        this.dateHeureCreation = dateHeureCreation;
    }

    public boolean isIndication() {
        return indication;
    }

    public void setIndication(boolean indication) {
        this.indication = indication;
    }


    @Override
    public String toString() {
        return "Message : " + text + ". ( " + dateHeureCreation + ')';
    }

    public void afficherMessage() {
        if (this.indication == true) {
            System.out.println(this.toString());
        } else {
            System.out.println(this.getText());
        }
    }
}
