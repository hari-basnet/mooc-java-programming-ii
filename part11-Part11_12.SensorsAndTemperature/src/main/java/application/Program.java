/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author habasnet
 */
public class Program {
    
    public static void main(String[] args) {
      Sensor kumpula = new TemperatureSensor();
    Sensor kaisaniemi = new TemperatureSensor();
    Sensor helsinkiVantaaAirport = new TemperatureSensor();
    

    AverageSensor helsinkiRegion = new AverageSensor();
    helsinkiRegion.addSensor(kumpula);
    helsinkiRegion.addSensor(kaisaniemi);
    helsinkiRegion.addSensor(helsinkiVantaaAirport);

    helsinkiRegion.setOn();
    System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
    System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
    System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");

    System.out.println("readings: " + helsinkiRegion.readings());
    
    }
}
