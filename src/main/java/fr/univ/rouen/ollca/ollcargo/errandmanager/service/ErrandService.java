package fr.univ.rouen.ollca.ollcargo.errandmanager.service;

import fr.univ.rouen.ollca.ollcargo.errandmanager.model.Errand;
import fr.univ.rouen.ollca.ollcargo.errandmanager.repository.ErrandRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ErrandService {

    private final ErrandRepository errandRepository;

    public ErrandService(ErrandRepository errandRepository) {
        this.errandRepository = errandRepository;
    }

    /**
     * Save or update an Errand.
     *
     * @param errand an instance of {@link Errand} to be saved or updated.
     * @return the saved or updated Errand instance.
     */
    public Errand save(Errand errand) {
        return errandRepository.save(errand);
    }

    /**
     * Get all Errands.
     *
     * @return a list of all {@link Errand} instances.
     */
    public List<Errand> getAll() {
        return errandRepository.findAll();
    }

    /**
     * Get Errand by Id.
     *
     * @param id the Id of the Errand.
     * @return an Optional containing the found {@link Errand} instance or empty if not found.
     */
    public Optional<Errand> getById(Long id) {
        return errandRepository.findById(id);
    }

    /**
     * Create an Errand.
     *
     * @param errand an instance of {@link Errand} to be created.
     * @return the created Errand instance.
     */
    public Errand create(Errand errand) {
        return errandRepository.save(errand);
    }

    /**
     * Update an Errand.
     *
     * @param id     the Id of the Errand to be updated.
     * @param errand an instance of {@link Errand} to be updated.
     * @return the updated Errand instance.
     * @throws EntityNotFoundException if the Errand with the specified id is not found.
     */
    public Errand update(Long id, Errand errand) throws EntityNotFoundException {
        Optional<Errand> savedErrand = errandRepository.findById(id);
        if (!savedErrand.isPresent()) {
            throw new EntityNotFoundException("Errand with id " + id + " not found.");
        }
        return errandRepository.save(errand);
    }

    /**
     * Delete an Errand by Id.
     *
     * @param id the Id of the Errand to be deleted.
     */
    public void delete(Long id) {
        errandRepository.deleteById(id);
    }
}