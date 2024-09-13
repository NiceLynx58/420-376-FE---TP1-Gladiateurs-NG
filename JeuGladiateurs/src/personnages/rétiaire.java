/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;


public class rétiaire extends Personnage{
    private boolean filet;

    public void setFilet(boolean filet) {
        this.filet = filet;
    }

    public boolean isFilet() {
        return filet;
    }

    public rétiaire(String nom, int valeurMaxAttaque, int valeurDefense, int pointsDeVie, int initiative) {
        super(nom, valeurMaxAttaque, valeurDefense, pointsDeVie, initiative);
        filet = true;
        
    }

    public rétiaire() {
    }
    @Override
    public void afficherInfosPersonnage() {
        super.afficherInfosPersonnage();
        System.out.print( '\t' + "Classe de combat : Rétiaire");
    }
}
