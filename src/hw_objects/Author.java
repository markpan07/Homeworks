package hw_objects;

import java.util.Objects;

public class Author {
    private final String name;
    private final String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return getName() + " " + getLastName();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return getName().equals(author.getName()) && getLastName().equals(author.getLastName());
    }

    @Override
    public int hashCode () {
        return Objects.hash(name, lastName);
    }
}
