package ema.diatta.biblio;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class LivreServelet extends HttpServlet {

    @EJB
    private LivreService livreService;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        List<Livre> livres = livreService.obtenirTousLesLivres();
        req.setAttribute("livres", livres);
        req.getRequestDispatcher("/index.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
        super.doPost(req, res);
        String titre = req.getParameter("titre");
        String auteur = req.getParameter("auteur");
        int anneePublication = Integer.parseInt(req.getParameter("anneePublication"));

        Livre livre = new Livre();
        livre.setTitre(titre);
        livre.setAuteur(auteur);
        livre.setAnneePublication(anneePublication);

        livreService.ajouterLivre(livre);
        res.sendRedirect("livres");

    }
}
