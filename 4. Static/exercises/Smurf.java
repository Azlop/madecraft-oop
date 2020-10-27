package exercises;

public class Smurf {

    private String name;
    private static int papas;
    private static int smurfettes;

    public static Smurf createSmurf(String name) {
        System.out.println("Creating " + name + " Smurf");
        Smurf smurf = null;
        
        if (name.equals("papa")) {
            smurf = verifyAndCreatePapa(name, smurf);
        } else
        if (name.equals("smurfette")) {
            smurf = verifyAndCreateSmurfette(name, smurf);
        } else {
            smurf = new Smurf(name);
        }
        
        return smurf;
    }

    private static Smurf verifyAndCreateSmurfette(String name, Smurf smurf) {
        if (smurfettes < 1) {
            smurfettes++;
            smurf = new Smurf(name);
        } else {
            System.out.println("there should be only one smurfette!");
        }
        return smurf;
    }

    private static Smurf verifyAndCreatePapa(String name, Smurf smurf) {
        if (papas < 1) {
            papas++;
            smurf = new Smurf(name);
        } else {
            System.out.println("there should be only one papa!");
        }
        return smurf;
    }

    private Smurf(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("My name is " + name + " Smurf.");
    }

    public void eat() {
        System.out.println(name + " Smurf is eating Smurfberries.");
    }

}
