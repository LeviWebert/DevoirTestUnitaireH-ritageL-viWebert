package Exo1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jacqu
 */
public class CoursIndividuel extends Cours
{
    private Instrument leInstrument;
    
    public CoursIndividuel(int unId, String unNom,int unPrix,Instrument unInstrument)
    {
        super(unId, unNom, unPrix);
        leInstrument=unInstrument;
    }

    /**
     * @return the leInstrument
     */
    public Instrument getLeInstrument() {
        return leInstrument;
    }
    
    public int getPrixCours(){
        if(leInstrument.getNomInstrument()=="guitare")
        {
            return super.getPrixCours()+5;
        }
        else
        {
            return super.getPrixCours()+7;
        }
    }
}

