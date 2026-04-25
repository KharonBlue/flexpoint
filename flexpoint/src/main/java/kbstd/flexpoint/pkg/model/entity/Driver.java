package kbstd.flexpoint.pkg.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "drivers")
public class Driver {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "driver_id")
  private Long id;
  @Column(name = "fullname")
  private String fullName;
  @Column(name = "phonenumber")
  private int phoneNumber;
  @OneToOne
  private License license;
}
