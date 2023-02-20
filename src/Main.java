import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Logic logic = new Logic();
        boolean tutorial = true;
        while (true) {
            //Hello
            Scanner scan = new Scanner(System.in);
            if (tutorial) {
                System.out.println("Välkommen till morse översättaren. Skriv på engelska för att få ut översättningen till morse.");
                System.out.println("Du kan också skriva in morse direkt med punkt . samt bindestreck - glöm inte att separera varje bokstav med ett mellanrum samt varje ord med /");
                System.out.println("Avsluta programmet kan du göra genom att skriva en stjärna *");
            }
            System.out.println("Vänligen skriv på engelska eller morse enligt anvisningar:");
            try {
                String input = scan.nextLine();
                tutorial = false;
                logic.checkStop(input);
                boolean stop = logic.getStop();
                if (stop) break;

                System.out.println(Logic.translate(input));

                //Felhantering
                logic.checkSwedishLetters(input);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Du kan väl åtminstonde skriva nånting?");
            } catch (Exception e) {
                System.out.println("Något gick fel!");
            }
        }
    }
}