package test.spring.repository;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface userRepository<T, Long extends Serializable> extends JpaRepository<T, Long> {

}



