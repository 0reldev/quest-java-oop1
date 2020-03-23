public class Wilder {

    // attributes
    private String firstname;
    private boolean aware;

    // constructors
    public Wilder(String firstName, boolean aware) {
        this.firstname = firstName;
        this.aware = aware;
    }

    // getters
    public String getFirstName() {
        return this.firstname;
    }

    public boolean getAware() {
        return this.aware;
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstname = firstName;
        this.aware = false;
    }
    public void setNameAndAwareness(String firstName, boolean aware) {
        this.firstname = firstName;
        this.aware = aware;
    }




    // instance method
    public String whoAmI() {
        if (this.aware) {
            return "Je m'appelle " + this.getFirstName() + " et je suis aware";
        } else {
            return "Je m'appelle " + this.getFirstName() + " et je ne suis pas aware";
        }
    }
}


