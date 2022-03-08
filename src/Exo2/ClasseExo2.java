/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo2;

/**
 *
 * @author jbuffeteau
 */
public class ClasseExo2
{
    public static double CalculerForfait(boolean licencie, int age,boolean carteNeige, boolean assurance)
    {
        double prixForfait=0;
        if(licencie==false)
        {
            if(age>=12)
            {
                prixForfait=30;
            }
            else
            {
                prixForfait=20;
            }
        }
        else
        {
            prixForfait=13;
        }
        
        if(carteNeige==true)
        {
            prixForfait=prixForfait*0.9;
        }
        
        if(assurance==true)
        {
            prixForfait=prixForfait+3;
        }
        
        return prixForfait;
    }
}
