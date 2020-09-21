package com.example.inzynierka;

import java.io.Serializable;

public class Obiekt implements Serializable {
    String Nazwa,Miasto,Ulica,Region,Prowincja,Land,Kod,Kanton,Parafia,Województwo;

    public Obiekt(){

    }
    public Obiekt(String Nazwa,String Miasto,String Ulica,String Region,String Prowincja,String Land,String Kod,String Kanton,String Parafia,String Województwo){
        this.Ulica=Ulica;
        this.Region=Region;
        this.Nazwa=Nazwa;
        this.Miasto=Miasto;
        this.Prowincja=Prowincja;
        this.Land=Land;
        this.Kod=Kod;
        this.Kanton=Kanton;
        this.Parafia=Parafia;
        this.Województwo=Województwo;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String Nazwa) {
        this.Nazwa = Nazwa;
    }

    public String getMiasto() {
        return Miasto;
    }

    public void setMiasto(String Miasto) {
        this.Miasto = Miasto;
    }

    public String getUlica(){
        return Ulica;
    }

    public void setUlica(String Ulica) {
        this.Ulica = Ulica;
    }

    public String getRegion(){
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getProwincja() {
        return Prowincja;
    }

    public void setProwincja(String prowincja) {
        Prowincja = prowincja;
    }

    public String getLand() {return Land;}

    public void setLand(String Land) {
        Land = Land;
    }

    public String getKod() {
        return Kod;
    }

    public void setKod(String Kod) {
        Kod = Kod;
    }

    public String getKanton() {
        return Kanton;
    }

    public void setKanton(String Kanton) {
        Kanton = Kanton;
    }

    public String getParafia() {
        return Parafia;
    }

    public void setParafia(String parafia) {
        Parafia = parafia;
    }

    public String getWojewództwo() {
        return Województwo;
    }

    public void setWojewództwo(String Województwo) {
        Województwo = Województwo;
    }
}
