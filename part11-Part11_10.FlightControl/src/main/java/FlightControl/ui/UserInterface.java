/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

/**
 *
 * @author habasnet
 */
public class UserInterface {
    
    private FlightControl flightControl;
    private Scanner scanner;

    public UserInterface() {
    }

    public UserInterface(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }
    
    public void start() {
        startAssetControl();
        System.out.println("");
        startFlightControl();
        System.out.println("");

    }

    private void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        
        while(true) {
            System.out.println("Choose an action: ");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            
            System.out.print("> ");
            String choice = String.valueOf(scanner.nextLine());
            
            if(choice.equals("1")) {
                addAirplane();
            }else if(choice.equals("2")) {
                addFlight();
            }else if(choice.equals("x")) {
                break;
            }

        }
    }

    private void startFlightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();
        
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            
            System.out.print("> ");
            String answer = scanner.nextLine();
            if (answer.equals("1")) {
                printAirplanes();
            } else if (answer.equals("2")) {
                printFlights();
            } else if (answer.equals("3")) {
                printAirplaneDetails();
            } else if (answer.equals("x")) {
                break;
            }
        }
    }
    
    
    private void addAirplane() {
        
        System.out.println("Give the airplane id: ");
        String airplaneId = String.valueOf(scanner.nextLine());
        
        System.out.println("Give the airplane capacity: ");
        int capacity = Integer.valueOf(scanner.nextLine());
        
        this.flightControl.addAirplane(airplaneId, capacity);
    }

    private void addFlight() {
        System.out.println("Give the airplane id: ");
        String airplaneId = String.valueOf(scanner.nextLine());
        
        System.out.println("Give the departure airport id: ");
        String departureId = String.valueOf(scanner.nextLine());
        
        System.out.println("Give the target airport id: ");
        String targetId = String.valueOf(scanner.nextLine());
        
        this.flightControl.addFlight(this.flightControl.getAirplane(airplaneId), departureId, targetId);
    }

    public boolean checkString(Object obj) {
        return obj instanceof String;
    }

    private void printAirplanes() {
        this.flightControl.getAirplanes().stream().forEach(System.out::println);
    }

    private void printFlights() {
        this.flightControl.getFlights().stream().forEach(System.out::println);
    }

    private void printAirplaneDetails() {
        System.out.println("Give the airplane id: ");
        
        Airplane airplane = askForAirplane();
        
        System.out.println(airplane);
    }
    
    private Airplane askForAirplane() {
        Airplane airplane = null;
        while (airplane == null) {
            String id = scanner.nextLine();
            airplane = flightControl.getAirplane(id);

            if (airplane == null) {
                System.out.println("No airplane with the id " + id + ".");
            }
        }

        return airplane;
    }
}
