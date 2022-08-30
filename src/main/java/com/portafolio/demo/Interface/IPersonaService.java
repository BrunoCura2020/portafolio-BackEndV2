package com.portafolio.demo.Interface;

import com.portafolio.demo.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de persona
    public void savePersona(Persona persona);
    
    //Eliminar un ibjeto persona por ID
    public void deletePersona(Long id);
    
    //Buscar por persona por ID
    public Persona findPersona(Long id);
    
}
