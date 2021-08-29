package pl.sda.security.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String password;

    private  String role;
}
