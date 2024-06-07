package org.example.server.model.repository;

import org.example.server.model.entities.Cv;
import org.example.server.model.entities.Medic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvRepository extends JpaRepository<Cv, Integer> {
    Cv findByIdMedic(Medic idMedic);
}
