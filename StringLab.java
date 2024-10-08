public class StringLab{
    public static void main(String[] args) {

        String str = " Welcome to the Java String Lab! ";

    //Task 1

        System.out.println("Length of the string: " + str.length());
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Extracted word: " + str.substring(15, 19));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
        System.out.println("Contains 'Lab': " + str.contains("Lab"));
        System.out.println("Replaced 'Java' with 'Java Programming': " + str.replace("Java", "Java Programming"));

        // split()
        /*
        * For Split we need to initialize an array and iterate through it
        * */

        String[] words = str.split(" ");
        System.out.println("Words in the string:");

        //start of the loop
        for (String word : words) {
            System.out.println(word);
        }
        //loop ends

        System.out.println("\nTrimmed string: '" + str.trim() + "'");

        String strCompare = "java string lab!";
        //creating a variable to compare the string with

        System.out.println("Equals comparison: " + str.equals(strCompare));
        System.out.println("EqualsIgnoreCase comparison: " + str.equalsIgnoreCase(strCompare));

        //Separating tasks with dashes using for loop
        for(int i=0; i<80;i++){
            System.out.print("-");
        }
        System.out.println();


        // Task 2: Working with StringBuilder
        StringBuilder builder= new StringBuilder("StringBuilder Lab");

        builder.append(" - Learning Java");
        System.out.println("StringBuilder after append: " + builder);

        builder.insert(builder.indexOf("Lab") + 3, " is fun");
        System.out.println("StringBuilder after insert: " + builder);

        builder.delete(builder.indexOf("Learning"), builder.indexOf("Learning") + 8);
        System.out.println("StringBuilder after delete: " + builder);

        builder.reverse();
        System.out.println("StringBuilder after reverse: " + builder);


        //Dashes to separate tasks
        for(int i=0; i<80;i++){
            System.out.print("-");
        }
        System.out.println();


        // Task 3: Working with StringBuffer
        StringBuffer buffer = new StringBuffer("Multithreading Lab");

        buffer.append(" - Learning Java");
        System.out.println("StringBuffer after append: " + buffer);

        buffer.insert(buffer.indexOf("Lab") + 3, " is fun");
        System.out.println("StringBuffer after insert: " + buffer);

        buffer.delete(buffer.indexOf("Learning"), buffer.indexOf("Learning") + 8);
        System.out.println("StringBuffer after delete: " + buffer);

        buffer.reverse();
        System.out.println("StringBuffer after reverse: " + buffer);

        for(int i=0; i<80;i++){
            System.out.print("-");
        }
    }
}
