package sofka.dev.spacecraft.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "unmanned_space_craft")
public class UnmannedSpaceCraft extends SpaceCraft{

    private Double pushForce;

    public UnmannedSpaceCraft() {
    }

    @Override
    public String launchSpaceShip() {
        return "launch unmanned space ship";
    }

    public Double getPushForce() {
        return pushForce;
    }

    public void setPushForce(Double pushForce) {
        this.pushForce = pushForce;
    }
}
