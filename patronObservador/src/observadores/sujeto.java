/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observadores;

/**
 *
 * @author conco
 */
public interface sujeto {
  public void regsitrarObservador(Observador o);
  public void eliminarObservador(Observador o);
  public void notificarObservador();
}
