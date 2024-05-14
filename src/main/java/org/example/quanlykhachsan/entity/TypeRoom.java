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
@Table(name = "type_room")
public class TypeRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_room")
    private Integer idTypeRoom;
    @Column(name = "type_room_name")
    private String typeRoomName;
    @Column(name = "max_person")
    private Integer maxPerson;
    @Column(name = "status")
    private Boolean status;


    @OneToMany(mappedBy = "typeRoom", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Room> listRoom;

}
