abstract class Animal

{

public abstract void sound();

}

public class Lion extends Animal

{

public void sound()

{

System.out.println("Roar");

}

public static void main(String args[])

{

Animal obj = new Lion();

obj.sound();

}

}