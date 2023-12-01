package com.edureka.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleApplication {
 public void run() {
	 System.out.println("Started the practice");

	 System.out.println("Trying to create merge issue");

	 System.out.println("Replicated the merge conflict");

 }
 public static void main(String[] args) throws Exception {
	 SampleApplication application= new SampleApplication();
	 //application.run();
	 SpringApplication.run(SampleApplication.class, args);
}

}
