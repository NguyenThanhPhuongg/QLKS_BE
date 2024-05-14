package org.example.quanlykhachsan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "floor")
public class Floor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_floor")
    private Integer idFloor;
    @Column(name = "name_floor")
    private String nameFloor;
    @Column(name = "status")
    private Boolean status;


    @OneToMany(mappedBy = "floor", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Room> listRoom;


}
