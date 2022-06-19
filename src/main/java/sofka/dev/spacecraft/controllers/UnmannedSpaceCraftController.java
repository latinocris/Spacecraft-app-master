package sofka.dev.spacecraft.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sofka.dev.spacecraft.models.MannedSpaceCraft;
import sofka.dev.spacecraft.models.UnmannedSpaceCraft;
import sofka.dev.spacecraft.services.IUnmannedSpaceCraftService;

import java.util.Date;

@RestController
@RequestMapping(value = "/api/unmannedSpaceCraft")
public class UnmannedSpaceCraftController {

    private final IUnmannedSpaceCraftService spaceCraftService;

    public UnmannedSpaceCraftController(IUnmannedSpaceCraftService spaceCraftService) {
        this.spaceCraftService = spaceCraftService;
    }


    @PostMapping
    public ResponseEntity<?> createMannedSpaceCraft(@RequestBody UnmannedSpaceCraft spaceCraft) {
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
