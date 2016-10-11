/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traitements;

import Entites.Prospect;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static toutbois.Application.p;

/**
 *
 * @author apoquet
 */
public class Bdds {
    
    public static void lireBdd(char typetable, String nomtable){
        MySQLCli mysqlCli = new MySQLCli("//localhost/toutbois", "root", "040183");//route + mot de passe
        
        if (mysqlCli.connect()){
            
            switch (typetable){
                case 'P' : 
                System.out.println("connecté");
                try {
                //va chercher tt les camps de tt le enregistrement de ma table
                ResultSet rs = mysqlCli.exec("SELECT * FROM "+nomtable);
                    if (rs != null) {
                            while (rs.next()) {
                                System.out.println("numprospect: " + rs.getInt(1)+ "CodePostale: " + rs.getInt(2)+ " tel = "+rs.getInt(3)+" numSiret = "+rs.getInt(4)+ "numRue: " + rs.getInt(5)+ " cedex = "+rs.getInt(6)+" enseigne = "+rs.getString(7)+" rue = "+rs.getString(8)+" ville= "+rs.getString(9)+" pays = "+rs.getString(10)+" mail = "+rs.getString(11)+" compadd = "+rs.getString(12)+" voie = "+rs.getString(13)+" cernierevisite = "+rs.getString(14));
                                Prospect pros = new Prospect();
                                //va chercher dans la table pour le mettre dans ma collection
                                pros.setNumprospect(rs.getInt(1));
                                pros.setCp(rs.getInt(2));
                                pros.setTel(rs.getInt(3));
                                pros.setSiret(rs.getInt(4));
                                pros.setNumRue(rs.getInt(5));
                                pros.setCedex(rs.getInt(6));
                                pros.setEnseigne(rs.getString(7));
                                pros.setRue(rs.getString(8));
                                pros.setVille(rs.getString(9));
                                pros.setPays(rs.getString(10));
                                pros.setMail(rs.getString(11));
                                pros.setCompAdd(rs.getString(12));
                                pros.setVoie(rs.getString(13));
                                pros.setDerniereVisite(rs.getString(14));
                                //ajoute le nouveau prosepct pros à ta collection
                                p.add(pros);
                            }
                            rs.next();
                    }
                }catch (SQLException ex) {
                        Logger.getLogger(MySQLCli.class.getName()).log(Level.SEVERE, null, ex);
                    }
                for(int i = 0 ; i < p.size(); i++)
                    {
                        Prospect monPro = p.get(i);
                        System.out.println("numprospect = "+monPro.getNumprospect()+"CodePostal = "+monPro.getCp()+" tel = "+monPro.getTel()+" numSiret = "+monPro.getSiret()+" numRue = "+monPro.getNumRue()+" cedex = "+monPro.getCedex()+" enseigne = "+monPro.getEnseigne()+" rue= "+monPro.getRue()+
                                " ville = "+monPro.getVille()+" pays = "+monPro.getPays()+" mail = "+monPro.getMail()+" compadd = "+monPro.getCompAdd()+" voie = "+monPro.getVoie()+" derniereVisite = "+monPro.getDerniereVisite());
                    } 
             break;
            }
        }else {
            System.out.println("Mysql connection failed !!!");
        }
        mysqlCli.close();
    }
    
    public static void ecrireBdd(char typetable, String nomtable) throws IOException {
        //crée un nouvel objet mysqlcli
        MySQLCli mysqlCli = new MySQLCli("//localhost/toutbois", "root", "040183");//route + mot de passe
        if (mysqlCli.connect()){
            switch (typetable){
                case 'P' : 
                    /*String query = "delete from `"+nomtable+"`;"; 
                    mysqlCli.update(query);
                     for(int i = 0 ; i < p.size(); i++)
                    {
                        Prospect monPro = p.get(i);
                       System.out.println("numprospect = "+monPro.getNumprospect()+"CodePostale = "+monPro.getCp()+" tel = "+monPro.getTel()+" numSiret = "+monPro.getSiret()+" numRue = "+monPro.getNumRue()+" cedex = "+monPro.getCedex()+" enseigne = "+monPro.getEnseigne()+" rue= "+monPro.getRue()+
                                " ville = "+monPro.getVille()+" pays = "+monPro.getPays()+" mail = "+monPro.getMail()+" compadd = "+monPro.getCompAdd()+" voie = "+monPro.getVoie()+" derniereVisite = "+monPro.getDerniereVisite());
                        try 
                        { 
                            // Execution de la requête, insert les donéées dans ta table sql 
                            query = "INSERT INTO `"+nomtable+"` (CodePostalePro, telPro, numSiretPro, numRuePro,cedexPro,enseignePro,ruePro, villePro, paysPro, mailPro, compaddPro, voiePro, derniereVisitePro) "
                                    + "VALUES ("+monPro.getCp()+",'"+monPro.getTel()+"','"+monPro.getSiret()+"','"+monPro.getNumRue()+"','"+monPro.getCedex()+"','"+monPro.getEnseigne()+"','"+monPro.getRue()+"','"+monPro.getVille()+"','"+monPro.getPays()+"',"
                                    + "'"+monPro.getMail()+"','"+monPro.getCompAdd()+"','"+monPro.getVoie()+"','"+monPro.getDerniereVisite()+"');"; 
                            System.out.println (query);
                            int nbMaj = mysqlCli.update(query); 
                        } 
                        catch (Exception d) 
                        { 
                            System.out.println ("Probleme de requete"); 
                        } 
                    }*/
                    
                        
            break;
            }
            mysqlCli.close();
        }else {
            System.out.println("Mysql connection failed !!!");
        }
    }
    //methode pour ecrire  dans la base de donées, avec pros = un objet prospect a ajouter à la base
    public static void ecrireBdd(char typetable, String nomtable,Prospect pros)throws IOException
    {
        MySQLCli mysqlCli = new MySQLCli("//localhost/toutbois", "root", "040183");//route + mot de passe
        if (mysqlCli.connect()){
            switch (typetable){
                case 'P' :
         try 
                        {
        String query;
                    query = "INSERT INTO `"+nomtable+"` (CodePostal, tel, numSiret, numRue,cedex,enseigne,rue, ville, pays, mail, compadd, voie, derniereVisite) "
                                    + "VALUES ("+pros.getCp()+",'"+pros.getTel()+"','"+pros.getSiret()+"',"+pros.getNumRue()+","+pros.getCedex()+",'"+pros.getEnseigne()+"','"+pros.getRue()+"','"+pros.getVille()+"','"+pros.getPays()+"',"
                                    + "'"+pros.getMail()+"','"+pros.getCompAdd()+"','"+pros.getVoie()+"','"+pros.getDerniereVisite()+"');"; 
                            System.out.println (query);
                            int nbMaj = mysqlCli.update(query);
                        }
         catch(Exception ex)
         {
          System.out.println ("Probleme de requete");
         }
                            
                             break;
            }
            mysqlCli.close();
        }
    }
}
    

