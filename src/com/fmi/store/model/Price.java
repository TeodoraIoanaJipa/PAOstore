package com.fmi.store.model;

import java.util.Date;
import java.util.Objects;

public class Price {
    private Double price;
    private Date startForm;
    private Date endFrom;

    public Price(Double price, Date startForm, Date endFrom) {
        this.price = price;
        this.startForm = startForm;
        this.endFrom = endFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price1 = (Price) o;
        return Objects.equals(price, price1.price) &&
                Objects.equals(startForm, price1.startForm) &&
                Objects.equals(endFrom, price1.endFrom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, startForm, endFrom);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getStartForm() {
        return startForm;
    }

    public void setStartForm(Date startForm) {
        this.startForm = startForm;
    }

    public Date getEndFrom() {
        return endFrom;
    }

    public void setEndFrom(Date endFrom) {
        this.endFrom = endFrom;
    }
}
