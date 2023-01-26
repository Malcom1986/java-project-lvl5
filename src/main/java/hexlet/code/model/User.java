package hexlet.code.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.TemporalType.TIMESTAMP;
import javax.persistence.Temporal;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @CreationTimestamp
    @Temporal(TIMESTAMP)
    private Date createdAt;
}
