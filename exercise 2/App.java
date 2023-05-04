import Explorers.Explorer;
import Explorers.HumanExplorer;
import Explorers.RobotExplorer;
import Explorers.Explorer.*;
import Planets.Earth;
import Planets.Jupiter;
import Planets.Mars;
import Planets.Mercury;
import Planets.Neptune;
import Planets.Planet;
import Planets.Saturn;
import Planets.Uranus;
import Planets.Venus;
import Planets.Planet.*;

public class App {

    public static void main(String[] args) {

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet venus = new Venus();
        Planet earth = new Earth();
        Planet neptune = new Neptune();
        Planet uranus = new Uranus();
        Planet jupiter = new Jupiter();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        earth.accept(astronaut);
        venus.accept(astronaut);
        neptune.accept(astronaut);
        uranus.accept(astronaut);
        jupiter.accept(astronaut);

        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        earth.accept(rover);
        venus.accept(rover);
        neptune.accept(rover);
        uranus.accept(rover);
        jupiter.accept(rover);
    }
}