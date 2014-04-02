import java.util.concurrent.TimeUnit;

public class ChanceTest {
    public static void main(String[] args){
        long startTime, endTime, elapsed;

        System.out.println("Running tests...");
        startTime = System.nanoTime();

        // create the Chance object
        Chance chance = new Chance();

        // tests
        // helper
        System.out.println("capitalize(\"xyz\"): " + chance.capitalize("xyz"));

        // integer
        System.out.println("integer(): " + chance.integer());
        System.out.println("integer(50): " + chance.integer(50));
        System.out.println("integer(25,50): " + chance.integer(25, 50));
        System.out.println("integer(-25,1): " + chance.integer(-25, 1));

        // bool
        System.out.println("bool(): " + chance.bool());

        // character
        System.out.println("character(): " + chance.character());
        System.out.println("character([x,y,z]): " + chance.character("xyz".toCharArray()));

        // string
        System.out.println("string(): " + chance.string());
        System.out.println("string(5): " + chance.string(5));

        // pick
        System.out.println("pick(objs): " + chance.pick(new Object[]{"xyz", "abc", "def"}));

        // sentence
        System.out.println("sentence(): " + chance.sentence());
        System.out.println("sentence(5): " + chance.sentence(5));

        // syllable
        System.out.println("syllable(): " + chance.syllable());

        // word
        System.out.println("word(): " + chance.word());

        // age
        System.out.println("age(): " + chance.age());
        System.out.println("age(ADULT): " + chance.age(Chance.Age.ADULT));

        // gender
        System.out.println("gender(): " + chance.gender());

        // names
        System.out.println("first(): " + chance.first());
        System.out.println("last(): " + chance.last());
        System.out.println("name(): " + chance.name());
        System.out.println("name(true): " + chance.name(true));
        System.out.println("prefix(): " + chance.prefix());
        System.out.println("prefix(true): " + chance.prefix(true));

        // dice
        System.out.println("d4(): " + chance.d4());
        System.out.println("d6(): " + chance.d6());
        System.out.println("d8(): " + chance.d8());

        System.out.println("d10(): " + chance.d10());
        System.out.println("d12(): " + chance.d12());
        System.out.println("d20(): " + chance.d20());
        System.out.println("d30(): " + chance.d30());

        System.out.println("d100(): " + chance.d100());


        endTime = System.nanoTime();

        elapsed = TimeUnit.NANOSECONDS.toMillis((endTime - startTime));

        System.out.println("Completed tests in " + elapsed + " ms");
    }
}
