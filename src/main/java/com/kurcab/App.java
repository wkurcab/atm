package com.kurcab;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;

/**
 * Hello world!
 *
 */
@AllArgsConstructor
public class App {
    public static void main( String[] args ) {
        Gson gson = new Gson();
        System.out.println( "Hello World!" );
    }
}
