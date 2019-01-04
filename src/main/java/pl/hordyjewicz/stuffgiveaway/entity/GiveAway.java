package pl.hordyjewicz.stuffgiveaway.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "giveaways")
@Data
public class GiveAway
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
