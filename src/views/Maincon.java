/*
* File: App.java
* Author: Penge Béla
* Copyright: 2021, Penge Béla
* Group: Szoft II I N
* Date: 2023-01-30
* Github: https://github.com/pengebela/
* Licenc: GNU GPL
*/
package views;

import java.util.ArrayList;

import models.Restapi;
import models.Vehicle;

public class Maincon {
    Restapi restapi;
    public Maincon(Restapi restapi) {
        this.restapi = restapi;
        this.start();
    }
    public void start() {
        ArrayList<Vehicle> vehicles = this.restapi.getVehicles();
        for(Vehicle vehicle: vehicles) {
            System.out.printf("%10s %12s %6.2f\n",
             vehicle.licenseplate,
             vehicle.brand,
             vehicle.price
             );
        }
    }
    
}
