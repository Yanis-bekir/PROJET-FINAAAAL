package fr.insa.bekir.projet_dinfo;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    private MainPane vue;
    
    public Controleur(MainPane v) {
        this.vue = v;
    }
}
