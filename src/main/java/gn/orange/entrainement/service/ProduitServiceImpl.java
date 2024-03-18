package gn.orange.entrainement.service;

import gn.orange.entrainement.modele.Produit;
import gn.orange.entrainement.repository.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class ProduitServiceImpl implements ProduitService{
    private final ProduitRepository produitRepository;
    @Override
    public Produit creer(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> Lire() {
        return produitRepository.findAll();
    }

    @Override
    public Produit modifier(Long id, Produit produit) {
        return produitRepository.findById(id).map(p->{
            p.setPrix(produit.getPrix());
            p.setNom(produit.getNom());
            p.setDescription(produit.getDescription());
            return produitRepository.save(p);
        }).orElseThrow(()->new RuntimeException("Produit non trouvé !"));

    }

    @Override
    public String supprimer(Long id) {
        produitRepository.deleteById(id);
        return "Produit supprime !";
    }
}
