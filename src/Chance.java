import java.util.Random;

public class Chance {
    private final static int MAX_INT = Integer.MAX_VALUE;
    private final static int MIN_INT = Integer.MIN_VALUE;
    private final static char[] NUMBERS = ("1234567890").toCharArray();
    private final static String HEX_POOL = new String(NUMBERS) + "abcdef";
    private final static char[] CHARS_LOWER = ("abcdefghijklmnopqrstuvwxyz").toCharArray();
    private final static char[] CHARS_UPPER = new String(CHARS_LOWER).toUpperCase().toCharArray();
    private final static char[] SYMBOLS = ("!@#$%^&*()[]").toCharArray();
    private final static String[] FIRST_NAMES = {"Sophia", "Emma", "Isabella", "Jacob", "Mason", "Ethan", "Noah", "Olivia", "William", "Liam", "Jayden", "Michael", "Ava", "Alexander", "Aiden", "Daniel", "Matthew", "Elijah", "Emily", "James", "Anthony", "Benjamin", "Abigail", "Joshua", "Andrew", "David", "Joseph", "Logan", "Jackson", "Mia", "Christopher", "Gabriel", "Madison", "Samuel", "Ryan", "Lucas", "John", "Nathan", "Isaac", "Dylan", "Caleb", "Elizabeth", "Chloe", "Christian", "Landon", "Jonathan", "Carter", "Ella", "Luke", "Owen", "Brayden", "Avery", "Gavin", "Wyatt", "Addison", "Isaiah", "Aubrey", "Henry", "Eli", "Hunter", "Lily", "Jack", "Natalie", "Evan", "Sofia", "Jordan", "Nicholas", "Tyler", "Aaron", "Charlotte", "Zoey", "Jeremiah", "Julian", "Cameron", "Grace", "Hannah", "Amelia", "Harper", "Levi", "Lillian", "Brandon", "Angel", "Austin", "Connor", "Adrian", "Robert", "Samantha", "Charles", "Evelyn", "Victoria", "Thomas", "Brooklyn", "Sebastian", "Zoe", "Colton", "Jaxon", "Layla", "Kevin", "Zachary", "Ayden", "Dominic", "Blake", "Jose", "Hailey", "Oliver", "Justin", "Bentley", "Leah", "Jason", "Chase", "Ian", "Kaylee", "Anna", "Aaliyah", "Gabriella", "Josiah", "Allison", "Parker", "Xavier", "Nevaeh", "Alexis", "Adam", "Audrey", "Cooper", "Savannah", "Sarah", "Alyssa", "Claire", "Taylor", "Riley", "Camila", "Nathaniel", "Arianna", "Ashley", "Grayson", "Jace", "Brianna", "Carson", "Sophie", "Peyton", "Nolan", "Tristan", "Luis", "Brody", "Bella", "Khloe", "Genesis", "Alexa", "Juan", "Hudson", "Serenity", "Kylie", "Aubree", "Scarlett", "Bryson", "Carlos", "Stella", "Maya", "Easton", "Katherine", "Julia", "Damian", "Alex", "Kayden", "Ryder", "Lucy", "Madelyn", "Jesus", "Cole", "Autumn", "Makayla", "Kayla", "Mackenzie", "Micah", "Vincent", "Max", "Lauren", "Jaxson", "Gianna", "Eric", "Ariana", "Asher", "Hayden", "Faith", "Alexandra", "Melanie", "Sydney", "Bailey", "Caroline", "Naomi", "Morgan", "Kennedy", "Ellie", "Jasmine", "Eva", "Skylar", "Diego", "Kimberly", "Violet", "Molly", "Miles", "Steven", "Aria", "Ivan", "Jocelyn", "Trinity", "Elias", "Aidan", "Maxwell", "London", "Bryce", "Lydia", "Madeline", "Antonio", "Giovanni", "Reagan", "Timothy", "Bryan", "Piper", "Andrea", "Santiago", "Annabelle", "Maria", "Colin", "Richard", "Braxton", "Kaleb", "Brooke", "Kyle", "Kaden", "Preston", "Payton", "Miguel", "Jonah", "Paisley", "Paige", "Lincoln", "Ruby", "Nora", "Riley", "Mariah", "Leo", "Victor", "Brady", "Jeremy", "Mateo", "Brian", "Jaden", "Ashton", "Patrick", "Rylee", "Declan", "Lilly", "Brielle", "Sean", "Joel", "Gael", "Sawyer", "Alejandro", "Jade", "Marcus", "Destiny", "Leonardo", "Jesse", "Caden", "Jake", "Kaiden", "Nicole", "Mila", "Wesley", "Kendall", "Liliana", "Camden", "Kaitlyn", "Natalia", "Sadie", "Edward", "Brantley", "Jordyn", "Roman", "Vanessa", "Mary", "Mya", "Penelope", "Isabelle", "Alice", "Axel", "Silas", "Jude", "Grant", "Reese", "Gabrielle", "Hadley", "Katelyn", "Angelina", "Rachel", "Isabel", "Eleanor", "Cayden", "Emmanuel", "George", "Clara", "Brooklynn", "Jessica", "Maddox", "Malachi", "Bradley", "Alan", "Weston", "Elena", "Gage", "Aliyah", "Vivian", "Laila", "Sara", "Amy", "Devin", "Eliana", "Greyson", "Lyla", "Juliana", "Kenneth", "Mark", "Oscar", "Tanner", "Rylan", "Valeria", "Adriana", "Nicolas", "Makenzie", "Harrison", "Elise", "Mckenzie", "Derek", "Quinn", "Delilah", "Peyton", "Ezra", "Cora", "Kylee", "Tucker", "Emmett", "Avery", "Cody", "Rebecca", "Gracie", "Izabella", "Calvin", "Andres", "Jorge", "Abel", "Paul", "Abraham", "Kai", "Josephine", "Alaina", "Michelle", "Jennifer", "Collin", "Theodore", "Ezekiel", "Eden", "Omar", "Jayce", "Valentina", "Conner", "Bennett", "Aurora", "Catherine", "Stephanie", "Trevor", "Valerie", "Eduardo", "Peter", "Maximus", "Jayla", "Jaiden", "Willow", "Jameson", "Seth", "Daisy", "Alana", "Melody", "Hazel", "Kingston", "Summer", "Melissa", "Javier", "Margaret", "Travis", "Kinsley", "Kinley", "Garrett", "Everett", "Ariel", "Lila", "Graham", "Giselle", "Ryleigh", "Xander", "Haley", "Julianna", "Ivy", "Alivia", "Cristian", "Brynn", "Damien", "Ryker", "Griffin", "Keira", "Daniela", "Aniyah", "Angela", "Kate", "Londyn", "Corbin", "Myles", "Hayden", "Harmony", "Adalyn", "Luca", "Zane", "Francisco", "Ricardo", "Alexis", "Stephen", "Zayden", "Megan", "Allie", "Gabriela", "Iker", "Drake", "Alayna", "Lukas", "Presley", "Charlie", "Spencer", "Zion", "Erick", "Jenna", "Josue", "Alexandria", "Ashlyn", "Adrianna", "Jada", "Jeffrey", "Trenton", "Fiona", "Chance", "Norah", "Paxton", "Elliot", "Emery", "Fernando", "Maci", "Miranda", "Keegan", "Landen", "Ximena", "Amaya", "Manuel", "Amir", "Shane", "Cecilia", "Raymond", "Andre", "Ana", "Shelby", "Katie", "Hope", "Callie", "Jordan", "Luna", "Leilani", "Eliza", "Mckenna", "Angel", "Genevieve", "Makenna", "Isla", "Lola", "Danielle", "Chelsea", "Leila", "Tessa", "Adelyn", "Camille", "Mikayla", "Adeline", "Adalynn", "Sienna", "Esther", "Jacqueline", "Emerson", "Arabella", "Maggie", "Athena", "Lucia", "Lexi", "Ayla"};
    private final static String[] LAST_NAMES = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson", "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "Hernandez", "King", "Wright", "Lopez", "Hill", "Scott", "Green", "Adams", "Baker", "Gonzalez", "Nelson", "Carter", "Mitchell", "Perez", "Roberts", "Turner", "Phillips", "Campbell", "Parker", "Evans", "Edwards", "Collins", "Stewart", "Sanchez", "Morris", "Rogers", "Reed", "Cook", "Morgan", "Bell", "Murphy", "Bailey", "Rivera", "Cooper", "Richardson", "Cox", "Howard", "Ward", "Torres", "Peterson", "Gray", "Ramirez", "James", "Watson", "Brooks", "Kelly", "Sanders", "Price", "Bennett", "Wood", "Barnes", "Ross", "Henderson", "Coleman", "Jenkins", "Perry", "Powell", "Long", "Patterson", "Hughes", "Flores", "Washington", "Butler", "Simmons", "Foster", "Gonzales", "Bryant", "Alexander", "Russell", "Griffin", "Diaz", "Hayes", "Myers", "Ford", "Hamilton", "Graham", "Sullivan", "Wallace", "Woods", "Cole", "West", "Jordan", "Owens", "Reynolds", "Fisher", "Ellis", "Harrison", "Gibson", "McDonald", "Cruz", "Marshall", "Ortiz", "Gomez", "Murray", "Freeman", "Wells", "Webb", "Simpson", "Stevens", "Tucker", "Porter", "Hunter", "Hicks", "Crawford", "Henry", "Boyd", "Mason", "Morales", "Kennedy", "Warren", "Dixon", "Ramos", "Reyes", "Burns", "Gordon", "Shaw", "Holmes", "Rice", "Robertson", "Hunt", "Black", "Daniels", "Palmer", "Mills", "Nichols", "Grant", "Knight", "Ferguson", "Rose", "Stone", "Hawkins", "Dunn", "Perkins", "Hudson", "Spencer", "Gardner", "Stephens", "Payne", "Pierce", "Berry", "Matthews", "Arnold", "Wagner", "Willis", "Ray", "Watkins", "Olson", "Carroll", "Duncan", "Snyder", "Hart", "Cunningham", "Bradley", "Lane", "Andrews", "Ruiz", "Harper", "Fox", "Riley", "Armstrong", "Carpenter", "Weaver", "Greene", "Lawrence", "Elliott", "Chavez", "Sims", "Austin", "Peters", "Kelley", "Franklin", "Lawson", "Fields", "Gutierrez", "Ryan", "Schmidt", "Carr", "Vasquez", "Castillo", "Wheeler", "Chapman", "Oliver", "Montgomery", "Richards", "Williamson", "Johnston", "Banks", "Meyer", "Bishop", "McCoy", "Howell", "Alvarez", "Morrison", "Hansen", "Fernandez", "Garza", "Harvey", "Little", "Burton", "Stanley", "Nguyen", "George", "Jacobs", "Reid", "Kim", "Fuller", "Lynch", "Dean", "Gilbert", "Garrett", "Romero", "Welch", "Larson", "Frazier", "Burke", "Hanson", "Day", "Mendoza", "Moreno", "Bowman", "Medina", "Fowler", "Brewer", "Hoffman", "Carlson", "Silva", "Pearson", "Holland", "Douglas", "Fleming", "Jensen", "Vargas", "Byrd", "Davidson", "Hopkins", "May", "Terry", "Herrera", "Wade", "Soto", "Walters", "Curtis", "Neal", "Caldwell", "Lowe", "Jennings", "Barnett", "Graves", "Jimenez", "Horton", "Shelton", "Barrett", "Obrien", "Castro", "Sutton", "Gregory", "McKinney", "Lucas", "Miles", "Craig", "Rodriquez", "Chambers", "Holt", "Lambert", "Fletcher", "Watts", "Bates", "Hale", "Rhodes", "Pena", "Beck", "Newman", "Haynes", "McDaniel", "Mendez", "Bush", "Vaughn", "Parks", "Dawson", "Santiago", "Norris", "Hardy", "Love", "Steele", "Curry", "Powers", "Schultz", "Barker", "Guzman", "Page", "Munoz", "Ball", "Keller", "Chandler", "Weber", "Leonard", "Walsh", "Lyons", "Ramsey", "Wolfe", "Schneider", "Mullins", "Benson", "Sharp", "Bowen", "Daniel", "Barber", "Cummings", "Hines", "Baldwin", "Griffith", "Valdez", "Hubbard", "Salazar", "Reeves", "Warner", "Stevenson", "Burgess", "Santos", "Tate", "Cross", "Garner", "Mann", "Mack", "Moss", "Thornton", "Dennis", "McGee", "Farmer", "Delgado", "Aguilar", "Vega", "Glover", "Manning", "Cohen", "Harmon", "Rodgers", "Robbins", "Newton", "Todd", "Blair", "Higgins", "Ingram", "Reese", "Cannon", "Strickland", "Townsend", "Potter", "Goodwin", "Walton", "Rowe", "Hampton", "Ortega", "Patton", "Swanson", "Joseph", "Francis", "Goodman", "Maldonado", "Yates", "Becker", "Erickson", "Hodges", "Rios", "Conner", "Adkins", "Webster", "Norman", "Malone", "Hammond", "Flowers", "Cobb", "Moody", "Quinn", "Blake", "Maxwell", "Pope", "Floyd", "Osborne", "Paul", "McCarthy", "Guerrero", "Lindsey", "Estrada", "Sandoval", "Gibbs", "Tyler", "Gross", "Fitzgerald", "Stokes", "Doyle", "Sherman", "Saunders", "Wise", "Colon", "Gill", "Alvarado", "Greer", "Padilla", "Simon", "Waters", "Nunez", "Ballard", "Schwartz", "McBride", "Houston", "Christensen", "Klein", "Pratt", "Briggs", "Parsons", "McLaughlin", "Zimmerman", "French", "Buchanan", "Moran", "Copeland", "Roy", "Pittman", "Brady", "McCormick", "Holloway", "Brock", "Poole", "Frank", "Logan", "Owen", "Bass", "Marsh", "Drake", "Wong", "Jefferson", "Park", "Morton", "Abbott", "Sparks", "Patrick", "Norton", "Huff", "Clayton", "Massey", "Lloyd", "Figueroa", "Carson", "Bowers", "Roberson", "Barton", "Tran", "Lamb", "Harrington", "Casey", "Boone", "Cortez", "Clarke", "Mathis", "Singleton", "Wilkins", "Cain", "Bryan", "Underwood", "Hogan", "McKenzie", "Collier", "Luna", "Phelps", "McGuire", "Allison", "Bridges", "Wilkerson", "Nash", "Summers", "Atkins"};
    private final static String[] NAME_PREFIXES_LONG = {"Doctor", "Miss", "Misses", "Mister"};
    private final static String[] NAME_PREFIXES_SHORT = {"Dr.", "Miss", "Mrs.", "Mr."};
    private Random random;


    public Chance() {
        // No seed specified, use UNIX timestamp
        random = new Random((System.currentTimeMillis() / 1000L));
    }

    public Chance(long seed) {
        // Use this seed
        random = new Random(seed);
    }

    /**
     * @param input string to capitalize
     * @return input string with first letter capitalized
     */
    public String capitalize(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    /**
     * @return integer between 0 and Java's maximum limit
     */
    public int integer() {
        return this.integer(0, MAX_INT);
    }

    /**
     * @param max the maximum integer to return
     * @return integer between 0 and specified max
     */
    public int integer(int max) {
        return this.integer(0, max);
    }

    /**
     * @param min integer minimum limit
     * @param max integer maximum limit
     * @return integer between specified min and max limits
     */
    public int integer(int min, int max) {
        min = Math.max(min, MIN_INT + 1);
        max = Math.min(max, MAX_INT - 1);

        return random.nextInt(max - min + 1) + min;
    }

    /**
     * @return boolean at 50% chance of being true
     */
    public boolean bool() {
        return random.nextBoolean();
    }

    /**
     * Returns
     * @param likelihood between 0 and 100
     * @return boolean at a custom chance of being true
     */
    public boolean bool(int likelihood) {
        return random.nextDouble() * 100 < likelihood;
    }

    /**
     * @return character from a pool of letters, symbols, and numbers
     */
    public char character() {
        String pool = "";
        pool += new String(CHARS_LOWER);
        pool += new String(CHARS_UPPER);
        pool += new String(SYMBOLS);
        pool += new String(NUMBERS);

        return pool.charAt(this.integer(pool.length() - 1));
    }

    /**
     * @param customPool array of characters to form the pool
     * @return character from custom pool argument
     */
    public char character(char[] customPool) {
        String pool = new String(customPool);
        return pool.charAt(this.integer(pool.length()-1));
    }

    /**
     * @param customPool string of characters to form the pool
     * @return character from custom pool argument string
     */
    public char character(String customPool) {
        return customPool.charAt(this.integer(pool.length() - 1));
    }

    /**
     * @return string of random characters at random length between 5 and 20
     */
    public String string() {
        int length = this.integer(5, 20);
        return this.string(length);
    }

    /**
     * @param length of the output string
     * @return string of random characters at the specified length
     */
    public String string(int length) {
        String text = "";
        for (int i = 0; i < length; i++) {
            text = text.concat(String.valueOf(this.character()));
        }
        return text;
    }

    /**
     * @param objects array to pick from
     * @return object from specified array of objects
     */
    public Object pick(Object[] objects) {
        return objects[this.integer(objects.length - 1)];
    }

    /**
     * @param words number of words in the sentence
     * @return string of specified number of words that make up an English sentence
     */
    public String sentence(int words) {
        String text = "";

        /*
        Heads up!
        The ChanceJS library used Javascript's handy Array.join() method here,
        unfortunately Java has no such method.
        Time to get dirty.
         */

        for (int i = 0; i < words; i++) {
            text = text.concat(this.word()).concat(" ");
        }
        text = text.trim();

        // Capitalize first letter
        text = this.capitalize(text);

        // Add a period
        text = text.concat(".");

        return text;
    }

    /**
     * @return string of 12 to 18 words that make up an English sentence
     */
    public String sentence() {
        return this.sentence(this.integer(12, 18));
    }

    /**
     * @return string of characters that make up an English syllable
     */
    public String syllable() {
        int length = this.integer(2, 3);
        String consonants = "bcdfghjklmnprstvwz";
        String vowels = "aeiou";
        String text = "";
        char chr = 0;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                // First character can be anything
                chr = this.character((consonants + vowels));
            } else if (consonants.indexOf(chr) == -1) {
                // Last character was a vowel, need consonant
                chr = this.character(consonants);
            } else {
                // Last character was a consonant, need a vowel
                chr = this.character(vowels);
            }

            text = text.concat(String.valueOf(chr));
        }

        return text;
    }

    /**
     * @return string of syllables that make up an English word
     */
    public String word() {
        int syllables = this.integer(1, 3);
        String text = "";
        for (int i = 0; i < syllables; i++) {
            text = text.concat(this.syllable());
        }
        return text;
    }

    /**
     *
     * @return int of a random age
     */
    public int age() {
        return this.age((Age) this.pick(Age.values()));
    }

    /**
     *
     * @param a Age category to generate from
     * @return int age from category
     */
    public int age(Age a) {
        switch (a) {
            case CHILD:
                return this.integer(1, 12);
            case TEEN:
                return this.integer(13, 19);
            case ADULT:
                return this.integer(18, 120);
            case SENIOR:
                return this.integer(65, 120);
            default:
                return this.integer(1, 120);
        }
    }

    // -- Person --

    /**
     *
     * @return String of a random gender (male or female)
     */
    public String gender() {
        return (String) this.pick(new String[]{"male", "female"});
    }

    /**
     *
     * @return String of a random first name
     */
    public String first() {
        return (String) this.pick(FIRST_NAMES);
    }

    /**
     *
     * @return String of a random last name
     */
    public String last() {
        return (String) this.pick(LAST_NAMES);
    }

    /**
     *
     * @return String of a first name, middle initial, and last name
     */
    public String name() {
        return this.name(true);
    }

    /**
     *
     * @param middleInitial set true to generate a name with a middle initial
     * @return String with or without a middle initial based on parameter
     */
    public String name(boolean middleInitial) {
        String first = this.first();
        String last = this.last();
        if (middleInitial) {
            return first.concat(" ").concat(String.valueOf(this.character(CHARS_UPPER))).concat(".").concat(" ").concat(last);
        } else {
            return first.concat(" ").concat(last);
        }
    }

    /**
     *
     * @return String of a name prefix in the short style (ex. Mrs. or Dr.)
     */
    public String prefix() {
        return this.prefix(false);
    }

    /**
     *
     * @param longStyle boolean, set to true for a prefix in the long style (ex. Misses or Doctor)
     * @return String of a name prefix in the specified style
     */
    public String prefix(boolean longStyle) {
        if (longStyle) {
            return (String) this.pick(NAME_PREFIXES_LONG);
        } else {
            return (String) this.pick(NAME_PREFIXES_SHORT);
        }

    }

    // -- Dice --
    public int d4() {
        return this.integer(1, 4);
    }

    public int d6() {
        return this.integer(1, 6);
    }

    public int d8() {
        return this.integer(1, 8);
    }

    public int d10() {
        return this.integer(1, 10);
    }

    public int d12() {
        return this.integer(1, 12);
    }

    public int d20() {
        return this.integer(1, 20);
    }

    public int d30() {
        return this.integer(1, 30);
    }

    public int d100() {
        return this.integer(1, 100);
    }

    public enum Age {CHILD, TEEN, ADULT, SENIOR}


}
