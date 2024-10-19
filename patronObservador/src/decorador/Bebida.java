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
public abstract class Bebida {
    
    String descripcion=" BEBIDA DESCONOCIDA";
    
    public String getDescripcion(){
    return descripcion;
    }
    
    public abstract double precio();
}
