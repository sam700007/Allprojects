package Poly;

public abstract class Animalwa {
	private String name;
	private int age;
	private String voice;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getVoice() {
		return voice;
	}
	public void setVoice(String voice) {
		this.voice = voice;
	}
	
	public void calledYourIdebtity(String name)
	{
		System.out.println(name);
	}
	
	/*public void calledYourIdebtity(String name, int age)
	{
		System.out.println(name+ age);
	}*/
	
	public abstract void calledYourIdebtity(String name, int age,String voice);

}
