package org.example.quanlykhachsan.repository;

import org.example.quanlykhachsan.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ServiceRepository extends JpaRepository<Service,Integer> {

}
