package lsg.bags;

import java.util.HashSet;

public class Bags {
	int capacity = 10;
	int weight = 10;
	 HashSet<Collectibles> items = new HashSet<Collectibles>();
	/*
	 * @constructor
	 */
	public Bags(int capacity) {
		super();
		this.capacity = capacity;
		this.weight = capacity;
	}
	
	//Getters setters ---------------------------
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	// Methods -----------------------------------
	
	public void push(Collectibles newObjectInBag) {
		// permet d’ajouter un item dans le sac. Ne fait rien si l’item est trop gros par rapport à la place restante
		if(newObjectInBag.getWeight() < this.getWeight()) {
			this.items.add(newObjectInBag);
			this.setWeight(this.getWeight() - newObjectInBag.getWeight());
		}else {
			System.out.println("Error, not enough space");
		}
			
	}
	
	public Collectibles pop(Collectibles item) {
		// retire un item du sac. La méthode renvoie l’item retiré s’il était bien présent dans le sac, null sinon
		if (items.contains(item)) {
			items.remove(item);
			return item;
		}else {
			return null;
		}
		
	}
	
	public boolean contains(Collectibles item) {
		// méthode qui indique si l’item passé en paramètre se trouve bien dans le sac
		
		return items.contains(item); //methode de HashSet qui renvoie un boolean si l'item est dans le Hash
	}
	
	 public Collectibles[] getItems() {
		 // retourne un tableau contenant les items du sac
		 
		 return (Collectibles[]) items.toArray();
	 }
	 
	 public String toString() {
		 if (items.isEmpty()) {
			 return "empty";
		 }else {
			 String Reponse;
			 Reponse = this.getClass().getSimpleName()+"[ "+ items.size()+" items | "+this.getWeight()+"/"+this.getCapacity()+" ]\n";
			 for (int i = 0; i < items.size(); i++) {
				 Reponse = Reponse+" ° "+ this.getItems()[i];
			 }
			 
			 return Reponse;
					 
			 
		 }
	 }
	
}
