package gn.orange.entrainement.service;

import gn.orange.entrainement.modele.Produit;

import java.util.List;

public interface ProduitService {
    //Méthode pour créer un produit
    Produit creer(Produit produit);
    List<Produit> Lire();
    Produit modifier(Long id, Produit produit);
    String supprimer(Long id);
}
