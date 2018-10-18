class Pig implements Animal
{     private String myType;
	  private String mySound;

	Pig(String pType,String pSound) {
		myType = pType;
		mySound = pSound;
	}

	public String getType() {return myType;}
	public String getSound() {return mySound;}
}
