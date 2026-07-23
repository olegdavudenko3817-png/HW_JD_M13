package org.crud;

import org.dao.Service.PlanetDaoService;
import org.entity.Planet;

public class PlanetCrudServiceImp implements PlanetCrudService {

    private PlanetDaoService planetDaoService;

    public PlanetCrudServiceImp(PlanetDaoService planetDaoService) {
        this.planetDaoService = planetDaoService;
    }

    @Override
    public void add(Planet planet) {
        planetDaoService.add(planet);
    }

    @Override
    public void delete(Planet planet) {
        planetDaoService.delete(planet);
    }

}
