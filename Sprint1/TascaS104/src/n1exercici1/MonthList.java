package n1exercici1;
import java.util.ArrayList;
import java.util.Arrays;

public class MonthList {
  private static ArrayList<String> months;

  public MonthList() {
    // Inicialitza la llista de mesos amb els noms de tots els mesos de l'any
    months = new ArrayList<String>(Arrays.asList(
      "Gener", "Febrer", "Març", "Abril", "Maig", "Juny",
      "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre"
    ));
  }

  public static ArrayList<String> getMonths() {
    return months;
  }
}