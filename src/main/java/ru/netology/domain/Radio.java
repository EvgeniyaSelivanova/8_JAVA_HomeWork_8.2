package ru.netology.domain;

public class Radio {

    private int currentRadio;

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int currentRadioStation) {
        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }
        if (currentRadioStation < 0) {
            currentRadioStation = 9;
        }
        this.currentRadio = currentRadioStation;
    }

    public void nextStation() {
        int radio = getCurrentRadio();
        radio++;
        setCurrentRadio(radio);
    }

    public void prevStation() {
        int radio = getCurrentRadio();
        radio--;
        setCurrentRadio(radio);
    }

}
