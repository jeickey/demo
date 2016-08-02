package demo.boottest.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import demo.boottest.domain.City;

@Component("cityService")
@Transactional
public class CityServiceImpl implements CityService {
	private final CityRepository cityRepository;

	public CityServiceImpl(CityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}

	@Override
	public City getCity(int cityId) {
		Assert.notNull(cityId, "Id must not be null");
		return this.cityRepository.findOne(Long.valueOf(cityId));
	}

}
