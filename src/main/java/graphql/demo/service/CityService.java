package graphql.demo.service;

import graphql.demo.dao.CityRepository;
import graphql.demo.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService {

    private final CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public Optional<City> getByName(String name) {
        return Optional.ofNullable(cityRepository.findByName(name));
    }
}
