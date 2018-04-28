package lsg.bags;

public class Bags {
	int capacity;
	int weight;
	Collectibles items[];
	/*
	 * @constructor
	 */
	public Bags(int capacity) {
		super();
		this.capacity = capacity;
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
	
	public void push(Collectibles item) {
		// permet d’ajouter un item dans le sac. Ne fait rien si l’item est trop gros par rapport à la place restante
		
	}
	
	public Collectibles pop(Collectibles item) {
		// retire un item du sac. La méthode renvoie l’item retiré s’il était bien présent dans le sac, null sinon
		return item;
	}
	
	public boolean contains() {
		// méthode qui indique si l’item passé en paramètre se trouve bien dans le sac
		
		return true;
	}
	
	 public Collectibles[] getItems() {
		 
	 }
	 
	 public String toString() {
		 
	 }
	
}
