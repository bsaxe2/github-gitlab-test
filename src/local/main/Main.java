package local.main;

public class Main {

    public static void main(String[] args)
    {
	System.out.println("release 0.2");
	System.out.println("new feature 0.2");
	System.out.println("fixed a small bug in feature 0.2");
	System.out.println("feature 0.3 2");
	System.out.println("feature 0.3 3");
	System.out.println("feature 0.3 1");
	System.out.println("clean up for release 0.3");
	
	ShinyNewFeature snf = new ShinyNewFeature();
	snf.useNewFeature();
    }

}
