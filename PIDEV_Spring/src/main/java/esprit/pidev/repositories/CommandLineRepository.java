package esprit.pidev.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import esprit.pidev.entities.CommandLine;
import esprit.pidev.entities.Product;

@Repository
public interface CommandLineRepository extends CrudRepository<CommandLine, Integer> {

	@Query("select DISTINCT e from Product e  join e.CommandLines t join t.basket m where m.id=:idb")

	public List<Product> getalll(@Param("idb") int idb);

}
