package app.foodrecipe.foodrecipecore.Domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "users",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "phone"),
                @UniqueConstraint(columnNames = "email")
        })
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long id;

    @Column(updatable = false)
    private UUID uuid;

    private String username;
    private String phone;
    private String email;
    private String password;
}
