package br.com.isaac.jjrentalcar.server;

import java.util.Date;

/**
 * Created by Qualidade on 19/04/2016.
 */
public class Fornecedor {

    private Date regDate;
    private int key;
    private String nameReason, nameFantasy;
    private boolean juriPerson, fisPerson;
    private String cpf, rg, insMun, insSufama, cep, adress, district, city, state, codPhone, phone, phone2, email, homePAge, personContact;


    public Fornecedor(String nameReason, String nameFantasy, boolean juriPerson, boolean fisPerson, String rg,
                      String cpf , String insMun, String insSufama, String cep, String adress, String district,
                      String city, String state, String codPhone, String phone, String phone2, String email,
                      String homePAge, String personContact) {

        this.nameReason = nameReason;
        this.nameFantasy = nameFantasy;
        this.juriPerson = juriPerson;
        this.fisPerson = fisPerson;
        this.rg = rg;
        this.cpf = cpf;
        this.insMun = insMun;
        this.insSufama = insSufama;
        this.cep = cep;
        this.adress = adress;
        this.district = district;
        this.city = city;
        this.state = state;
        this.codPhone = codPhone;
        this.phone = phone;
        this.phone2 = phone2;
        this.email = email;
        this.homePAge = homePAge;
        this.personContact = personContact;
    }

    public String getPersonContact() {
        return personContact;
    }

    public void setPersonContact(String personContact) {
        this.personContact = personContact;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getNameReason() {
        return nameReason;
    }

    public void setNameReason(String nameReason) {
        this.nameReason = nameReason;
    }

    public String getNameFantasy() {
        return nameFantasy;
    }

    public void setNameFantasy(String nameFantasy) {
        this.nameFantasy = nameFantasy;
    }

    public boolean isJuriPerson() {
        return juriPerson;
    }

    public void setJuriPerson(boolean juriPerson) {
        this.juriPerson = juriPerson;
    }

    public boolean isFisPerson() {
        return fisPerson;
    }

    public void setFisPerson(boolean fisPerson) {
        this.fisPerson = fisPerson;
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

    public String getInsMun() {
        return insMun;
    }

    public void setInsMun(String insMun) {
        this.insMun = insMun;
    }

    public String getInsSufama() {
        return insSufama;
    }

    public void setInsSufama(String insSufama) {
        this.insSufama = insSufama;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCodPhone() {
        return codPhone;
    }

    public void setCodPhone(String codPhone) {
        this.codPhone = codPhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomePAge() {
        return homePAge;
    }

    public void setHomePAge(String homePAge) {
        this.homePAge = homePAge;
    }
}
