package test.spring.repository;

import org.springframework.stereotype.Repository;

import test.spring.entity.Entreprise;

@Repository
public interface EntrepriseRepository extends userRepository<Entreprise,Long>{

}
