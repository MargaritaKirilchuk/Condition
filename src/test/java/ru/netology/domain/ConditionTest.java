package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {

    @Test
    void increaseCurrentTemperatureBelowMax() {
        Condition condition = new Condition();
        condition.setCurrentTemperature(25);
        condition.setMaxTemperature(100);
        condition.increaseCurrentTemperature(condition.getCurrentTemperature());

        assertEquals (26, condition.getCurrentTemperature());


    }

    @Test
    void increaseCurrentTemperatureAboveMax() {
        Condition condition = new Condition();
        condition.setCurrentTemperature(120);
        condition.setMaxTemperature(100);
        condition.increaseCurrentTemperature(condition.getCurrentTemperature());

        assertEquals (120, condition.getCurrentTemperature());


    }

    @Test
    void decreaseCurrentTemperatureAboveMin() {
        Condition condition = new Condition();
        condition.setCurrentTemperature(-25);
        condition.setMinTemperature(-100);
        condition.decreaseCurrentTemperature(condition.getCurrentTemperature());

        assertEquals (-26, condition.getCurrentTemperature());


    }

    @Test
    void decreaseCurrentTemperatureUnderMin() {
        Condition condition = new Condition();
        condition.setCurrentTemperature(-120);
        condition.setMinTemperature(-100);
        condition.decreaseCurrentTemperature(condition.getCurrentTemperature());

        assertEquals (-120, condition.getCurrentTemperature());


    }
}