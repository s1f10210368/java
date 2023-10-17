public class NameCard {
    private String firstName;
    private String familyName;
    private int id;
    private static int nextId = 1;

    public NameCard(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.id = nextId++;
    }

    public String getLabel() {
        return "No. " + id + ": " + firstName + " " + familyName;
    }
}

