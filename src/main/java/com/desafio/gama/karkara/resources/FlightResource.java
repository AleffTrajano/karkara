package com.desafio.gama.karkara.resources;

import java.io.Serializable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amadeus.Amadeus;
import com.amadeus.Params;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.referenceData.Locations;
import com.amadeus.resources.Location;

@RestController
@RequestMapping(value="/flights")
public class FlightResource implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@RequestMapping(method=RequestMethod.GET)
	public String listart() {
		Amadeus amadeus = Amadeus
	            .builder("xmY2GlzyRX8PcSAYzuYGeD2rc7RCqbVk", "uvcwwzBdwjpQNlSv")
	            .build();

		try {
			Location[] locations = amadeus.referenceData.locations.get(Params.with("keyword", "LON").and("subType", Locations.ANY));
			System.out.print(locations);
			return locations[0].getDetailedName();
		} catch(ResponseException resp) {
			return "Houve um erro na comunicação com a API de voos.";
		}
		
	}
}
