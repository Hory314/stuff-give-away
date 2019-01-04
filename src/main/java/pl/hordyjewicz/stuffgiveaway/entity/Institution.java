package pl.hordyjewicz.stuffgiveaway.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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

    @ManyToMany
    private List<Stuff> stuffs;

    @ManyToMany
    private List<HelpTo> helpTos;

    @OneToMany(mappedBy = "institution", fetch = FetchType.EAGER)
    private List<GiveAway> giveAways;

    @Column(name = "is_verified", columnDefinition = "BIT(1) DEFAULT FALSE")
    private Boolean isVerified = false;
}
