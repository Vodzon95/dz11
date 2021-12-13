package com.vodzon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonGenerator {
    private static final String[] NAMES = {
            // MALE
            "Anthony", "James", "Aidan", "Jackson", "David", "Mason", "Logan", "Alexander", "Charles", "Bryan",
            "Angel", "Tyler", "Isaac", "John", "Nathaniel", "Samuel", "Austin", "Luis", "Benjamin", "Aiden",
            "Gabriel", "Carlos", "Robert", "Julian", "Lucas", "Brandon", "Diego", "Jose", "Alex", "Nicholas",
            "Timothy", "Nathan", "Brian", "Kevin", "Chase", "Carter", "Jonathan", "Owen", "Jack", "Jesus",
            "Luke", "Adrian", "Connor", "Dominic", "Steven", "Sebastian", "Ashton", "Jake", "Dylan", "Devin",
            "Hunter", "Colin", "Evan", "Richard", "Christopher", "Alejandro", "Kyle", "Jacob", "Elijah", "Antonio",
            "Andrew", "Cameron", "Landon", "Zachary", "Adam", "Matthew", "Jayden", "Sean", "William", "Ian",
            "Jesse", "Cody", "Jaden", "Ryan", "Jeremiah", "Joseph", "Juan", "Michael", "Nigel", "Noah",
            "Isaiah", "Seth", "Daniel", "Blake", "Jordan", "Cole", "Joshua", "Miguel", "Caleb", "Xavier",
            "Ethan", "Patrick", "Christian", "Eric", "Justin", "Hayden", "Jason", "Thomas", "Aaron", "Gavin",
            // FEMALE
            "Emilу", "Hannah", "Natalie", "Sophia", "Ella", "Madison", "Sydney", "Anna", "Taylor", "Isabella",
            "Kayla", "Victoria", "Elizabeth", "Ashley", "Rachel", "Alexis", "Julia", "Samantha", "Haley", "Olivia",
            "Sarah", "Jessica", "Ava", "Kaitlyn", "Katherine", "Megan", "Alexandrа", "Chloe", "Allison", "Alyssa",
            "Abigail", "Brianna", "Sara", "Gabriellа", "Lauren", "Destiny", "Jennifer", "Alexa", "Jasmine", "Gabrielle",
            "Sofia", "Autumn", "Lillian", "Mia", "Avery", "Marissa", "Jocelyn", "Caroline", "Melanie", "Leslie",
            "Katelyn", "Jordan", "Morgan", "Vanessa", "Savannah", "Angelina", "Maya", "Brooke", "Isabel", "Michelle",
            "Amia", "Faith", "Leah", "Amber", "Lily", "Amelia", "Hailey", "Molly", "Irea", "Maria",
            "Kimberly", "Kaylee", "Aaliyah", "Trinity", "Claire", "Makayla", "Bailey", "Zoe", "Arianna", "Nicole",
            "Diana", "Riley", "Melissa", "Mackenzie", "Ariana", "Danielle", "Kylie", "Jada", "Stephanie", "Paige",
            "Jenna", "Mary", "Erin", "Madeline", "Sierra", "Grace", "Audrey", "Rebecca", "Evelyn", "Camilla"
    };
    private static final String[] SURNAMES = {
            "Alberty", "Alexander", "Allard", "Allen", "Anderson", "Bailiff", "Bell", "Bennett", "Biffle", "Brooks",
            "Brown", "Butler", "Castillo", "Chia", "Christensen", "Coleman", "Cook", "Courtland", "Davis", "Diaz",
            "Dimick", "Dollar", "Easterlin", "Edwards", "Eubank", "Evans", "Fawn", "Felch", "Flores", "Foster",
            "Gagneux", "Garcia", "Gaylord", "Goleman", "Gomez", "Governor", "Gray", "Green", "Griffin", "Harkleroad",
            "Harris", "Hayes", "Hensley", "Hill", "Holt", "Hughes", "Imler", "Irving", "Jackson", "James",
            "Jimenez", "Johnson", "Jones", "Kelly", "Kim", "Kindermann", "King", "Lakin", "Lee", "Lepley",
            "Lewis", "Malich", "Martin", "Morales", "Murphy", "Myer", "Nelson", "Nguyen", "Ortiz", "Patterson",
            "Perez", "Perry", "Pershing", "Phillips", "Price", "Ramirez", "Ramos", "Reyes", "Richardson", "Ridlehoover",
            "Rivera", "Robinson", "Rogers", "Sanchez", "Sanders", "Sauerbrey", "Settlemire", "Simmons", "Smith",
            "Taylor", "Thomas", "Thompson", "Torres", "Turner", "Van", "Every", "Walker", "Ward", "Washington",
            "Wattson", "White"
    };

    private final List<Person> personList = new ArrayList<>();

    public PersonGenerator(int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            Person person = new Person(
                    NAMES[random.nextInt(NAMES.length)],
                    SURNAMES[random.nextInt(SURNAMES.length)]
            );
            personList.add(person);
        }
    }

    public void print() {
        for (Person p : personList) {
            System.out.printf("%-24s - %2d years old [%3dkg, %3dcm]\n",
                    p.getFirstName() + " " + p.getLastName(),
                    p.getAge(),
                    p.getWeight(),
                    p.getHeight()
            );
        }
    }
}