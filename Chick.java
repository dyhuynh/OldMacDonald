class Chick implements Animal 
{     
	private String myType;
	private String mySound;

	public Chick(String cType, String cSound1, String cSound2) {
		myType = cType;

		if ((int)(Math.random()*2)==1) {
			mySound = cSound1;
		}

		else {
			mySound = cSound2;
		}
	}	
	public String getType(){return myType;}
	public String getSound(){return mySound;}
}
