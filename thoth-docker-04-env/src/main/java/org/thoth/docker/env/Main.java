package org.thoth.docker.env;

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
        System.out.printf("  Env%n%n");

        System.out.printf("Hello Java!%n%n");

        System.getenv().keySet().stream()
            .filter(s -> s.startsWith("thoth"))
            .forEach(s -> {
            System.out.printf("%-20s%s%n", s, System.getenv(s));
        });

        System.out.printf("%nGood bye!%n");
    }
}
