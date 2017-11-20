package Poly;

public class Dogwa extends Animalwa
{
	@Override
	public void calledYourIdebtity(String name)
	{
		System.out.println("Dogwa : "+name);
	}
	
	public void calledYourIdebtity(String name, int age)
	{
		System.out.println("Dogwa : "+name+" : " +age);
	}

	@Override
	public void calledYourIdebtity(String name, int age, String voice) {
		System.out.println("Dogwa :"+name+"---"+age+"----"+voice);
		
	}

}
