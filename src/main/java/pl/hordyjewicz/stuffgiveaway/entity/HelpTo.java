package pl.hordyjewicz.stuffgiveaway.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "help_tos")
@Data
public class HelpTo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String helpTo;

    @ManyToMany(mappedBy = "stuffs", fetch = FetchType.EAGER)
    private List<Institution> institutions;
}
