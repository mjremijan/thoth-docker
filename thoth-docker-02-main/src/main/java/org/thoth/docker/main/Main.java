package org.thoth.docker.main;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Main {
    public static void main(String...args) {
        System.out.printf(" _____ _           _   _       ____             _%n");
        System.out.printf("|_   _| |__   ___ | |_| |__   |  _ \\  ___   ___| | _____ _ __ %n");
        System.out.printf("  | | | '_ \\ / _ \\| __| '_ \\  | | | |/ _ \\ / __| |/ / _ \\ '__|%n");
        System.out.printf("  | | | | | | (_) | |_| | | | | |_| | (_) | (__|   <  __/ |   %n");
        System.out.printf("  |_| |_| |_|\\___/ \\__|_| |_| |____/ \\___/ \\___|_|\\_\\___|_|   %n");
        System.out.printf("  Main%n%n");

        System.out.printf("Hello Java!%n");

        System.getProperties().keySet().stream()
            .map(k -> String.valueOf(k))
            .forEach(s -> {
            System.out.printf("%-35s%s%n", s, System.getProperty(s));
        });

        System.out.printf("%nGood bye!%n");
    }
}
