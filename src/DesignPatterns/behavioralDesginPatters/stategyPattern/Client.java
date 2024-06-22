package src.DesignPatterns.behavioralDesginPatters.stategyPattern;
/*
* The Strategy Design Pattern is a behavioral design pattern that defines a family of algorithms,
*  encapsulates each one, and makes them interchangeable.
* This pattern allows the algorithm to vary independently from the clients that use it.
* The Strategy Pattern is particularly useful when you need to switch between different
* algorithms or behaviors at runtime.
* */


public class Client {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(new PlainTextFormatter());
        editor.publishText("Hello, World!");

        editor.setTextFormatter(new HtmlTextFormatter());
        editor.publishText("Hello, World!");

        editor.setTextFormatter(new MarkdownTextFormatter());
        editor.publishText("Hello, World!");
    }
}

