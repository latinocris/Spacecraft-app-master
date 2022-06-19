package sofka.dev.spacecraft.services;

import org.springframework.stereotype.Service;
import sofka.dev.spacecraft.models.MannedSpaceCraft;
import sofka.dev.spacecraft.models.UnmannedSpaceCraft;
import sofka.dev.spacecraft.repositories.IUnmannedSpaceCraftRepository;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UnmannedSpaceCraftServiceImpl implements IUnmannedSpaceCraftService{

    private final IUnmannedSpaceCraftRepository unmannedSpaceCraftRepository;

    public UnmannedSpaceCraftServiceImpl(IUnmannedSpaceCraftRepository unmannedSpaceCraftRepository) {
        this.unmannedSpaceCraftRepository = unmannedSpaceCraftRepository;
    }


    @Override
    public UnmannedSpaceCraft createSpaceShip(UnmannedSpaceCraft spaceCraft) {
        return unmannedSpaceCraftRepository.save(spaceCraft);
    }

    @Override
    public List<UnmannedSpaceCraft> findSpaceShipsFilter(String name, Date activityStart, Date activityEnd, String country, String fuelType) {
        List<UnmannedSpaceCraft> spaceShips = unmannedSpaceCraftRepository.findAll();
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
