package Exo1;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jacqu
 */
public class Jour
{
    private int idJour;
    private String nomJour;
    private ArrayList<Cours> lesCours;
    
    public Jour(int unId,String unNom)
    {
        idJour=unId;
        nomJour=unNom;
        lesCours= new ArrayList<>();
    }

    /**
     * @return the idJour
     */
    public int getIdJour() {
        return idJour;
    }

    /**
     * @return the nomJour
     */
    public String getNomJour() {
        return nomJour;
    }

    /**
     * @return the lesCours
     */
    public ArrayList<Cours> getLesCours() {
        return lesCours;
    }
}
