package africa.semicolon;

import java.util.Scanner;

public class PhoneApp {


    public static String showMenu(){
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

    public static String phoneBookMenu(){
        return """
                1. Search
                2. Service Nos.
                3. Add name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send b'card
                8. Options
                9. Speed dials
                10. Voice tags
                """;
    }

    public static String selectPhoneBookMenu(int dial){
       return switch(dial) {
           case 1 -> "Search";
           case 2 -> "Service Nos";
           case 3 -> "Add name";
           case 4 -> "Erase";
           case 5 -> "Edit";
           case 6 -> "Assign tone";
           case 7 -> "Send b'card";
           case 8 -> "Options";
           case 9 -> "Speed dials";
           case 10 -> "Voice tags";

           default -> "Enter a valid input";
       };
    }

    public static String optionMenu(){
        return """
                1. Type Of view
                2. Memory status
                """;
    }

    public static String selectMenu(int dial){
        return switch (dial){
            case 1 -> "Phone book";
            case 2 -> "Messages";
            case 3 -> "Chat";
            case 4 -> "Call Register";
            case 5 -> "Tones";
            case 6 -> "Settings";
            case 7 -> "Call divert";
            case 8 -> "Games";
            case 9 -> "Calculator";
            case 10 -> "Reminder";
            case 11 -> "Clock";
            case 12 -> "Profiles";
            case 13 -> "Sim services";

            default -> "Enter a valid input: ";
        };
    }
    public static String messagesMenu(){
        return """
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
    public static String messageSetting(){
        return """
                 1. Set
                    ---> Explore
                2. Common
                    ---> Explore
                3. Chat
                4. Call Register
                """;

    }
  public static String selectMessageSetting(int dial){
        messageSetting();
        return switch (dial){
            case 1  -> """
                1. Message centre number
                2. Message sent as
                3. Message validity
                    """;
            case 2 -> """
                1. Delivery reports
                2. Reply via same centre
                3. Character support
                    """;


            default -> "Enter a valid input: ";
        };
  }
    public static String selectMessagesMenu(int dial){
        return switch (dial){
            case 1 -> "Write messages";
            case 2 -> "Inbox";
            case 3 -> "Outbox";
            case 4 -> "Picture ";

            default -> "Enter a valid input: ";
        };
    }


    public static void main(String[] args) {

    }
}
