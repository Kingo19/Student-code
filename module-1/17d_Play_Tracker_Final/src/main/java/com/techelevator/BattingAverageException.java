package com.techelevator;

public class BattingAverageException extends Exception{

    private String customMessage;
    private Stats originalStatsObject;

    public BattingAverageException(String message, Stats originalStatsObject) {
        this.originalStatsObject = originalStatsObject;
        this.customMessage = message;
    }


    public String getCustomMessage() {
        return customMessage;
    }

    public void setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
    }

    public Stats getOriginalStatsObject() {
        return originalStatsObject;
    }

    public void setOriginalStatsObject(Stats originalStatsObject) {
        this.originalStatsObject = originalStatsObject;
    }
}
