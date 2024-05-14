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
@Table(name = "type_bed")

public class TypeBed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_bed")
    private Integer idTypeBed;
    @Column(name = "name_type_bed")
    private String nameTypeBed;
    @Column(name="status")
    private Boolean status;


    @OneToMany(mappedBy = "typeBed", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Room> listRoom;
}
