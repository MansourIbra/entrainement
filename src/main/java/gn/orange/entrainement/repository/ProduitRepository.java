package gn.orange.entrainement.repository;

import gn.orange.entrainement.modele.Produit;
import io.micrometer.observation.ObservationFilter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
