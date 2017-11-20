package Poly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JungliMain {

	public static void main(String[] args) {
		Map<Animalwa,String> m1=new HashMap<Animalwa,String>();
		System.out.println("------------Start--------------");
		Dogwa a1 =new Dogwa();
		m1.put(a1, "Kutta");
		a1.setName("Tomy");
		a1.setAge(11);
		a1.setVoice("Bhauuuu");
		a1.calledYourIdebtity(a1.getName());
		a1.calledYourIdebtity(a1.getName() , a1.getAge());
		
		Animalwa c1 =new Catwa();
		m1.put(c1, c1.getName());
		c1.setName("Pussy");
		c1.setAge(21);
		c1.setVoice("Meaawou");
		
		/*DepdencyInjectClass diInject = new DepdencyInjectClass();
		diInject.setAnimalwa(a1);
		diInject.callMethod();
		System.out.println("********************************");
		diInject.setAnimalwa(c1);
		diInject.callMethod();
		
		System.out.println("--------HashMap-1-----"+m1.get(a1));
		System.out.println("--------HashMap-2-----"+m1.get(c1));
		*/
		
		/*List<Animalwa> l1=new ArrayList<Animalwa>(m1.entrySet());
		while(l1.iterator().hasNext())
		{
			System.out.println("List : "+(Animalwa)l1.iterator().next());
		}*/
		
	}

}
