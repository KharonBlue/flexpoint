package kbstd.flexpoint.pkg.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashMap;

@Entity
@Data
@Table(name = "business")
public class Business {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "business_id")
  private Long id;
  @Column(name = "name")
  private String name;
  @Column(name = "address")
  private String address;
  @Column(name = "phone_number")
  private int phoneNumber;
  @OneToMany(mappedBy = "business", cascade = CascadeType.ALL, orphanRemoval = true)
  private HashMap<Long, Vehicle> vehicles;
}
