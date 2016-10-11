/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

/**
 *
 * @author ajugnon
 */
public class Client {
    
    private static int cptNumCli = 0;
    private int numCli,cp,tel,siret,numRep,nbCom,numRue,cedex,fax;
    private String enseigne, rue,ville,pays,mail,compAdd,voie;

    public Client() {
    }

    /**
     * Constructeur de la classe Client
     * cptNumCli est le compteur pour le Numéro du client
     * @param cp Code Postal
     * @param tel Téléphone
     * @param siret Siret
     * @param numRep Numéro Représentant
     * @param nbCom Nombre Commandes
     * @param numRue Numéro Rue
     * @param cedex Cédex
     * @param enseigne Enseigne
     * @param rue Rue
     * @param ville Ville
     * @param pays Pays
     * @param mail mail
     * @param compAdd Complément d'adresse
     * @param voie Voie
     */
    public Client(int cp, int tel, int siret, int numRep, int nbCom, int numRue, int cedex, String enseigne, String rue, String ville, String pays, String mail, String compAdd, String voie) {
        Client.cptNumCli +=1;
        this.numCli = Client.cptNumCli;
        this.cp = cp;
        this.tel = tel;
        this.siret = siret;
        this.numRep = numRep;
        this.nbCom = nbCom;
        this.numRue = numRue;
        this.cedex = cedex;
        this.enseigne = enseigne;
        this.rue = rue;
        this.ville = ville;
        this.pays = pays;
        this.mail = mail;
        this.compAdd = compAdd;
        this.voie = voie;
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


    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }

    public static int getCptNumCli() {
        return cptNumCli;
    }

    public static void setCptNumCli(int cptNumCli) {
        Client.cptNumCli = cptNumCli;
    }

    public int getNumCli() {
        return numCli;
    }

    public void setNumCli(int numCli) {
        this.numCli = numCli;
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

    public int getNumRep() {
        return numRep;
    }

    public void setNumRep(int numRep) {
        this.numRep = numRep;
    }

    public int getNbCom() {
        return nbCom;
    }

    public void setNbCom(int nbCom) {
        this.nbCom = nbCom;
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
    
    
}
