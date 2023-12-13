
package com.mycompany.concesionaria.persistencia;

import com.mycompany.concesionaria.logica.Automovil;
import com.mycompany.concesionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void agregarAutomovil(Automovil nuevo) {       
        autoJpa.create(nuevo);     
    }

    public List<Automovil> traerAutosBD() {       
        return autoJpa.findAutomovilEntities();      
    }

    public void BorrarAutoBD(int idAuto){
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAutoBD(int idAuto) {
        return autoJpa.findAutomovil(idAuto);
    }

    public void modificarAutoBD(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
