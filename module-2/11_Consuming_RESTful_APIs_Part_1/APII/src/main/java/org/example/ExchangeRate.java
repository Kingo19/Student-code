package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class ExchangeRate {
    private String base;
    private String date;
    @JsonProperty ("time_last_updated")
    private int lastUpdated;

    @JsonProperty("rates")
    private Map<String, Double> conversionRate;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(int lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Map<String, Double> getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Map<String, Double> conversionRate) {
        this.conversionRate = conversionRate;
    }
}
