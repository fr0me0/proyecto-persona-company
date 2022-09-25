package org.francodevs.personacompany;

public class Main {

    public static void main(String[] args) {
        
        Gerente gerente = new Gerente(
                "Franco",
                "Romeo",
                "555666BB12",
                "Lambare 927 - CABA",
                25000.0,
                23424,
                30000d
        );
        gerente.aumentarRemuneracion(20);
        gerente.setPresupuesto(100000d);

        System.out.println(gerente);
        
    }
    
}
