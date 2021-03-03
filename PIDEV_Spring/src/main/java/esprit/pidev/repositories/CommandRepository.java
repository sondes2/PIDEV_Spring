package esprit.pidev.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import esprit.pidev.entities.Command;

@Repository
public interface CommandRepository extends CrudRepository<Command, Integer> {

}
