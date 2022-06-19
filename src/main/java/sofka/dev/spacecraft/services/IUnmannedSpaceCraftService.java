package sofka.dev.spacecraft.services;

import sofka.dev.spacecraft.models.MannedSpaceCraft;
import sofka.dev.spacecraft.models.UnmannedSpaceCraft;

import java.util.Date;
import java.util.List;

public interface IUnmannedSpaceCraftService {
    UnmannedSpaceCraft createSpaceShip(UnmannedSpaceCraft spaceCraft);
    List<UnmannedSpaceCraft> findSpaceShipsFilter(String name, Date activityStart, Date activityEnd, String country, String fuelType);
}
