import java.util.Scanner;

public class PersonData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person1= new Person();
        System.out.println("Podaj imię");
        try {
            person1.setFirstName(sc.nextLine());
        } catch (NameUndefinedException ex){
            System.out.println("Nic nie podałeś lub podanę imię jest za krótkie");
        }
        System.out.println("Podaj nazwisko");
        try {
            person1.setLastName(sc.nextLine());
        }catch (NameUndefinedException ex){
            System.out.println("Nic nie podałeś lub podane nazwisko jest za krótkie");
        }
        System.out.println("Podaj wiek");
        try {
            person1.setAge(sc.nextInt());
        }catch (IncorrectAgeException ex){
            System.out.println("Nieprawidłowy wiek, podaj wartość większą od 1");
        }
        System.out.println("Podaj pesel");
        person1.setPesel(sc.nextInt());
        System.out.println(person1.getFirstName()+" "+person1.getLastName()+" "+person1.getAge()+", "+person1.getPesel());
    }
}

