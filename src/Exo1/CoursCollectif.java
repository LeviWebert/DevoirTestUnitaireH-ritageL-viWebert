package Exo1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jacqu
 */
public class CoursCollectif extends Cours 
{
    private int nbPlaces;
    
    public CoursCollectif(int unId, String unNom,int unPrix,int unNbPlaces)
    {
        super(unId, unNom, unPrix);
        nbPlaces=unNbPlaces;
    }

    /**
     * @return the nbPlaces
     */
    public int getNbPlaces() {
        return nbPlaces;
    }

    /**
     * @param nbPlaces the nbPlaces to set
     */
    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }
    
    public int getPrixCours() {
        if(nbPlaces>=10)
        {
            return super.getPrixCours()+3;
        }
        else if(nbPlaces>=5)
        {
            return super.getPrixCours()+6;
        }
        else
        {
            return super.getPrixCours()+9;
        }
        
    }
}
