class NamedCow extends Cow
{
	private String nCowName;

	public NamedCow(String nType,String nSound,String nName) {
		myType = nType;
		mySound = nSound;
		nCowName = nName;
	}

	public String getName() {return nCowName;}

}