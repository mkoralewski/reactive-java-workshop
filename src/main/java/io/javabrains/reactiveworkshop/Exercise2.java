package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        ReactiveSources.intNumbersFlux()
                .subscribe(
                        it -> System.out.println(Thread.currentThread().getName() + "  " + it)
                );

        // Print all users in the ReactiveSources.userFlux stream
        ReactiveSources.userFlux()
                .subscribe(
                        it -> System.out.println(Thread.currentThread().getName() + "  " + it)
                );

        System.out.println(Thread.currentThread().getName() + "  Press a key to end");
        System.in.read();
    }

}
