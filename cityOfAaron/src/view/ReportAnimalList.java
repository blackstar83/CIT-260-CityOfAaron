/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cityofaaron.CityOfAaron;
import exceptions.GameControlException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import model.Animal;


/**
 *
 * @author Yazzie Family
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class ReportAnimalList extends ViewBase{
    public ReportAnimalList() {
        
    }
    @Override
    public String getMessage() {
        return "Send Animal List Report to File:\n";
    }
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        inputs[0] = getUserInput("Enter the name of your report\n"
        + "Or press Enter to return to the previous Menu", true);
        return inputs;
    }
    @Override
    public boolean doAction(String[] inputs) {
         try {
            if (inputs[0] == null || inputs[0].equals("")) {
                throw new GameControlException("No file name entered so sending you back to the Reports Menu...");
            }
            String fileName = inputs[0];
            writeToFile(fileName);
            this.console.println("Animal List Report saved as " + fileName);
         } catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }
        return false;
    }
    private void writeToFile(String filePath) {

        Animal[] animal = CityOfAaron.getCurrentGame().getTheStorehouse().getAnimals();
        try (PrintWriter animalListReport = new PrintWriter(new FileWriter(filePath))) {
            animalListReport.println("Animal List Report");
            animalListReport.println();
            String formatString = "%-20s %-15s %10s";
            animalListReport.println(String.format(formatString, "ITEM NAME", "CONDITION", "QUANTITY"));
            animalListReport.println("-------------------- --------------- ----------");

            for (int i = 0; i < animal.length; i++) {
               animalListReport.println(String.format(formatString, animal[i].getName(), animal[i].getCondition(), animal[i].getQuantity()));
            }
            
            animalListReport.println();
            animalListReport.println("End of List");

        } catch (IOException e) {
            ErrorView.display(this.getClass().getName(), "I/O Error: " + e.getMessage());
        }
    }
}
