package com.clientui.clientui.beans;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AbbonnementBean {
    private int id;

    private Date date_debut;
    private Date date_exp;
    private String type;
    private int passager_id;
    private float price;
    private int RFID_nbr;

    public AbbonnementBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate_debut() {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date_debut);
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public String getDate_exp() {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        return format.format(date_exp);
    }

    public void setDate_exp(Date date_exp) {
        this.date_exp = date_exp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPassager_id() {
        return passager_id;
    }

    public void setPassager_id(int passager_id) {
        this.passager_id = passager_id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getRFID_nbr() {
        return RFID_nbr;
    }

    public void setRFID_nbr(int RFID_nbr) {
        this.RFID_nbr = RFID_nbr;
    }
}
