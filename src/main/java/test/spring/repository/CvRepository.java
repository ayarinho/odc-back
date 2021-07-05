package test.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import test.spring.entity.Cv;

@Repository
public interface CvRepository extends JpaRepository<Cv, Long>{

}
