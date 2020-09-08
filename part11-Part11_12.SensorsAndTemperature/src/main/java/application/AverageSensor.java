/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author habasnet
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private boolean isOn;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.isOn = false;
    }
    
    
    @Override
    public boolean isOn() {
        for(Sensor sensor : sensors) {
            if(sensor.isOn()){
                isOn = true;
            }else {
                isOn = false;
            }
        }
        return isOn;
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
       
        double average =  this.sensors.stream().mapToInt(sensor -> sensor.read()).average().getAsDouble();
        
        return (int) average;
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
     public List<Integer> readings() {
         
         List<Integer> xxxd = this.sensors.stream().map(sensor -> sensor.read()).collect(Collectors.toList());
         
         if(xxxd == null){
             return Collections.emptyList();
         }
         
         return xxxd;
     }
    
}
