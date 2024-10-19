/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observadores;

import java.util.ArrayList;

/**
 *
 * @author conco
 */
public class EstacionClima implements sujeto{
    
        private float humedad;
    private float temperatura;
    private float presion;
    private ArrayList<Observador> observadores;

    public EstacionClima() {
        this.observadores = new ArrayList<>();
    }
   
    @Override
    public void regsitrarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void eliminarObservador(Observador o) {
        int i = this.observadores.indexOf(o);
        if(i >= 0 ){
            this.observadores.remove(i);
        }
    }

    @Override
    public void notificarObservador() { 
        for(Observador o: this.observadores){
            o.actualizar(temperatura, humedad, presion);
        }
    }
    
    public void setMediciones(float temperatura, float humedad, float presion){
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
        
        notificarObservador();
    }
    
}
