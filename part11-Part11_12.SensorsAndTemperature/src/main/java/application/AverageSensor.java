/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author habasnet
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> allReadings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.allReadings = new ArrayList<>();
    }
    
    
    @Override
    public boolean isOn() {
        boolean flag = false;
        for(Sensor sensor : sensors) {
            if(sensor.isOn()){
                flag = true;
            }else {
                flag = false;
            }
        }
        return flag;
    }

    @Override
    public void setOn() {
        this.sensors.stream().forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        this.sensors.stream().forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        if (sensors.isEmpty() || !isOn()) {
            throw new IllegalStateException();
        }
        int averageReading =  (int) sensors.stream()
                                    .mapToInt(sensor -> sensor.read())
                                    .average()
                                    .getAsDouble();
        
        this.allReadings.add(averageReading);
        return averageReading;
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
     public List<Integer> readings() {
         
         if(sensors.isEmpty()){
             return new ArrayList<>();
         }else {
             return this.allReadings;
         }
     }
    
}
