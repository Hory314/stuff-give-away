package pl.hordyjewicz.stuffgiveaway.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "institutions")
@Data
public class Institution
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String purpose;

    private String name;

    private String city;
}
