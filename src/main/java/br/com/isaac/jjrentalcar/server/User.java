package br.com.isaac.jjrentalcar.server;

import java.util.Calendar;

/**
 * Created by Qualidade on 18/04/2016.
 */
public class User {

    private String login, name, adress,district, city, cep, state,phoneCode ,phone;
    private Calendar regDate;
    private int key;
    private Boolean status;

    public User(String login) {
        super();
    }

    public User(String login, String name, String adress, String district, String city, String state,String cep, String phoneCode,String phone, Boolean status) {
        this.login = login;
        this.name = name;
        this.adress = adress;
        this.district = district;
        this.city = city;
        this.state = state;
        this.cep = cep;
        this.phoneCode = phoneCode;
        this.phone = phone;
        this.status = status;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Calendar getRegDate() {
        return regDate;
    }

    public void setRegDate(Calendar regDate) {
        this.regDate = regDate;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", regDate=" + regDate +
                ", key=" + key +
                '}';
    }
}
