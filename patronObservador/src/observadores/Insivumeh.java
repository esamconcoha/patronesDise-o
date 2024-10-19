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
public class Insivumeh implements Observador {
        private float temperatura;
    private float presion;
    private float humedad;
    private sujeto sujeto;

    public Insivumeh(sujeto sujeto) {
        this.sujeto = sujeto;
        sujeto.regsitrarObservador(this);
    }
    
    @Override
    public void actualizar(float temperatura, float humedad, float presion) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
        visualizar();
    }
    
    public void visualizar() {
        System.out.println("Condiciones climaticas Insivumeh: " +
                    " Temperatura: " + this.temperatura+
                    " Humedad: " + this.humedad + 
                    " Presion: " + this.presion);
    }
    
}
