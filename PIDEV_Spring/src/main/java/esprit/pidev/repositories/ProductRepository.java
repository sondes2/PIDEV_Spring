package esprit.pidev.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import esprit.pidev.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
	 
    @Modifying
    @Transactional
    @Query("DELETE from Product")
    public void deleteproduct();
}
