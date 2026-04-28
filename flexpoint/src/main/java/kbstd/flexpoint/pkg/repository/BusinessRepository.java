package kbstd.flexpoint.pkg.repository;

import kbstd.flexpoint.pkg.model.entity.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessRepository extends JpaRepository<Long, Business> {

}
