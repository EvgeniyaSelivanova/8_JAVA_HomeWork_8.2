package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


//    Testing of changes radio stations

    @Test
    public void getCurrentRadio() {
        Radio RadioObject = new Radio();
        assertEquals(0, RadioObject.getCurrentRadio());
    }

    @Test
    public void setCurrentRadio() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentRadio(5);
        assertEquals(5, RadioObject.getCurrentRadio());
    }

    @Test
    public void setMaxBorderCurrentRadio() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentRadio(9);
        assertEquals(9, RadioObject.getCurrentRadio());
    }

    @Test
    public void setMinBorderCurrentRadio() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentRadio(0);
        assertEquals(0, RadioObject.getCurrentRadio());
    }

    @Test
    public void setUpperBorderCurrentRadio() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentRadio(10);
        assertEquals(0, RadioObject.getCurrentRadio());
    }

    @Test
    public void setBelowBorderCurrentRadio() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentRadio(-1);
        assertEquals(9, RadioObject.getCurrentRadio());
    }

    @Test
    public void changeUpperCurrentRadio() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentRadio(5);
        RadioObject.nextStation();
        assertEquals(6, RadioObject.getCurrentRadio());
    }

    @Test
    public void changeBelowCurrentRadio() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentRadio(5);
        RadioObject.prevStation();
        assertEquals(4, RadioObject.getCurrentRadio());
    }

    @Test
    public void changeUpperMaxBorderRadio() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentRadio(9);
        RadioObject.nextStation();
        assertEquals(0, RadioObject.getCurrentRadio());
    }

    @Test
    public void changeBelowMinBorderRadio() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentRadio(0);
        RadioObject.prevStation();
        assertEquals(9, RadioObject.getCurrentRadio());
    }
}