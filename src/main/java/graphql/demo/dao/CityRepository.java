package graphql.demo.dao;

import graphql.demo.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {

    City findByName(String name);

}
