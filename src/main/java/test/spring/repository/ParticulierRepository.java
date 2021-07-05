package test.spring.repository;

import org.springframework.stereotype.Repository;

import test.spring.entity.Particulier;


@Repository
public interface ParticulierRepository extends userRepository<Particulier,Long>{

}
