package com.coder.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * www.coder-training.com
 *
 * Author: Stefan Frerix
 *
 * This app is nothing special. It's just made for my spring boot class members to check
 * whether their installation settings are working perfectly.
 *
 * Just run the App.main method and open your browser with this url: 'localhost:8080'.
 * If you see a congratulation message then you have done everything correctly.
 */

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Check my installation app is starting..." );
        SpringApplication.run(App.class,args);
        System.out.println( "Check my installation app is started..." );
    }
}
