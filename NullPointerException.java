public class NullPointerException {
    public static void main(String[] args) {
        String str = null;

        try {
            // Attempting to call a method on a null object
            System.out.println("Length of string: " + str.length());
        } catch (NullPointerException1 e) {
            System.out.println("Error: Attempted to access a method on a null object.");
            e.printStackTrace();
        }
    }
}
