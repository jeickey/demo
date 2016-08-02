package demo.boottest.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.boottest.domain.City;
import demo.boottest.service.CityService;

@Controller
public class SampleController {

	@Autowired
	private CityService cityService;

	@GetMapping("/jj")
	@ResponseBody
	@Transactional(readOnly = true)
	public String helloWorld() {
		return "Hello JJ";
	}

	@GetMapping("/city/{cityId}")
	@ResponseBody
	@Transactional(readOnly = true)
	public City getCityById(@PathVariable("cityId") int cityId) {
		City city = this.cityService.getCity(cityId);
		return city;
	}
}
