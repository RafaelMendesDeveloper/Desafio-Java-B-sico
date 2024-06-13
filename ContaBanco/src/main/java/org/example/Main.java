package org.example;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Cliente cliente = new Cliente("549177218-65", "Rafael Mendes", "12/04/2005");
        cliente.show();
    }
}
