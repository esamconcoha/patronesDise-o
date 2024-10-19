/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobservador;

import decorador.Bebida;
import decorador.CremaChantilli;
import decorador.Espresso;
import decorador.HouseBlend;
import observadores.EstacionClima;
import observadores.Insivumeh;
import observadores.SmartPhone;

/**
 *
 * @author conco
 */
public class PatronObservador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* EstacionClima estacionClima = new EstacionClima();
        SmartPhone smartPhone = new SmartPhone(estacionClima);
        estacionClima.setMediciones(60, 42, 23);
        Insivumeh insivumeh = new Insivumeh(estacionClima);
        estacionClimna.setMediciones(22, 65, 18);*/
       Bebida houseBlend= new HouseBlend();
        System.out.println(houseBlend.getDescripcion()+ " GTQ"+ houseBlend.precio());
        houseBlend= new CremaChantilli(houseBlend);
        System.out.println(houseBlend.getDescripcion()+ " GTQ"+ houseBlend.precio());
        
        
        Bebida espresso= new Espresso();
        System.out.println(espresso.getDescripcion()+ " GTQ"+ espresso.precio());
        
        
        
    }
    
    
}
