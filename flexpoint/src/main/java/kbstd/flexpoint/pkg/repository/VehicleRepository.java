package kbstd.flexpoint.pkg.repository;

import kbstd.flexpoint.pkg.model.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Long, Vehicle> {

}
