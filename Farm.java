class Farm 
{
private Animal[] allMyAnimals = new Animal[4];

public Farm() {
	allMyAnimals[0] = new Cow("Spaghetti","Moo");
	allMyAnimals[1] = new Chick("Chick","cheep","chirp");
	allMyAnimals[2] = new NamedCow("Cow","MOO?","Bobby");
	allMyAnimals[3] = new Pig("Bacon", "OINKK!!");
		}	 

public void animalSounds() {
for (int i = 0; i < allMyAnimals.length; i++) {
	System.out.println(allMyAnimals[i].getType() + " goes " +allMyAnimals[i].getSound());
		}    
	System.out.println("There's also a cow named " + ((NamedCow)allMyAnimals[2]).getName());
	}
}
