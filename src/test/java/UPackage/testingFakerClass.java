package UPackage;

import com.github.javafaker.Faker;

public class testingFakerClass {
	public static void main(String[] args) {
		Faker faker = new Faker();
		System.out.println(faker.name().fullName());
		System.out.println(faker.funnyName().name());
		System.out.println(faker.address().fullAddress());
		System.out.println(faker.chuckNorris().fact());
	}

}
