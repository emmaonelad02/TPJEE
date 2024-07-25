package ema.diatta.biblio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity

@Getter
@Setter
public class Livre {
    @Id
    private int id;
    private String titre;
    private String auteur;
    private int anneePublication;
}
