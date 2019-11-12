package com.roifmr.spring.demos.com.roifmr.laterspring.domain;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

public class Fund {
    private long id;
    private String shortName;
    private String description;
    private BigDecimal currentValue;



    public Fund() {
        super();
        this.id = Instant.now().getEpochSecond();
        this.currentValue = BigDecimal.ZERO;
    }

    public Fund(String shortName, String description, BigDecimal currentValue) {
        this.shortName = shortName;
        this.description = description;
        this.currentValue = currentValue;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(BigDecimal currentValue) {
        this.currentValue = currentValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fund fund = (Fund) o;
        return id == fund.id &&
                Objects.equals(shortName, fund.shortName) &&
                Objects.equals(description, fund.description) &&
                Objects.equals(currentValue, fund.currentValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shortName, description, currentValue);
    }
}

