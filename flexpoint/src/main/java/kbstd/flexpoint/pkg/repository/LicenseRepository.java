package kbstd.flexpoint.pkg.repository;

import kbstd.flexpoint.pkg.model.entity.License;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseRepository extends JpaRepository<Long, License> {

}
