package ie.tudublin;

public class Main
{

    public void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
	}
    public static void main(String[] arg)
    {
        System.out.println("Hello world!");

        Animal misty = new Dog(); // Polymorphism
        misty.setName("Misty");
        System.out.println(misty.getName());  
        misty.speak();  
        Cat topcat = new Cat();
        while(topcat.getNumLives() != 0)
        {
            topcat.kill();
        }
        topcat.speak();

        Main main = new Main();
		main.helloProcessing();
        
    }

    /*public static void kill()
    {
        if (numLives >0
    }*/

}