public abstract class Animal {

    //abstract, hjælp til selvhjælp.
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String makeNoise(); //{
        //return "-default noise-";
    //}

    // behøve rikke en buddy, men klassen skal være abtrakt. men den SKAL bruges/kaldes i en  sub klasse for at det virker hvis det er abstrakt.

    public abstract void eat(String food);{
         //no default code defined
    }

    public void sleep(int hours) {
        String s = "s";
        if(hours == 1) {
            s = "";
        }
        System.out.printf("Sleeping for %d hour%s...\n", hours,s);
    }

}
