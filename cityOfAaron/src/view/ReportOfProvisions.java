/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cityofaaron.CityOfAaron;
import exceptions.GameControlException;
import java.io.*;
import model.*;
/**
 *
 * @author apere
 */

public class ReportOfProvisions extends ViewBase{
    public ReportOfProvisions() {
        
    }
    @Override
    public String getMessage() {
        return "Send Provisions Report to File:\n";
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
            this.console.println("Provision Report saved as " + fileName);
         } catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }
        return false;
    }
    private void writeToFile(String filePath) {

        Provision[] provisions = CityOfAaron.getCurrentGame().getTheStorehouse().getProvisions();
        try (PrintWriter provisionReport = new PrintWriter(new FileWriter(filePath))) {
            provisionReport.println("Provision Report");
            provisionReport.println();
            String formatString = "%-20s %-15s %10s";
            provisionReport.println(String.format(formatString, "ITEM NAME", "CONDITION", "QUANTITY"));
            provisionReport.println("-------------------- --------------- ----------");

            for (int i = 0; i < provisions.length; i++) {
                provisionReport.println(String.format(formatString, provisions[i].getName(), provisions[i].getCondition(), provisions[i].getQuantity()));
            }
            
            provisionReport.println();
            provisionReport.println("End of List");

        } catch (IOException e) {
            ErrorView.display(this.getClass().getName(), "I/O Error: " + e.getMessage());
        }
    }
}
