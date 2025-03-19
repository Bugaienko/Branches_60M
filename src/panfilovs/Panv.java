package panfilovs;

import java.util.Objects;

public class Panv {

    private String name;
    private int age;

    public Panv(String hoby, int age) {
        this.name = hoby;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Panv)) return false;
        Panv panv = (Panv) o;
        return age == panv.age && Objects.equals(name, panv.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Panv{" +
                "hoby='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }
}
