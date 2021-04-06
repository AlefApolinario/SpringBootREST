package br.com.erudio.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.erudio.model.Person;

@Service
public class PersonService {
	private final AtomicLong counter = new AtomicLong();
	
	
	public Person create(Person person) {
		return person;
	}
	public Person update(Person person) {
		return person;
	}
	public void delete(String id) {
		
	}
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Alef");
		person.setLastName("Apolinario");
		person.setAdress("Mairinque-SP");
		person.setGender("male");
		return person;
	}

	public List<Person> findAll() {
		List<Person> persons = new ArrayList<Person>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}



	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name" + i);
		person.setLastName("Last Name" + i);
		person.setAdress("Some adress in Brazil" + i);
		person.setGender("male");
		return person;
	}
}
