class Chick implements Animal 
{     
	private String myType;
	private String mySound;

	public Chick() {
		myType = "A chick";
		mySound = "QUACK!";
	}	
	public String getType(){return myType;}
	public String getSound(){return mySound;}
}
