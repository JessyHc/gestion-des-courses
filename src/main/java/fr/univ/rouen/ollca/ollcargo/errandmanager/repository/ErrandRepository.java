package fr.univ.rouen.ollca.ollcargo.errandmanager.repository;

import fr.univ.rouen.ollca.ollcargo.errandmanager.model.Errand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ErrandRepository extends JpaRepository<Errand, Long> {

    Errand save(Errand errand);

    Optional<Errand> findById(Long id);

    void deleteById(Long id);
}
