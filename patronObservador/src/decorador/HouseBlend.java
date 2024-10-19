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
public class HouseBlend extends Bebida {
    
    public HouseBlend(){
        descripcion="HouseBlend";
    }

    @Override
    public double precio() {
        return 18.00;
    }
}
