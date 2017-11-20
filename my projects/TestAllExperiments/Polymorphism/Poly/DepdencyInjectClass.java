package Poly;

public class DepdencyInjectClass {
	private Animalwa animalwa;

	public Animalwa getAnimalwa() {
		return animalwa;
	}

	public void setAnimalwa(Animalwa animalwa) {
		this.animalwa = animalwa;
	}
	
	public void callMethod()
	{
		this.animalwa.calledYourIdebtity(this.animalwa.getName());
		System.out.println("--------------------------");
		//this.animalwa.calledYourIdebtity(this.animalwa.getName() , this.animalwa.getAge());
		System.out.println("--------------------------");
		this.animalwa.calledYourIdebtity(this.animalwa.getName() , this.animalwa.getAge(),this.animalwa.getVoice());
	
	}

}
