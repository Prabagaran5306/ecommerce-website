package com.ecommercewebsite.ecommerceproject.model;

import com.ecommercewebsite.ecommerceproject.Enum.CardType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.sql.Date;

@Entity
@Data // instead of getter and setter
@NoArgsConstructor@AllArgsConstructor
@Table(name = "card")
@FieldDefaults(level = AccessLevel.PRIVATE) // access private without using private
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    int cvv;

    @Column(unique = true,nullable = false)
    String cardNo;

    Date expiryDate;

    @Enumerated(EnumType.STRING)
    CardType cardType;

    @ManyToOne
    @JoinColumn
    Customer customer;


}
