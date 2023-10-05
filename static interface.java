public interface Vehicle {
    
    // regular / default interface methods
    
    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
}
Vehicle.getHorsePower(2500, 480);
