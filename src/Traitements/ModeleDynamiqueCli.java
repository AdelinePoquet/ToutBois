/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traitements;

import javax.swing.table.*;
import static toutbois.Application.c;

/**
 *
 * @author ajugnon
 */
public class ModeleDynamiqueCli extends AbstractTableModel{
    
    /**
     * Défini le nom des colonnes du JTable
     */
    private final String[] entetes = {"N°","Enseigne","Ville","Tel","NumRep","Nombre Commande"};

    public ModeleDynamiqueCli() {
        super();
    }
    
    @Override
    public int getRowCount() {
        return c.size();    
    }

    @Override
    public int getColumnCount() {
        return entetes.length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return c.get(rowIndex).getNumCli();
            case 1:
                return c.get(rowIndex).getEnseigne();
            case 2:
                return c.get(rowIndex).getVille();
            case 3:
                return c.get(rowIndex).getTel();
            case 4:
                return c.get(rowIndex).getNumRep();
            case 5:
                return c.get(rowIndex).getNbCom();
            default:
                return null;
        }
    }
    
}
