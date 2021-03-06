package com.sanpo.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanpo.entity.Route;
import com.sanpo.service.RouteService;

@RestController
public class RouteRestController {
	
	@Autowired
	RouteService routeService;
	
	@PostMapping("/saveRoute")
	public Integer saveLocation(@RequestBody Route r)
	{
		routeService.saveRoute(r);
		return r.getId();
	}

}
