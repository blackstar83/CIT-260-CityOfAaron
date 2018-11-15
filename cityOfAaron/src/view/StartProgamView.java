package view;

/**
 *
 * @author gj3593
 */
public class StartProgamView extends ViewBase {

    /**
     * Constructor
     */
    public StartProgamView() {
        super();
    }

    @Override
    protected String getMessage() {

        return "***********************************************************\n"
                + "* Welcome to the City of Aaron. You have been summoned *\n"
                + "* by the High Priest to assume your role as ruler of *\n"
                + "* the city. Your responsibility is to buy land, sell *\n"
                + "* land, determine how much wheat to plant each year, *\n"
                + "* and how much to set aside to feed the people. You *\n"
                + "* will also be required to pay an annual tithe on the *\n"
                + "* wheat that is harvested. If you fail to provide *\n"
                + "* enough wheat for the people to eat, people will starve *\n"
                + "* and your workforce will be diminished. Plan very *\n"
                + "* carefully or you may find yourself in trouble with *\n"
                + "* the people. And oh, there is always a danger of rats eting your wheat! *\n"
                + "***********************************************************\n";
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {

        //This view is not interactive. All it does is shows the
        //game description.
        return null;
    }

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs) {

        // There are no inputs for this view. We're just going to pause
        // for a couple of seconds, and then launch the MainMenuView.
        startMainMenuView();

        // return false so whoever called us doesn't call us again.
        return false;
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    private void startMainMenuView() {
        pause(2000);
        View mainMenu = new MainMenuView();
        mainMenu.displayView();
    }
}
