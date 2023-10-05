public interface Alarm {

    default String turnAlarmOn() {
        return "Turning the alarm on.";
    }
    
    default String turnAlarmOff() {
        return "Turning the alarm off.";
    }
}
@Override
public String turnAlarmOn() {
    // custom implementation
}
    
@Override
public String turnAlarmOff() {
    // custom implementation
}
@Override
public String turnAlarmOn() {
    return Vehicle.super.turnAlarmOn();
}

@Override
public String turnAlarmOff() {
    return Vehicle.super.turnAlarmOff();
}
