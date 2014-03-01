import java.util.Random;

public class Chance {
    private final static int MAX_INT = Integer.MAX_VALUE;
    private final static int MIN_INT = Integer.MIN_VALUE;
    private final static char[] NUMBERS = ("1234567890").toCharArray();
    private final static char[] CHARS_LOWER = ("abcdefghijklmnopqrstuvwxyz").toCharArray();
    private final static char[] CHARS_UPPER = new String(CHARS_LOWER).toUpperCase().toCharArray();
    private final static String HEX_POOL = new String(NUMBERS) + "abcdef";
    private final static char[] SYMBOLS = ("!@#$%^&*()[]").toCharArray();

    private Random random;

    public Chance(){
        // No seed specified, use UNIX timestamp
        random = new Random((System.currentTimeMillis()/1000L));
    }
    public Chance(long seed){
        // Use this seed
        random = new Random(seed);
    }

    /**
     * @return integer between Java's minimum and maximum limits
     */
    public int integer(){
        return this.integer(MIN_INT, MAX_INT);
    }

    /**
     * @param max the maximum integer to return
     * @return integer between 0 and specified max
     */
    public int integer(int max){
        return this.integer(0, max);
    }

    /**
     * @param min
     * @param max
     * @return integer between specified min and max limits
     */
    public int integer(int min, int max){
        return random.nextInt(max - min) + min;
    }

    /**
     * @return boolean at 50% chance of being true
     */
    public boolean bool(){
        return random.nextBoolean();
    }

    /**
     * Returns
     * @param likelihood between 0 and 100
     * @return boolean at a custom chance of being true
     */
    public boolean bool(int likelihood){
        return random.nextDouble() * 100 < likelihood;
    }

    /**
     * @return character from a pool of letters, symbols, and numbers
     */
    public char character(){
        String pool = "";
        pool += new String(CHARS_LOWER);
        pool += new String(CHARS_UPPER);
        pool += new String(SYMBOLS);
        pool += new String(NUMBERS);

        return pool.charAt(this.integer(pool.length()-1));
    }

    /**
     * @param customPool array of characters to form the pool
     * @return character from custom pool argument
     */
    public char character(char[] customPool){
        String pool = new String(customPool);
        return pool.charAt(this.integer(pool.length()-1));
    }

    /**
     * @param customPool string of characters to form the pool
     * @return character from custom pool argument string
     */
    public char character(String customPool){
        String pool = customPool;
        return pool.charAt(this.integer(pool.length()-1));
    }

    /**
     * @return string of random characters at random length between 5 and 20
     */
    public String string(){
        int length = this.integer(5, 20);
        return this.string(length);
    }

    /**
     * @param length of the output string
     * @return string of random characters at the specified length
     */
    public String string(int length){
        String text = "";
        for(int i = 0; i < length; i++){
            text.concat(String.valueOf(this.character()));
        }
        return text;
    }
}
