public interface Fightable {
    boolean canFight();
}
	
abstract class Superhero implements Fightable {
    public abstract void fightCrime();

    //needs canFight() implementation
}

class TeenTitan extends Superhero {
    public void describeCostume() {
    	System.out.println("teentitan's describe costume method");
    }

    //needs fightCrime() implementation
}

class Raven extends TeenTitan {
    public void describeCostume() {
	    	System.out.println("ravens describe costume method");
    }
}

class Superman extends Superhero {
    public String getSecretIdentity() {
    	System.out.println("supermans getsecretidentity method");
    	return "Clark";
    }
    public String describeCostume() {
        	System.out.println("supermans describe costume method");
        	return "cape";
    }
}

