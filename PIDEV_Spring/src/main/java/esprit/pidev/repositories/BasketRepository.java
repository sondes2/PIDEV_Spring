package esprit.pidev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import esprit.pidev.entities.Basket;

@Repository
public interface BasketRepository extends JpaRepository<Basket, Integer> {

	@Modifying
	@Transactional
	@Query(value = "DELETE from command_line Where command_line.id_panier=:idb AND command_line.id_produit=:idd  ", nativeQuery = true)
	public void supprimer(@Param("idb") int idb, @Param("idd") int idd);

	@Query(value = "SELECT count(id_produit) from command_line Where command_line.id_panier=:idb ", nativeQuery = true)

	public int count(@Param("idb") int idb);

	@Query(value = "SELECT SUM(totalprice) from command_line Where command_line.id_panier=:idb ", nativeQuery = true)

	public int calculateBasketPrice(@Param("idb") int idb);

}
