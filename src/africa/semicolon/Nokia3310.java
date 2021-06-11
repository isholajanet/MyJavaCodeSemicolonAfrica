package africa.semicolon;

import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        String prompt = """
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

        String phoneBook = """
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
        String options = """
                1. Type Of view
                2. Memory status
                """;
        String messages = """
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
        String messageSettings = """
                1. Set
                    ---> Explore
                2. Common
                    ---> Explore
                3. Chat
                4. Call Register
                """;
        String set = """
                1. Message centre number
                2. Message sent as
                3. Message validity
                """;
        String common = """
                1. Delivery reports
                2. Reply via same centre
                3. Character support
                """;
        String callRegister = """
                1. Missed calls
                2. Received calls
                3. Dialled numbers
                4. Erase recent call lists
                5. Show call duration
                6. Show call costs
                7. Call cost settings
                8. Prepaid credit
                """;
        String showCallDuration = """
                1. Last call duration
                2. All calls' duration
                3. Received calls' duration
                4. Dialled calls' duration
                5. Clear timers
                """;
        String showCallCosts = """
                1. Last call cost
                2. All calls' cost
                3. Clear counters
                """;
        String callCostSettings = """
                1. Call cost limit
                2. Show costs in
                """;
        String tones = """
                1. Ringing tone
                2. Ringing volume
                3. Incoming call alert
                4. Composer
                5. Message alert tone
                6. Keypad tones
                7. Warning and game tones
                8. Vibrating alert
                9. Screen saver
                """;
        String settings = """
                1. Call settings
                2. Phone settings
                3. Security settings
                4. Restore factory settings
                """;
        String callSettings = """
                1. Automatic redial
                2. Speed dialing
                3. Call waiting options
                4. Own number sending
                5. Phone line in use
                6. Automatic answer
                """;
        String phoneSettings = """
                1. Language
                2. Cell info display
                3. Welcome note
                4. Network selection
                5. Lights
                6. Confirm SIM service actions
                """;
        String securitySettings = """
                1. PIN code request
                2. Call barring service
                3. Fixed dialling
                4. Closed user group
                5. Phone security
                6. Change access codes
                """;
        String clock = """
                1. Alarm clock
                2. Clock settings
                3. Date setting
                4. Stopwatch
                5. Countdown timer
                6. Auto update of time and date
                """;

        do{
            System.out.println(prompt);
            userInput = input.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println(phoneBook);
                    userInput = input.nextInt();
                    if (userInput == 8) {
                        System.out.println(options);
                    }
                    break;
                case 2:
                    System.out.println(messages);
                    userInput = input.nextInt();
                    if (userInput == 7) {
                        System.out.println(messageSettings);
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1:
                                System.out.println(set);
                                System.out.println(messages);
                                break;
                            case 2:
                                System.out.println(common);
                                System.out.println(messages);
                                break;
                        }
                    }
                case 3:
                    System.out.println("3. Chat");
                    break;
                case 4:
                    System.out.println(callRegister);
                    userInput = input.nextInt();
                    switch (userInput){
                        case 5:
                            System.out.println(showCallDuration);
                            System.out.println(callRegister);
                            System.out.println();
                            break;
                        case 6:
                            System.out.println(showCallCosts);
                            System.out.println(callRegister);
                            System.out.println();
                            break;
                        case 7:
                            System.out.println(callCostSettings);
                            System.out.println(callRegister);
                            break;
                        default:
                            System.out.println(callRegister);
                    }
                case 5:
                    System.out.println(tones);
                    System.out.println(prompt);
                    break;
                case 6:
                    System.out.println(settings);
                    userInput = input.nextInt();
                    switch (userInput){
                        case 1:
                            System.out.println(callSettings);
                            System.out.println(settings);
                            break;
                        case 2:
                            System.out.println(phoneSettings);
                            System.out.println(settings);
                            break;
                        case 3:
                            System.out.println(securitySettings);
                            System.out.println(settings);
                            break;
                        default:
                            System.out.println("Enter a valid input ");
                    }
                case 11:
                    System.out.println("Clock");
                    break;
                case 12:
                    System.out.println("Profiles");
                    break;
                case 13:
                    System.out.println("Sim services");
                    break;
                case 14:
                    System.out.println("Enter 14 to Exit ");
                    break;
                default:
                    System.out.println("Enter a valid input: ");
                    userInput = input.nextInt();
                    }


        }while (userInput != 14);
    }
}
