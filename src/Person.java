public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int pesel;

    public Person(String firstName, String lastName, int age, int pesel) throws NameUndefinedException, IncorrectAgeException {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NameUndefinedException{
        if (firstName==null||firstName.length()<2){
            throw new NameUndefinedException("Nie podałeś imienia lub imię jest zbyt krótkie");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName (String lastName) throws NameUndefinedException {
        if (lastName == null || lastName.length() < 2) {
            throw new NameUndefinedException("Nie podałeś nazwiska lub nazwisko jest zbyt krótkie");
        }
        this.lastName = lastName;
    }




    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException{
        if (age<1){
            throw  new IncorrectAgeException("Podaj inny wiek");
        }
        this.age = age;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }
}
