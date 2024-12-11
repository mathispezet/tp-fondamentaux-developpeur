/**
 * Représente un employé dans une entreprise.
 */

public class Employee {

    // TODO: Ajoutez les attributs ici (nom, id, position). 
    private int id;
    private String nom;
    private String position; 

    @param id;
    @param nom;
    @param position;

    // TODO: Ajoutez un constructeur pour initialiser les attributs. 
    public Employee(int id, String nom, String position){
        if(nom==null || nom.isEmpty()){
            throw new IllegalException("L'attribut nom ne peut pas être vide");
        }        
    }
    // TODO: Ajoutez des méthodes pour récupérer les valeurs des attributs (getters). 


    // TODO: Ajoutez une méthode toString() pour représenter un employé en texte. 

}

