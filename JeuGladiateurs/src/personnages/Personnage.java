package personnages;

import java.util.Random;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    private String nom;
    private int pointsDeVie;
    private int valeurMaxAttaque;
    private int valeurDefense;
    private int initiative;
    private boolean statut;
    // </editor-fold>



    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int valeurMaxAttaque, int valeurDefense, int pointsDeVie, int initiative) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.valeurMaxAttaque = valeurMaxAttaque;
        this.valeurDefense = valeurDefense;
        this.initiative = initiative;
    }

    public Personnage() {
        nom = "";
        pointsDeVie = 0;
        valeurMaxAttaque = 0;
        valeurDefense = 0;
        initiative = 0;
        statut = false;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
        public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public boolean isStatut() {
        return statut;
    }

    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        System.out.println('\n' + nom);
        System.out.println('\t' + "Attaque : " + valeurMaxAttaque);
        System.out.println('\t' + "Défense : " + valeurDefense);
        System.out.println('\t' + "Point de vie : " + pointsDeVie);
        System.out.println('\t' + "Initiative : " + initiative);
        if(statut){System.out.println('\t' + "Statut : mort");}
        else{System.out.println('\t' + "Statut : vivant" + '\n');}
        
    }

    private int attaqueCalcul() {
        Random rand = new Random();
        int minValue =0;
        int valAttaque = rand.nextInt(valeurMaxAttaque - minValue) + minValue;
        return valAttaque;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        //modifier les points de vie du personnage cible, afficher les détails
        // sur l'attaque, tel que montré dans l'énoncé.
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
    }
    // </editor-fold>
}
