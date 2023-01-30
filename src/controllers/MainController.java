package controllers;

import models.Restapi;
/*
* File: MainController.java
* Author: Penge Béla
* Copyright: 2021, Penge Béla
* Group: Szoft II I N
* Date: 2023-01-30
* Github: https://github.com/pengebela/
* Licenc: GNU GPL
*/
import views.Maincon;

public class MainController {
    Maincon maincon;
    Restapi restapi;
    public MainController() {
        this.restapi = new Restapi();
        this.maincon = new Maincon(this.restapi);
        
    }
    
}
