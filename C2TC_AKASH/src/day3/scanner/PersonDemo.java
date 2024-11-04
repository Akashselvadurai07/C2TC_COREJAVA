package day3.scanner;
import java.util.*;

import day3.scanner.Person;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		String name;
		System.out.println("Enter Person Name :");
		name = ob.next();
		System.out.println("Enter age: ");
		int age = ob.nextInt();
		System.out.println("Enter gender: ");
		String gender = ob.next();
		System.out.println("Enter taxable income:");
		int income = ob.nextInt();
		//Person object and initialize values

		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		System.out.println(person);

	}

}
