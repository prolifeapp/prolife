package br.com.prolife.repository;

import java.util.List;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import br.com.prolife.enums.StateEnum;
import br.com.prolife.model.City;

@Repository(forEntity = City.class)
public interface CityRepository extends EntityRepository<City, Long>{

	List<City> findByState(StateEnum state);
}
