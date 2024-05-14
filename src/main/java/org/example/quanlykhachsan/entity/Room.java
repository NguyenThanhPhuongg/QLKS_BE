package org.example.quanlykhachsan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_room")
    private Integer  idRoom;
    @Column(name = "room_name")
    private String roomName;
    @Column(name = "room_image")
    private String roomImage;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "current_price")
    private BigDecimal currentPrice;
    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_type_room")
    private TypeRoom typeRoom;

    @ManyToOne
    @JoinColumn(name = "id_type_bed")
    private TypeBed typeBed;

    @ManyToOne
    @JoinColumn(name = "id_floor")
    private Floor floor;

    @ManyToOne
    @JoinColumn(name = "id_service")
    private Service service;

    @ManyToOne
    @JoinColumn(name = "id_booking")
    private Booking booking;
}
