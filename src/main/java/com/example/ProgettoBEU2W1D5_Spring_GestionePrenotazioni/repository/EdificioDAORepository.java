package com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.repository;

import com.example.ProgettoBEU2W1D5_Spring_GestionePrenotazioni.model.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioDAORepository extends JpaRepository<Edificio, Long> {

}
