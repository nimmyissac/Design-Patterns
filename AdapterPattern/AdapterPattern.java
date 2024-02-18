public class AdapterPattern {
    public static void main(String[] args) {
        OldCoffeeMachine oldMachine = new OldCoffeeMachine();
        CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter();
        adapter.setOldCoffeeMachine(oldMachine);
        adapter.chooseFirstSelection();
        adapter.chooseSecondSelection();
    }

}