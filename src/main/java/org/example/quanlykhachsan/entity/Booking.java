package org.example.quanlykhachsan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "booking")

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_booking")
    private Integer idBooking;
    @Column(name = "date_created")
    private Date dateCreated;
    @Column(name = "date_start")
    private Date startDate;
    @Column(name = "date_end")
    private Date endDate;
    @Column(name = "phone")
    private Integer phone;
    @Column(name = "person_number")
    private Integer personNumber;
    @Column(name = "room_number")
    private Integer roomNumber;
    @Column(name = "discount_percent")
    private BigDecimal discountPercent;
    @Column(name = "total")
    private BigDecimal total;
    @Column(name = "status")
    private Boolean status;


    @OneToMany(mappedBy = "booking", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Room> listRoom;

    @OneToMany(mappedBy = "booking", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<DetailBooking> listDetailBooking;

    @ManyToOne
    @JoinColumn(name = "id_users")
    private Users users;
}
