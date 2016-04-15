package br.com.isaac.jjrentalcar.server;

import java.util.Calendar;

/**
 * Created by Qualidade on 14/04/2016.
 */
public class Driver {

    private String key, name, cpf, rg, adress, district, city, cep, state, phoneCode, phone1, phone2;
    private boolean status;


    public Driver() {
        super();
    }

    public Driver(String name, String cpf, String rg, String adress,
                  String district, String city, String state, String cep, String phoneCode,
                  String phone1, String phone2, boolean status) {
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.adress = adress;
        this.district = district;
        this.city = city;
        this.state = state;
        this.cep = cep;
        this.phoneCode = phoneCode;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.status = status;
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
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

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
