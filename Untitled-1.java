import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

class Personne {
	int id;
	String nom;
	String prenom;
	
	public Personne(int id, String nom, String prenom){
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public int getId(){
		return id;
	}
	
	public String getNom(){
		return nom;
	}
	
	public String getPrenom(){
		return prenom;
	}
	
	@Override
	public String toString(){
		return "(" + id + ") " + nom + " " + prenom;
	}
}
class MonModel extends AbstractListModel<Personne> {
	java.util.List<Personne> donnees;
	
	public MonModel(){
		donnees = new ArrayList<>();
	}
	
	public java.util.List<Personne> getDonnees(){
		return donnees;
	}
	
	public void addElement(Personne e){
		donnees.add(e);
		fireContentsChanged(e, getSize() - 1, getSize() - 1);
	}
	
	@Override
	public Personne getElementAt(int index){
		return donnees.get(index);
	}

	/* (non-Javadoc)
	 * @see javax.swing.ListModel#getSize()
	 */
	@Override
	public int getSize(){
		return donnees.size();
	}
}
