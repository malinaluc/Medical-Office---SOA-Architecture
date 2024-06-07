package org.example.server.model.repository;

import org.example.server.model.entities.Medic;
import org.example.server.model.entities.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface MedicRepository extends JpaRepository<Medic, Integer> {

//    @Query("select m from Medic m where m.idMedic = :idMedic")
//    Medic findByIdMedic(Integer idMedic);

    Medic findByIdMedic(Integer idMedic);

    Medic findByName(String name);

    ArrayList<Medic> findAllByIdSpecialization(Specialization idSpecialization);
}
