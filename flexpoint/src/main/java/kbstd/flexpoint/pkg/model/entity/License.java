package kbstd.flexpoint.pkg.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "licenses")
public class License {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "license_id")
  private Long id;
  @Column(name = "category")
  private String category;
  @Column(name = "number")
  private int number;
  @Column(name = "expiration")
  private Date expiration;
}
