package org.example.quanlykhachsan.repository;


import org.example.quanlykhachsan.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer > {
}
