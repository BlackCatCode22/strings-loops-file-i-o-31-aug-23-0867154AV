public class strings {
    public static void main(String [] args) {

        String myStr= "The quick brown fox jumped over the lazy dog";

        String phrase = "The quick brown fox jumped over the lazy dog";

        String myStr02 = "";

        int theCharIndex = 0;

        theCharIndex = myStr.indexOf("brown fox");

        System.out.println("\n The index of 'b' is: " + theCharIndex);

        myStr02 = myStr.substring(theCharIndex,19);

        System.out.println(phrase.substring(10,19));

    }

}
