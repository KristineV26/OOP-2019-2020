package ie.tudublin;

public class Main
{

<<<<<<< HEAD
<<<<<<< HEAD
    public void helloArray()
=======
=======
    public void soundSynthesis()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new SoundSynthesis());
    }
<<<<<<< HEAD
>>>>>>> 8020600b6357fbb967332f1d8ebca78f16781c2e
=======
    public void starMap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new StarMap());
    }
>>>>>>> 10449debb2cc89acc74fc7f92757175469b0cca5
    public void helloArrays()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new ArraysExample());
    }

    public void helloProcessing()
>>>>>>> upstream/master
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Arrays());
    }

    public void loops()
    {
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Loops());
    }
    
    public void bugZap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
    }
    
    public void sound1()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Sound1());
    }

    public void sound2()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Sound2());
    }

    public void audioBands()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new AudioBands());
    }

    public void airSeaBattle()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new AirSeaBattle());
    }

    public void soundMandala()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new SoundMandala());
    }
    
    public void dogsCats()
    {
        // Polymorphism means
        // The type is a superclass, the instance is a subclass

        // This is not polymorphism
        Cat topcat = new Cat("Topcat");

        // This is polymorphism!
        Animal mino = new Cat("Mino");
        // A vitual method!
        // Dynamic binding
        mino.speak();
        // This wont compile!!
        //System.out.println(mino.getNumLives());
        // This is an example of a cast
        System.out.println(((Cat)mino).getNumLives());

        mino = new Dog("Misty");  // This will compile!
        //topcat = new Dog("Tara"); // This wont compile!

        Animal a = new Cat("a");
        Animal b = new Cat("b");
        
        System.out.println(a);
        System.out.println(b);

        a = b;

        a.setName("c");

        System.out.println(a);
        System.out.println(b);

        // c c will get printed out because 
        // a & b are object references

    }
    
    public static void main(String[] arg)
    {
        Main main = new Main();
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		main.loops();   
=======
		main.helloArrays();        
>>>>>>> upstream/master
=======
		main.soundSynthesis();        
>>>>>>> 8020600b6357fbb967332f1d8ebca78f16781c2e
=======
		main.starMap();        
>>>>>>> 10449debb2cc89acc74fc7f92757175469b0cca5
    }

    /*public static void kill()
    {
        if (numLives >0
    }*/

}