package lily;

public class Lily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalList ALO = new AnimalList();
		Dog d = new Dog();
		Fish f = new Fish();
		ALO.add(d);
		ALO.add(f);
		
		
		//Animal[] thelist =new Animal[2];
		//Dog dog = new Dog();
		//Fish fish = new Fish();
		
		//thelist[0]=dog;
		//thelist[1]=fish;
		
		for(Animal x:AnimalList.thelist){
			x.noise();
		}

	}

}
