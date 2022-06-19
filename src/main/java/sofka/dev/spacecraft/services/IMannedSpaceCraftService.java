package sofka.dev.spacecraft.services;

import sofka.dev.spacecraft.models.MannedSpaceCraft;

import java.util.Date;
import java.util.List;

public interface IMannedSpaceCraftService {

    MannedSpaceCraft createSpaceShip(MannedSpaceCraft spaceCraft);
    List<MannedSpaceCraft> findSpaceShipsFilter(String name, Date activityStart, Date activityEnd, String country, String fuelType);

}
