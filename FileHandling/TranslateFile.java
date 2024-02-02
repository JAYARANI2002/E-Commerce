import java.util.ResourceBundle;
import java.util.Locale;

public class TranslateFile {

  public static void main(String[] args) {
    // Get the source language and target language.
    Locale sourceLanguage = Locale.ENGLISH;
    Locale targetLanguage = Locale.FRENCH;

    // Get the text to be translated.
    String text = "Hello, world!";

    // Translate the text.
    String translatedText = ResourceBundle.getBundle("messages", targetLanguage).getString(text);

    // Print the translated text.
    System.out.println(translatedText);
  }
}
