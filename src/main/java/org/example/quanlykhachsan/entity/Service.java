package org.example.quanlykhachsan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_service")
    private Integer idService;
    @Column(name = "name_service")
    private String nameService;
    @Column(name = "price_service")
    private BigDecimal priceService;
    @Column(name = "status")
    private Boolean status;


    @OneToMany(mappedBy = "service", fetch = FetchType.EAGER, cascade =  CascadeType.ALL)
    private List<Room> listRoom;

}
