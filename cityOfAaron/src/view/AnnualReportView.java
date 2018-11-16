/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author apere
 */
public class AnnualReportView {

    protected String message;

    public AnnualReportView() {

        message = "Current Annual Report\n"
                + " A - The Year Number\n"
                + " B - People Starved\n"
                + " C - People Moved In To The City\n"
                + " D - Current Population\n"
                + " E - Acres Of Crop Land Owned By The City\n"
                + " F - Number Of Bushels/Acre This Year's Harvest\n"
                + " G - Number Of Bushels/Wheat Piad In Tithings\n"
                + " H - Number Of Bushels Eaten By Rats\n"
                + " I - Number Of Bushels?Wheat In Store\n"
                + " Q - Quit\n";
    }

    /**
     * Get the user's input. Keep prompting them until they enter a value.
     *
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a
     * return key)
     * @return
     */
    protected String getUserInput(String prompt, boolean allowEmpty) {

        Scanner keyboard = new Scanner(System.in);
        String input = "";
        boolean inputReceived = false;

        while (inputReceived == false) {

            System.out.println(prompt);
            input = keyboard.nextLine();

            // Make sure we avoid a null-pointer error.
            if (input == null) {
                input = "";
            }

            // Trim any trailing whitespace, including the carriage return.
            input = input.trim();

            if (input.equals("") == false || allowEmpty == true) {
                inputReceived = true;
            }
        }

        return input;
    }

    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we
     * don't have to type it ourselves.
     *
     * @param prompt
     * @return
     */
    protected String getUserInput(String prompt) {
        return getUserInput(prompt, false);
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    public String[] getInputs() {

        String[] inputs = new String[1];
        inputs[0] = getUserInput("Your Choice:");

        return inputs;
    }

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    public boolean doAction(String[] inputs) {

        switch (inputs[0].trim().toUpperCase()) {
            // If option 1, call loadGame()
            case "A":
                yearNumber();
                break;
            case "B":
                peopleStarved();
                break;
            case "C":
                peopleMovedIn();
                break;
            case "D":
                currentPopulation();
                break;
            case "E":
                cityAcresCropOwned();
                break;
            case "F":
                bushelsAcresThisYear();
                break;
            case "G":
                bushelsWheatTithing();
                break;
            case "H":
                bushelsEatenByRats();
                break;
            case "I":
                bushelsWheatInStore();
                break;
            case "Q":
                System.out.println("Exit Current Annual Report. Good-bye.");
                return false;
        }

        return true;
    }

    public void loadGameMenu() {
        boolean keepGoing = true;

        while (keepGoing == true) {

            System.out.println(message);
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }

    public void displayView() {

        boolean keepGoing = true;

        while (keepGoing == true) {

            System.out.println(message);
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }

    private void yearNumber() {
        //LoadGameView view = new LoadGameView();
        //view.displayView();
        System.out.println("Implementation coming soon.");
    }

    private void peopleStarved() {
        //LoadGameView view = new LoadGameView();
        //view.displayView();
        System.out.println("Implementation coming soon.");
    }

    private void peopleMovedIn() {
        //LoadGameView view = new LoadGameView();
        //view.displayView();
        System.out.println("Implementation coming soon.");
    }

    private void currentPopulation() {
        //LoadGameView view = new LoadGameView();
        //view.displayView();
        System.out.println("Implementation coming soon.");
    }

    private void cityAcresCropOwned() {
        //LoadGameView view = new LoadGameView();
        //view.displayView();
        System.out.println("Implementation coming soon.");
    }

    private void bushelsAcresThisYear() {
        //LoadGameView view = new LoadGameView();
        //view.displayView();
        System.out.println("Implementation coming soon.");
    }

    private void bushelsWheatTithing() {
        //LoadGameView view = new LoadGameView();
        //view.displayView();
        System.out.println("Implementation coming soon.");
    }

    private void bushelsEatenByRats() {
        //LoadGameView view = new LoadGameView();
        //view.displayView();
        System.out.println("Implementation coming soon.");
    }

    private void bushelsWheatInStore() {
        //LoadGameView view = new LoadGameView();
        //view.displayView();
        System.out.println("Implementation coming soon.");
    }
}
