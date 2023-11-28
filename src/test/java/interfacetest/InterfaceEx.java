package interfacetest;


import java_09m.interfacetest.Fight;

public class InterfaceEx {
    Fight fight;
    public void main(String[] args){
        fight = new Fight();

        fight.move(1, 5);
    }
}
