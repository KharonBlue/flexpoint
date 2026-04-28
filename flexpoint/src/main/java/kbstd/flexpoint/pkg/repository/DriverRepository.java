package kbstd.flexpoint.pkg.repository;

import kbstd.flexpoint.pkg.model.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Long, Driver> {

}
