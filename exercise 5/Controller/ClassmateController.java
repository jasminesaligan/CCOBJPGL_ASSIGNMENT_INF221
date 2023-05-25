package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class ClassmateController {
    
    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Darrel darrel = new Darrel();
    Jiu jiu = new Jiu ();
    Celine celine = new Celine();
    Emlan emlan = new Emlan();
    Thea thea = new Thea ();

   
    public void initialize() {

    darrel.setAge("19");  
    darrel.setHobbies("mag alaga ng elephant, playing instrument while sleeping");  
    darrel.setMBTI("ESFP");
    darrel.setZodiacSign("Cancer");

    jiu.setAge("19");
    jiu.setHobbies("anything related to the arts");
    jiu.setMBTI("INFJ");
    jiu.setZodiacSign("Capricorn");

    emlan.setAge("19");
    emlan.setHobbies("Play Roblox");
    emlan.setMBTI("INFJ");
    emlan.setZodiacSign("Pisces");

    celine.setAge("19");
    celine.setHobbies("Designing, sketching, Watch Tiktok");
    celine.setMBTI("ISTJ");
    celine.setZodiacSign("Sagittarius");

    thea.setAge("19");
    thea.setHobbies("playing roblox, watching movies, playing guitar, crocheting");
    thea.setMBTI("INFJ");
    thea.setZodiacSign("Sagittarius");

  }
  public void showInfo(ActionEvent event) {
    Button sourceButton = (Button) event.getSource();
    Alert alert = new Alert(AlertType.INFORMATION);

    if (sourceButton.equals(btn1)) {
        alert.setContentText("He is " + darrel.getAge() + " He likes to " + darrel.getHobbies() + " His MBTI is " + darrel.getMBTI() + " His Zodiac sign is " + darrel.getZodiacSign() );
    }

    if (sourceButton.equals(btn2)) {
        alert.setContentText("He is " + emlan.getAge() + " He likes to " + emlan.getHobbies() + " His MBTI is " + emlan.getMBTI() + " His Zodiac sign is " + emlan.getZodiacSign() );
    }

    if (sourceButton.equals(btn3)) {
        alert.setContentText("She is " + jiu.getAge() + " She likes to " + jiu.getHobbies() + " Her MBTI is " + jiu.getMBTI() + " Her Zodiac sign is " + jiu.getZodiacSign() );
    }

    if (sourceButton.equals(btn4)) {
        alert.setContentText("She is " + celine.getAge() + " She likes to " + celine.getHobbies() + " Her MBTI is " + celine.getMBTI() + " Her Zodiac sign is " + celine.getZodiacSign() );
    }

    if (sourceButton.equals(btn5)) {
        alert.setContentText("She is " + thea.getAge() + " She likes to " + thea.getHobbies() + " Her MBTI is " + thea.getMBTI() + " Her Zodiac sign is " + thea.getZodiacSign() );
    }

    alert.showAndWait();

    }

}