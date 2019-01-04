package pl.hordyjewicz.stuffgiveaway.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "stuffs")
@Data
public class Stuff
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String stuff;

    @ManyToMany(mappedBy = "stuffs", fetch = FetchType.EAGER)
    private List<Institution> institutions;
}
