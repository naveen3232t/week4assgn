public class PastaMachineTypes implements PastaMachineTypesInterface {
    private PastaMachine []PastaMachines = new PastaMachine[5];
    private int index;

    @Override
    public void addPastaMachine(String DefaultPizza){
        int i = index++;
        PastaMachines[i] = new PastaMachine(i,DefaultPizza);
    }

    @Override
    public PastaMachine[] getPastaMachines(){
        return PastaMachines;
    }
}
