package sofka.dev.spacecraft.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import sofka.dev.spacecraft.models.SpaceCraft;

@NoRepositoryBean
public interface ISpaceCraftRepository extends JpaRepository<SpaceCraft, Long> {
}
