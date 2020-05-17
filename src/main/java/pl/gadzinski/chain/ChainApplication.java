package pl.gadzinski.chain;

import java.util.Scanner;

public class ChainApplication {
    public static void main(String[] args) {
        EmergencyCenter emergencyCenter = new EmergencyCenter();
        System.out.println("Request service");
        System.out.println("police, fireFighters,ambulance");
        String input = new Scanner(System.in).nextLine();
    }
}
