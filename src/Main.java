import com.peace.poly.Cat;
import com.peace.poly.Dog;
import com.peace.poly.Vet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   //let's instantiate a new Vet object
        Vet myVet = new Vet();
        Cat myCat = new Cat();
        Dog myDog = new Dog();

        myVet.giveShot(myCat);
        myVet.giveShot(myDog);













        //Dog myDog = new Dog();
       // myDog.makeSound();
        //myDog.makeSound("peace");
        //myDog.makeSound("grace", "richard");
        //myDog.makeSound();
        //myDog.makeSound("another vera");
    }
}