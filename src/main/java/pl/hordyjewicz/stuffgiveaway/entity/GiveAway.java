package pl.hordyjewicz.stuffgiveaway.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "giveaways")
@Data
public class GiveAway
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Institution institution;

    @Column(name = "bags_no")
    private Integer bagsNo;

    @Column(name =  "collection")
    private LocalDateTime collectionDateTime;

    private String comments;

    @ManyToOne
    private User user;

    @ManyToOne
    private Address address;
}
