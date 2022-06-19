package sofka.dev.spacecraft.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "manned_space_craft")
public class MannedSpaceCraft extends SpaceCraft{

    private Integer maxPeopleCapacity;

    public MannedSpaceCraft() {
    }

    @Override
    public String launchSpaceShip() {
        return "launch manned space ship";
    }

    public Integer getMaxPeopleCapacity() {
        return maxPeopleCapacity;
    }

    public void setMaxPeopleCapacity(Integer maxPeopleCapacity) {
        this.maxPeopleCapacity = maxPeopleCapacity;
    }
}
