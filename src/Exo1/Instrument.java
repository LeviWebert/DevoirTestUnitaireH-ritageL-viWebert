package Exo1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jacqu
 */
public class Instrument
{
    private int idInstrument;
    private String nomInstrument;
    
    public Instrument(int unId,String unNom)
    {
        idInstrument=unId;
        nomInstrument=unNom;
    }

    /**
     * @return the idInstrument
     */
    public int getIdInstrument() {
        return idInstrument;
    }

    /**
     * @return the nomInstrument
     */
    public String getNomInstrument() {
        return nomInstrument;
    }
}
