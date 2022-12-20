public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o){
        if (getClass() != o.getClass()) return false;
        if (hashCode() != o.hashCode()) return false;
        return toString().equals(o.toString());
    }

    @Override
    public int hashCode(){
        return firstName.hashCode() + lastName.hashCode();
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
}
