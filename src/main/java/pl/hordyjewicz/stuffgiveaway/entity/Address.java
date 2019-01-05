package pl.hordyjewicz.stuffgiveaway.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "addresses")
@Data
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "address")
    private List<GiveAway> giveAways;

    @OneToOne(mappedBy = "address")
    private User user;

    private String street;

    private String city;

    private String zip;

    private String phone;
}
