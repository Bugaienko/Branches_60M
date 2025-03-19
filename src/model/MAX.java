package model;

import java.util.Objects;

public class MAX {
    String name;

    public MAX(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MAX)) return false;
        MAX max = (MAX) o;
        return Objects.equals(name, max.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
