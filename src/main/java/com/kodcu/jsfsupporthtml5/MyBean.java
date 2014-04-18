/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu.jsfsupporthtml5;

import java.util.HashMap;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlInputText;
import javax.faces.event.ComponentSystemEvent;
import java.util.Map;
import javax.annotation.PostConstruct;

/**
 *
 * @author hakdogan
 */

@ManagedBean
@ViewScoped
public class MyBean {
    
    private String isim    = "";
    private String soyisim = "";
    private String telefon = "";
    private String eposta  = "";
    private String adres   = "";

    
    private int isimDurum;
    private int soyisimDurum;
    private int telefonDurum;
    private int epostaDurum;
    private int adresDurum;
    
    private String sayac = "0";

    private HtmlInputText inputText;
    

    
    public MyBean(){}
    
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getSayac() {
        return sayac;
    }

    public void setSayac(String sayac) {
        this.sayac = sayac;
    }

    public HtmlInputText getInputText() {
        return inputText;
    }

    public void setInputText(HtmlInputText inputText) {
        this.inputText = inputText;
    }

    public void progressBar(){
        if(!isim.equals(""))
            isimDurum = 1;
        else 
            isimDurum = 0;
        
        if(!soyisim.equals(""))
            soyisimDurum = 1;
        else 
            soyisimDurum = 0;
        
        if(!telefon.equals(""))
            telefonDurum = 1;
        else 
            telefonDurum = 0;
        
        if(!eposta.equals(""))
            epostaDurum = 1;
        else 
            epostaDurum = 0;

        if(!adres.equals(""))
            adresDurum = 1;
        else 
            adresDurum = 0;
        
        sayac = String.valueOf(isimDurum + soyisimDurum + telefonDurum + epostaDurum + adresDurum);
    }

    public void addToHTML5Attribute(ComponentSystemEvent event){
        
        Map passThrough = event.getComponent().getPassThroughAttributes();
        passThrough.put("placeholder", "E-Posta adresinizi yazın");

    }
}
