package org.example.server.model.repository;

import org.example.server.model.entities.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface SpecializationRepository extends JpaRepository<Specialization, Integer> {
    ArrayList<Specialization> findAll();

    Specialization findByIdSpecialization(Integer idSpecialization);
}
