/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

/**
 *
 * @author Monji
 */
public class Prospect {
    private static int cptPro = 0;
    private int numprospect,cp,tel,siret,numRue,cedex;
    private String enseigne, rue,ville,pays,mail,compAdd,voie, derniereVisite;

    public Prospect() {
    }

    public Prospect(int numprospect, int cp, int tel, int siret, int numRue, int cedex, String enseigne, String rue, String ville, String pays, String mail, String compAdd, String voie, String derniereVisite) {
        this.numprospect = numprospect;
        this.cp = cp;
        this.tel = tel;
        this.siret = siret;
        this.numRue = numRue;
        this.cedex = cedex;
        this.enseigne = enseigne;
        this.rue = rue;
        this.ville = ville;
        this.pays = pays;
        this.mail = mail;
        this.compAdd = compAdd;
        this.voie = voie;
        this.derniereVisite = derniereVisite;
    }

    public int getNumprospect() {
        return numprospect;
    }

    public void setNumprospect(int numprospect) {
        this.numprospect = numprospect;
    }
    
    

    public String getDerniereVisite() {
        return derniereVisite;
    }

    public void setDerniereVisite(String derniereVisite) {
        this.derniereVisite = derniereVisite;
    }

    
    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getSiret() {
        return siret;
    }

    public void setSiret(int siret) {
        this.siret = siret;
    }

    public int getNumRue() {
        return numRue;
    }

    public void setNumRue(int numRue) {
        this.numRue = numRue;
    }

    public int getCedex() {
        return cedex;
    }

    public void setCedex(int cedex) {
        this.cedex = cedex;
    }

    public String getEnseigne() {
        return enseigne;
    }

    public void setEnseigne(String enseigne) {
        this.enseigne = enseigne;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCompAdd() {
        return compAdd;
    }

    public void setCompAdd(String compAdd) {
        this.compAdd = compAdd;
    }

    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }
    //constructeur sans numero prospect
    public Prospect(int codePostale, int tel, int siret, int numRue, int cedex, String enseigne, String rue, String ville, String pays, String mail, String compAdd, String voie, String derniereVisite ) {
        this.cp = codePostale;
        this.tel = tel;
        this.siret = siret;
        this.numRue = numRue;
        this.cedex = cedex;
        this.enseigne = enseigne;
        this.rue = rue;
        this.ville = ville;
        this.pays = pays;
        this.mail = mail;
        this.compAdd = compAdd;
        this.voie = voie;
        this.derniereVisite = derniereVisite;
        Prospect.cptPro +=1;
        this.numprospect = Prospect.cptPro;
    }
    
    
}
