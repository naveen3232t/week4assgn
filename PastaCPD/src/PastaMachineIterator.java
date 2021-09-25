import java.util.Iterator;

public class PastaMachineIterator implements Iterator<PastaMachine>,PastaMachineIteratorInterface {

        private PastaMachine [] PastaMachines;
        int pos;

        public PastaMachineIterator(PastaMachine []PastaMachines){
            this.PastaMachines = PastaMachines;
        }
        @Override
        public boolean hasNext() {
            if(pos >= PastaMachines.length || PastaMachines[pos] == null)
                return false;
            return true;
        }

        @Override
        public PastaMachine next() {
            return PastaMachines[pos++];
        }

        @Override
        public void remove() {
            if(pos <=0 )
                throw new IllegalStateException("Illegal position");
            if(PastaMachines[pos-1] !=null){
                for (int i= pos-1; i<(PastaMachines.length-1);i++){
                    PastaMachines[i] = PastaMachines[i+1];
                }
                PastaMachines[PastaMachines.length-1] = null;
            }
        }
    }

