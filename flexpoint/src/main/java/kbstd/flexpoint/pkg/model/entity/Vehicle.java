package kbstd.flexpoint.pkg.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashMap;

@Entity
@Data
@Table(name = "vehicles")
public class Vehicle {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "vehicle_id")
  private Long id;
  @Column(name = "type")
  private String type;
  @Column(name = "mark")
  private String mark;
  @Column(name = "model")
  private String model;
  @Column(name = "patent")
  private String patent;
  @Column(name = "status")
  private boolean status;
  @Column(name = "history")
  private HashMap<Long, Location> history;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "business_id")
  private Business business;
}
