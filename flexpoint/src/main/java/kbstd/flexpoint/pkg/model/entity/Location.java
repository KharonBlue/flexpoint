package kbstd.flexpoint.pkg.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "locations")
public class Location {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "location_id")
  private Long id;
  @Column(name = "address")
  private String address;
  @Column(name = "coordinates")
  private String coordinates;
}
