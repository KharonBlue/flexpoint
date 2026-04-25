package kbstd.flexpoint.pkg.model.entity;

import jakarta.persistence.*;
import kbstd.flexpoint.pkg.model.traits.RoleType;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  private Long id;
  @Column(name = "email")
  private String email;
  @Column(name = "password")
  private String password;
  @Column(name = "role")
  private RoleType role;
}
