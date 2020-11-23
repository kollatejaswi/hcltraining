package hcl;

public class StageEvents extends Event {
int noOfshoes;
int noOftickets;
public StageEvents() {
	// TODO Auto-generated constructor stub
}

public StageEvents(String name,String details,String ownerName,int noOfshoes, int noOftickets) {
	super(name,details,ownerName);
	this.noOfshoes = noOfshoes;
	this.noOftickets = noOftickets;
}

public int getNoOfshoes() {
	return noOfshoes;
}
public void setNoOfshoes(int noOfshoes) {
	this.noOfshoes = noOfshoes;
}
public int getNoOftickets() {
	return noOftickets;
}
public void setNoOftickets(int noOftickets) {
	this.noOftickets = noOftickets;
}
public void print()
{
	System.out.println("no of shows:"+this.noOfshoes);
	System.out.println("no of tickets:"+this.getNoOftickets());
}
}
