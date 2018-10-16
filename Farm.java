class Farm 
{
private Animal[] allMyAnimals = new Animal[2];

public Farm() {
	allMyAnimals[0] = new Cow();
	allMyAnimals[1] = new Chick();

		}	 

public void animalSounds() {
for (int i = 0; i < allMyAnimals.length; i++) {
	System.out.println(allMyAnimals[i].getType() + " goes " +allMyAnimals[i].getSound());
		}    
	}
}
