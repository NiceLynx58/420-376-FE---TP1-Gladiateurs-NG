package combat;

public class CompteurDeTour {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    private int cptrTour;
    // </editor-fold>


    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public CompteurDeTour() {
        cptrTour = 1;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    public void setCptrTour(int cptrTour) {
        this.cptrTour = cptrTour;
    }

    public int getCptrTour() {
        return cptrTour;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="M�canique de jeu">
    public void augmenteTour() {
        // TODO : Incr�menter le compteur de tour
    }

    public void afficheTour() {
        // TODO : Afficher le tour actuel, tel que montr� dans l'�nonc�
    }
    // </editor-fold>
}
