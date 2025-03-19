package dieterle;

public class EvaClass {

    private final String name;

    public EvaClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Меня зовут " + name + ".";
    }
}
