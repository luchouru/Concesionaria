package com.mycompany.concesionaria.logica;
import com.mycompany.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarAutomovil(String modelo, String marca, String motor, 
            String color, String patente, int cantPuertas) {
        
        Automovil nuevo = new Automovil();
        nuevo.setModelo(modelo);
        nuevo.setMarca(marca);
        nuevo.setMotor(motor);
        nuevo.setColor(color);
        nuevo.setPatente(patente);
        nuevo.setCantPuertas(cantPuertas);
        
        controlPersis.agregarAutomovil(nuevo);
        
    }

 

    public List<Automovil> traerAutos() {
        return controlPersis.traerAutosBD();
    }

    public void borrarAuto(int idAuto) {
        controlPersis.BorrarAutoBD(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAutoBD(idAuto);
    }

    public void modificarAutomovil(Automovil auto, String modelo, String marca, 
            String motor, String color, String patente, int cantPuertas) {
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.modificarAutoBD(auto);
    }

    
    
}
