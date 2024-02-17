public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    OldCoffeeMachine oldVendingMachine;

    public void setOldCoffeeMachine(OldCoffeeMachine coffeeMachine) {
        this.oldVendingMachine = coffeeMachine;
    }

    public void chooseFirstSelection() {
        this.oldVendingMachine.selectA();
    }

    public void chooseSecondSelection() {
        this.oldVendingMachine.selectB();
    }
}
