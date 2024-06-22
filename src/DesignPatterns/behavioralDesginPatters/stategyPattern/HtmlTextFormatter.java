package src.DesignPatterns.behavioralDesginPatters.stategyPattern;

public class HtmlTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println("<html><body>" + text + "</body></html>");
    }
}