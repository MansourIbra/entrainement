package gn.orange.entrainement.controller;

import gn.orange.entrainement.modele.Produit;
import gn.orange.entrainement.service.ProduitService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produit")
@AllArgsConstructor
@Tag(name = "Produit Controller", description = "Gestion des Produit")
public class ProduitController {
    private final ProduitService produitService;

    //private Logger logger= LoggerFactory.getLogger(ProduitController.class);

    @Operation(summary = "create", description = "Création des Produits")
    @PostMapping("/create")
    public Produit create(@RequestBody Produit produit){
        return produitService.creer(produit);
    }
    @Operation(summary = "Read", description = "Liste des Produits")
    @GetMapping("/lire")
    public List<Produit> read(){
        return produitService.Lire();
    }
    @Operation(summary = "Update",description = "Modification des produits")
    @PutMapping("/update/{id}")
    public Produit modifier(@PathVariable Long id, @RequestBody Produit produit){
        return produitService.modifier(id,produit);
    }
    @Operation(summary = "Delete", description = "Supprimer un produit")
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return produitService.supprimer(id);
    }
}
