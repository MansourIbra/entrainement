package gn.orange.entrainement.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@Table(name ="TB_PRODUIT" )
public class Produit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String nom;
    @Column(length = 250)
    private String description;
    @Column(length = 250)
    private Integer prix;
}
