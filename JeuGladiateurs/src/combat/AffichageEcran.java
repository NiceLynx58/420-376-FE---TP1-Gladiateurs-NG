package combat;

import personnages.Personnage;

public class AffichageEcran {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Méthodes d'affichage">
    public void afficherDebutCombat() {
        System.out.println( '\n' + "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>> Que le combat commence ! <<<<<");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + '\n');
    }
    
    public void afficherSeparateurDeTour() {
        System.out.println('\n');
        System.out.println("**************************************");
    }

    public void afficherSeparateurInfosPerso() {
        System.out.println('\n');
        System.out.println("-----------------");
        System.out.println("INFOS PERSONNAGES");
        System.out.println("-----------------");
    }

    public void afficheVictoire(Personnage personnage1, Personnage personnage2) {
        if(personnage1.getPointsDeVie() == 0){
            System.out.println( '\n' + personnage2.getNom() + " gagne le combat !!!" + '\n');
        }
        if(personnage2.getPointsDeVie() == 0){
            System.out.println( '\n' + personnage1.getNom() + " gagne le combat !!!" + '\n');
        }
    }
    // </editor-fold>
}
