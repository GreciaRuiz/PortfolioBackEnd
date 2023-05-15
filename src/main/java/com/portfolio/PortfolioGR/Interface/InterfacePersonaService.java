package com.portfolio.PortfolioGR.Interface;

import com.portfolio.PortfolioGR.Entity.Persona;
import java.util.List;

public interface InterfacePersonaService {
    public List<Persona> getPersona();
    
    public void savePersona(Persona persona);
    
    public void deletePersona(Long Id);
    
    public Persona findPersona(Long Id);
}
