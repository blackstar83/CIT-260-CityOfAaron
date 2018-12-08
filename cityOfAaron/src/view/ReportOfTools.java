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

import exceptions.GameControlException;

/**
 *
 * @author gj3593
 */
public class ReportOfTools extends ViewBase {

    public ReportOfTools() {

    }

    @Override
    public String getMessage() {
        return "Send Tools Report to File:\n";
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
            this.console.println("Tools Report saved as " + fileName);
        } catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }
        return false;
    }

    private void writeToFile(String filePath) {
        InventoryItem[] tools = CityOfAaron.getCurrentGame().getTheStorehouse().getTools();
        try (PrintWriter toolReport = new PrintWriter(new FileWriter(filePath))) {
            toolReport.println("Tools Report");
            toolReport.println();
            String formatString = "%-20s %-15s %10s";
            toolReport.println(String.format(formatString, "ITEM NAME", "CONDITION", "QUANTITY"));
            toolReport.println("-------------------- --------------- ----------");

            for (int i = 0; i < tools.length; i++) {
                toolReport.println(String.format(formatString, tools[i].getName(), tools[i].getCondition(), tools[i].getQuantity()));
            }

            toolReport.println();
            toolReport.println("End of List");
        } catch (IOException e) {
            ErrorView.display(this.getClass().getName(), "I/O Error: " + e.getMessage());
        }
    }
}
