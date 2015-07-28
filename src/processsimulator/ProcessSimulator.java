package processsimulator;


import interfaces.SimulatorInterface;


public class ProcessSimulator {

    public static void main(String[] args) {
        
        start();   
        
    }
    static void start(){
        SimulatorInterface si = new SimulatorInterface();
        si.setVisible(true);        
        SimulatorInterface.proRepTable.drawScreen(0);
        SimulatorInterface.queueRep.drawQueue("readyQ");
    }
}
