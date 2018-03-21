package ho0204;

public class Main {
    public static void main(String[] args) {
        String userInput = "entertaintment";
        String upperCased = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(upperCased);
        
        char firstCharacter = userInput.charAt(0); 
        System.out.println(firstCharacter);
        System.out.println("");
        System.out.println("Contains:" + userInput.contains("enter".toLowerCase()));
    }
}
