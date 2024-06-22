package src.DesignPatterns.behavioralDesginPatters.stategyPattern;

public class MarkdownTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println("**" + text + "**");
    }
}
