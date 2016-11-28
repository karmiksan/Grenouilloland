package grenouilloland.vue;

import grenouilloland.modele.Grenouille;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

/**
 * Classe Vie .
 * @author Alexis Prevost Mayhen
 * @author Guillaume Drouart
 * @author Lucas Gouedant
 * @author Nicolas Vatel
 */
class Vie extends JPanel{

    /**
     * Constructeur logique du panneau de vie.
     *
     * @param vue La vue principale de l'application
     */
    public Vie(Vue vue){
        super(new BorderLayout());
        this.vue = vue;
        setBorder(BorderFactory.createTitledBorder(titreBordure));

        texte = new JLabel(vue.lirePresentateur().getGrenouille().getPtVie()+"", icone, JLabel.HORIZONTAL);
        add(texte, BorderLayout.CENTER);
    }

    /**
     * Met à jour le composant (affiche le nombre de points de vie de
     * la grenouille)
     */
    protected void mettreAJour(int ptVie){
        texte.setText(ptVie+"");
    }

    /** Le titre du panneau de contrôle */
    protected final static String titreBordure = "Points de vie :";

    /** Le chemin vers l'image de coeur */
    protected JLabel texte;

    /** Le chemin vers l'icône du JLabel */
    protected static final String cheminIcone =
            "ressources/images/coeur-96x91.png";

    /** L'icône de coeur à afficher dans le JLabel */
    protected static final ImageIcon icone;
    static{
        ClassLoader loader = Vie.class.getClassLoader();
        icone = new ImageIcon(loader.getResource(cheminIcone));
    }


    /** La vue possédant ce panneau de contrôle */
    protected final Vue vue;












}