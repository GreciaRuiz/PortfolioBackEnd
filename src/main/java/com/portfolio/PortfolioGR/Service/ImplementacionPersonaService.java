package com.portfolio.PortfolioGR.Service;

import com.portfolio.PortfolioGR.Entity.Persona;
import com.portfolio.PortfolioGR.Interface.InterfacePersonaService;
import com.portfolio.PortfolioGR.Repository.InterfacePersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ImplementacionPersonaService implements InterfacePersonaService {
    @Autowired 
    public InterfacePersonaRepository IPersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona= IPersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        IPersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long Id) {
        IPersonaRepository.deleteById(Id);
    }

    @Override
    public Persona findPersona(Long Id) {
        Persona persona= IPersonaRepository.findById(Id).orElse(null);
        return persona;
    }
    
}
