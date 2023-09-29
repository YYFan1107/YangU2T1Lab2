public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("debbie", 11);
        debbie.greeting("debbie");
        debbie.bday();
        debbie.weather();
        debbie.favoriteNumber(11);
        System.out.println("I can convert feet to meters, 3 feet is " + debbie.convertFeetToMeters(3) + " meters");
        System.out.println("I can also add numbers, 1 + 2 + 3 is " + debbie.addNumbers(1,2,3));
        System.out.println(debbie.goodbye());
        System.out.println(debbie.question());
    }
}
