package com.portfolio.PortfolioGR.Repository;

import com.portfolio.PortfolioGR.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfacePersonaRepository extends JpaRepository<Persona, Long>{
    
}
