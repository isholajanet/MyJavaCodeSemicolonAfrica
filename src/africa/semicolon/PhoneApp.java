package africa.semicolon;

import java.util.Scanner;

public class PhoneApp {

    public static String menuFunction(){
        return """
                --> Enter 1 for Phone book
                --> Enter 2 for Messages
                --> Enter 3 for Chat
                --> Enter 4 for Call register
                --> Enter 5 for Tones
                --> Enter 6 for Settings
                --> Enter 7 for Call divert
                --> Enter 8 for Games
                --> Enter 9 for calculator
                --> Enter 10 for reminder
                --> Enter 11 for Clock
                --> Enter 12 for profiles
                --> Enter 13 for sim services  
                """;
    }
    public static String phoneBookFunctions(){
        return """
                0. Main menu functions
                1. Search
                2. Service Nos.
                3. Add name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send b'card
                8. Options --> Explore 
                9. Speed dials
                10. Voice tags
                """;


    }
    public static String optionsFunctions(){
        return """
                0. Main menu function
                1. Type Of view
                2. Memory status
                3. Phone book function 
                """;
    }
    public static String messagesFunctions(){
        return """
                0. Main menu functions
                1. Write messages
                2. Inbox
                3. Outbox
                4. Picture messages
                5. Templates
                6. Smileys
                7. Message setting
                    --> Enter an option to explore
                8. Info service
                9. Voice Mailbox number
                10. Service command editor
                """;
    }
    public static String messageSettingFunctions(){
        return """
                0. Main menu 
                1. Set
                2. Common
                3. Messages 
                """;
    }
    public static String setFunctions(){
        return """
                0. Main menu
                1. Message centre number
                2. Messages sent as
                3. Message validity
                4. Message settings
                """;
    }
    public static String commonFunctions(){
        return """
                0. Main menu
                1. Delivery report
                2. Reply via same centre
                3. Character support
                4. Message settings
                """;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(menuFunction());
        int userInput = 0;
        while(userInput != -1) {
            System.out.println("Enter an option: ");
            userInput = input.nextInt();
            switch (userInput) {
                case 0 -> System.out.println(menuFunction());
                case 1 -> {
                    System.out.println(phoneBookFunctions());
                    System.out.println("Enter an option: ");
                    userInput = input.nextInt();
                    if (userInput == 8) {
                        System.out.println(optionsFunctions());
                    }
                    System.out.println("Enter an option: ");
                    userInput = input.nextInt();
                    switch (userInput) {
                        case 0 -> System.out.println(menuFunction());
                        case 3 -> System.out.println(phoneBookFunctions());
                    }
                }
                case 2 -> {
                    System.out.println(messagesFunctions());
                    System.out.println("Enter an option: ");
                    userInput = input.nextInt();
                    if(userInput == 0){
                        System.out.println(menuFunction());
                    }else if(userInput == 7){
                        System.out.println(messageSettingFunctions());
                        System.out.println("Enter an option: ");
                        userInput = input.nextInt();
                        switch (userInput){
                            case 0 -> System.out.println(menuFunction());
                            case 1 -> {
                                System.out.println(setFunctions());
                                System.out.println("Enter an option: ");
                                userInput = input.nextInt();
                                if(userInput == 4){
                                    System.out.println(messageSettingFunctions());
                                } else if(userInput == 0){
                                    System.out.println(menuFunction());
                                }
                            }
                            case 2 -> System.out.println(commonFunctions());
                            case 3 -> {
                                System.out.println(messagesFunctions());
                                System.out.println("Enter an option: ");
                                userInput = input.nextInt();
                                if(userInput == 7){
                                    System.out.println(messageSettingFunctions());
                                }
                            }
                            case 4 -> System.out.println(messageSettingFunctions());
                            default -> System.out.println("Enter a valid input: ");

                        }
                    }



                }
            }
        }

    }



}
