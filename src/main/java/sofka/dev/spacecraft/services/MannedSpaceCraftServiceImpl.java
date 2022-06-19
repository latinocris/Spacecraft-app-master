package sofka.dev.spacecraft.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import sofka.dev.spacecraft.models.MannedSpaceCraft;
import sofka.dev.spacecraft.models.SpaceCraft;
import sofka.dev.spacecraft.repositories.IMannedSpaceCraftRepository;
import sofka.dev.spacecraft.repositories.ISpaceCraftRepository;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MannedSpaceCraftServiceImpl implements  IMannedSpaceCraftService{

    private final IMannedSpaceCraftRepository mannedSpaceCraftRepository;

    public MannedSpaceCraftServiceImpl(IMannedSpaceCraftRepository spaceCraftRepository) {
        this.mannedSpaceCraftRepository = spaceCraftRepository;
    }

    @Override
    public MannedSpaceCraft createSpaceShip(MannedSpaceCraft spaceCraft) {
        return mannedSpaceCraftRepository.save(spaceCraft);
    }

    @Override
    public List<MannedSpaceCraft> findSpaceShipsFilter(String name, Date activityStart, Date activityEnd, String country, String fuelType) {
        List<MannedSpaceCraft> spaceShips = mannedSpaceCraftRepository.findAll();
        if (fuelType != null){
            spaceShips = spaceShips.stream().filter(x -> x.getFuelType().toLowerCase().equals(fuelType.toLowerCase())).collect(Collectors.toList());
        }
        if (country != null){
            spaceShips = spaceShips.stream().filter(x -> x.getCountry().toLowerCase().equals(country.toLowerCase())).collect(Collectors.toList());
        }
        if (activityStart != null){
            spaceShips = spaceShips.stream().filter(x -> x.getActivityStartDate().equals(activityStart)).collect(Collectors.toList());
        }
        if (activityEnd != null){
            spaceShips = spaceShips.stream().filter(x -> x.getActivityEndDate().equals(activityEnd)).collect(Collectors.toList());
        }
        if (name != null){
            spaceShips = spaceShips.stream().filter(x -> x.getName().toLowerCase().equals(name.toLowerCase())).collect(Collectors.toList());
        }
        return  spaceShips;

    }
}
