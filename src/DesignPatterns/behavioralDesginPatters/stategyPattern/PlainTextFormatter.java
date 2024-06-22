package src.DesignPatterns.behavioralDesginPatters.stategyPattern;

public class PlainTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println("Plain Text: " + text);
    }
}