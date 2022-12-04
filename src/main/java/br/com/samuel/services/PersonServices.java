package br.com.samuel.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.samuel.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	public Person findById(String id) {	
		logger.info("CLASS - PersonServices | METHOD - findById | ID - " + id);
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Samuel");
		person.setLastName("Lucas");
		person.setAddress("Uberlândia - Minas Gerais - Brasil");
		person.setGender("Male");
		return person;
	}
	
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<>();
		
		logger.info("CLASS - PersonServices | METHOD - findAll");
		for(int i = 0; i < 5; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		
		return persons;
	}
	
	public Person createPerson(Person person) {
		logger.info("CLASS - PersonServices | METHOD - createPerson | Person ID - " + person.getId());
		return person;
	}
	
	public Person updatePerson(Person person) {
		logger.info("CLASS - PersonServices | METHOD - updatePerson | Person ID - " + person.getId());
		
		return person;
	}
	
	public void deletePerson(String id) {
		logger.info("CLASS - PersonServices | METHOD - deletePerson | Person ID - " + id);
	}
	
	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Samuel");
		person.setLastName("Lucas");
		person.setAddress("Uberlândia - Minas Gerais - Brasil");
		person.setGender("Male");
		return person;
	}
}
