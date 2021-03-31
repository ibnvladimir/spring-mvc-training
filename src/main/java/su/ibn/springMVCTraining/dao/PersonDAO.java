package su.ibn.springMVCTraining.dao;

import org.springframework.stereotype.Component;
import su.ibn.springMVCTraining.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int ID = 0;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++ID, "Tom"));
        people.add(new Person(++ID, "Sara"));
        people.add(new Person(++ID, "Umy"));
        people.add(new Person(++ID, "Ban"));
        people.add(new Person(++ID, "Iris"));
    }

    public List<Person> getPeople() {
        return people;
    }

    public Person getPerson(int id) {
        return people.stream()
                     .filter(people -> people.getId() == id)
                     .findAny()
                     .orElse(null);
    }

    public void save(Person person) {
        person.setId(++ID);
        people.add(person);
    }

    public void update(Person updatedPerson, int id) {
        Person personToBeUpdated = getPerson(id);
        personToBeUpdated.setName(updatedPerson.getName());
    }

    public void delete(int id) {
        people.removeIf(person -> person.getId() == id);
    }
}
