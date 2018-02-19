import java.util.Scanner;

public class PersonData {
    public static void main(String[] args) throws NameUndefinedException, IncorrectAgeException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj imię");
        String tempFirstName = sc.nextLine();
        System.out.println("Podaj nazwisko");
        String tempLastName = sc.nextLine();
        System.out.println("Podaj wiek");
        int tempAge = sc.nextInt();
        System.out.println("Podaj pesel");
        int tempPesel = sc.nextInt();

        Person person = new Person(tempFirstName, tempLastName, tempAge, tempPesel);
        try {
            person.setFirstName(tempFirstName);
        } catch (NameUndefinedException e) {
            System.out.println("Nie podałeś imienia lub imię jest zbyt krótkie");
            e.printStackTrace();
        }
        try {
            person.setLastName(tempLastName);
        } catch (NameUndefinedException e) {
            System.out.println("Nie podałeś nazwiska lub nazwisko jest zbyt krótkie");
            e.printStackTrace();
        }
        try {
            person.setAge(tempAge);
        } catch (IncorrectAgeException e) {
            System.out.println("Podałeś zbyt niski wiek");
        }
        person.setPesel(tempPesel);

        System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge() + " " + person.getPesel());
    }
}

