package sofka.dev.spacecraft.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sofka.dev.spacecraft.models.UnmannedSpaceCraft;

@Repository
public interface IUnmannedSpaceCraftRepository extends JpaRepository<UnmannedSpaceCraft, Integer> {
}
