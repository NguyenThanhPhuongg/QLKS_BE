package org.example.quanlykhachsan.repository;

import org.example.quanlykhachsan.entity.DetailBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailBookingRepository extends JpaRepository<DetailBooking, Integer> {

}
