package demo.boottest.service;

import org.springframework.data.repository.CrudRepository;

import demo.boottest.domain.City;

public interface CityRepository extends CrudRepository<City, Long> {

}
