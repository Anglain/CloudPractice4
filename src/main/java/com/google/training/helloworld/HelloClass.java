package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () { }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }
    
    public HelloClass (String name, String period) {
        
        int p = Integer.parseInt(period);
        
        if (p == 1)
            this.message = "Good morning, ";
        else if (p == 2)
            this.message = "Good day, ";
        else if (p == 3)
            this.message = "Good evening, ";
        else
            this.message = "Good night, ";
        
        this.message += name + "!";
        
    }

    public String getMessage() {
        return message;
    }
}
