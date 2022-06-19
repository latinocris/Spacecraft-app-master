package sofka.dev.spacecraft.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sofka.dev.spacecraft.models.MannedSpaceCraft;

@Repository
public interface IMannedSpaceCraftRepository extends JpaRepository<MannedSpaceCraft, Long> {
}
