package org.example.quanlykhachsan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "detail_booking")
public class DetailBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detail_booking")
    private Integer idDetailBooking;
    @Column(name = "date_created")
    private Date dateCreated;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "price_booking")
    private BigDecimal priceBooking;
    @Column(name = "total")
    private BigDecimal total;

    @ManyToOne
    @JoinColumn(name = "id_booking")
    private Booking booking;

}
