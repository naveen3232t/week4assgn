public class PastaMachineIteratorPattern {
    public static void main(String[] args) {
        PastaMachineTypesInterface types= new PastaMachineTypes();
        types.addPastaMachine("PastaMachineStarted");
        types.addPastaMachine("OrderReceived");
        types.addPastaMachine("Preparing order ");
        types.addPastaMachine("Order is done");
        types.addPastaMachine("PastaMachineOFF");

        PastaMachineIterator iterator = new PastaMachineIterator(types.getPastaMachines());
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Apply removing while iterating...");
        iterator = new PastaMachineIterator(types.getPastaMachines());
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
}
