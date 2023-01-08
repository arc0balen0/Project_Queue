import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());

        while (!queue.isEmpty()) {
            Person personPool = queue.poll();
            personPool.quantityTickets = personPool.quantityTickets - 1;
            System.out.printf("%s %s прокатился на аттракционе (у него/нее осталось %d билета(ов)\n ", personPool.name, personPool.sureName, personPool.quantityTickets);
            if (personPool.quantityTickets > 0) {
                queue.add(personPool);
            }
        }
    }

    private static List<Person> generateClients() {
        return List.of(
                new Person("Антон", "Сергеевич", 2),
                new Person("Михаил", "Аветисян", 3),
                new Person("Игорь", "Васильев", 3),
                new Person("Павел", "Сертуков", 5),
                new Person("Елисей", "Лукьянов", 2)
        );

    }
}
