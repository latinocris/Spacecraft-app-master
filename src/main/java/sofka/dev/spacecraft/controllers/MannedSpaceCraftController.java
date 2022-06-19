package sofka.dev.spacecraft.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sofka.dev.spacecraft.models.MannedSpaceCraft;
import sofka.dev.spacecraft.repositories.IMannedSpaceCraftRepository;
import sofka.dev.spacecraft.services.IMannedSpaceCraftService;

import java.util.Date;

@RestController
@RequestMapping(value = "/api/mannedSpaceCraft")
public class MannedSpaceCraftController {

    private final IMannedSpaceCraftService spaceCraftService;

    public MannedSpaceCraftController(IMannedSpaceCraftService spaceCraftService) {
        this.spaceCraftService = spaceCraftService;
    }

    @PostMapping
    public ResponseEntity<?> createMannedSpaceCraft(@RequestBody MannedSpaceCraft spaceCraft) {
        return ResponseEntity.ok(spaceCraftService.createSpaceShip(spaceCraft));
    }

    @GetMapping
    public ResponseEntity<?> getMannedSpaceCraft(
            @RequestParam(required = false) String name
            , @RequestParam(required = false) String fuelType
            , @RequestParam(required = false) String country
            , @RequestParam(required = false) Date startDate
            , @RequestParam(required = false) Date endDate) {
        return ResponseEntity.ok(spaceCraftService.findSpaceShipsFilter(name, startDate, endDate, country, fuelType));
    }
}
