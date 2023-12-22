package app.foodrecipe.foodrecipecore.Domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.util.Date;
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

    private boolean isUsingMFA = false;
    private boolean isLoggedIn = true;
    private boolean isActive = true;
    private boolean isEnabled = true;
    private boolean isNotExpired = true;
    private boolean isNotLocked = true;
    private boolean isCredentialsNonExpired = true;
    private boolean isDeleted = false;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false)
    private Date joinDate;

    @Column(name = "last_login_date", nullable = true)
    private Date lastLoginDate;

    @Column(name = "last_login_date_display", nullable = true)
    private Date lastLoginDateDisplay;

    @LastModifiedDate
    @Column(name = "updated_at", nullable = true)
    private Date lastUpdated;

    @LastModifiedDate
    @Column(name = "deleted_at", nullable = true)
    private Date deletedAt;
}
