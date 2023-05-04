package Explorers;

import Planets.*;

public class HumanExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Deploying tools specific to Mercury... yooooo is this the drug store?");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Deploying tools specific to Mars... pautang");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Deploying tools specific to Saturn... ayeee hula hoop champ");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("Deploying tools specific to Earth... coz there aint no planet B");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Deploying tools specific to Jupiter... the biggest of em all");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("Deploying tools specific to Neptune... dude got some autotunes");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("Deploying tools specific to Uranus... smells like farts");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Deploying tools specific to Venus... you freakin hot");
    }
}