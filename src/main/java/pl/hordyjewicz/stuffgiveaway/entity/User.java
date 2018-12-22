package pl.hordyjewicz.stuffgiveaway.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
@Data
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Size(min = 2, max = 245, message = "Imię powinno mieć co najmniej 2 znaki")
    @Column(name = "first_name")
    private String firstName;

    // @Size(min = 3, max = 245, message = "Nazwisko powinno mieć co najmniej 3 znaki")
    @Column(name = "last_name")
    private String lastName;

    @Column(nullable = false, unique = true)
    @Size(max = 245) // cant create unique index if size=255
    //@Email(message = "Wpisz prawidłowy adres email")
    private String email;

    // @Size(min = 5, max = 245, message = "Hasło powinno mieć od 5 do 45 znaków")
    private String password;

    @Column(name = "is_admin", columnDefinition = "BIT(1) DEFAULT FALSE")
    private Boolean isAdmin = false;
}
