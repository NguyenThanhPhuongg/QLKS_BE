package org.example.quanlykhachsan.repository;

import org.example.quanlykhachsan.entity.TypeBed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeBedRepository extends JpaRepository<TypeBed, Integer> {

}
