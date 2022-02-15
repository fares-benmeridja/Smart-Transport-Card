package com.clientui.clientui.beans;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PassagerBean {

    private int id;

    private String fname;
    private String lname;
    private String email;
    private String password;
    private char sex;
    private String phone;
    private String profession;
    private String addres;
    private Date birth_date;

    public int getAge(){
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return (date.getYear() - birth_date.getYear());
    }

    public String getBirth_date() {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(birth_date);
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public PassagerBean() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PassagerBean{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                '}';
    }
}
