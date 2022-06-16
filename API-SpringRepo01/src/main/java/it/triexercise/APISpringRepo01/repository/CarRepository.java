package it.triexercise.APISpringRepo01.repository;

import it.triexercise.APISpringRepo01.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Integer> {
}
