package Poly;

public class Catwa extends Animalwa
{
	public void calledYourIdebtity(String name)
	{
		System.out.println("Catwa : "+name);
	}
	
	public void calledYourIdebtity(String name, int age)
	{
		System.out.println("Catwa : "+name+" : " +age);
	}

	@Override
	public void calledYourIdebtity(String name, int age, String voice) {
		System.out.println("Catwa :"+name+age+voice);
		
	}

}

