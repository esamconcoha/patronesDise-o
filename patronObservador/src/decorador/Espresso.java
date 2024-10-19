/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorador;

/**
 *
 * @author conco
 */
public class Espresso extends Bebida {

    public Espresso() {
        descripcion="Espresso";
    }

    
    
    @Override
    public double precio() {
       return 20.00;
    }
    
}
