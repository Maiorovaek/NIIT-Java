package person;

public class Person {
    private String name;
    private int age;
    private String pasport;

    public Person(String name, int age, String pasport) {
        this.name = name;
        this.age = age;
        this.pasport = pasport;
    }
    // equals
    public boolean equals(Object obj){
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }

        Person person = (Person) obj;

        return this.age== person.age  && this.name.equals(person.name) && this.pasport.equals(person.pasport);
    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result+age;
        result = 31*result + name.hashCode();
        result = 31*result + pasport.hashCode();
        return result;
    }
}
