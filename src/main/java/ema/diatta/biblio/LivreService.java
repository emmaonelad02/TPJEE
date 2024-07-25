package ema.diatta.biblio;

import java.util.List;

public interface LivreService {
    void ajouterLivre(Livre livre);
    void supprimerLivre(int id);
    List<Livre> obtenirTousLesLivres();
}
