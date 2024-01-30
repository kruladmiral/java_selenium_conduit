package faker;

import com.github.javafaker.Faker;
public class fakeGenerator {
	static Faker faker = new Faker();
	public static String name() {
		return faker.name().firstName();
	}
	public static String email() {
		return faker.internet().emailAddress();
	}
	public static String password() {
		return "QWERTY1234";
	}
}
