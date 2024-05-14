package org.example.quanlykhachsan.repository;

import org.example.quanlykhachsan.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomReposistory extends JpaRepository<Room, Integer> {

}
