/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 

import java.awt.Image;

/**
 *
 * @author us
 */
public class Television extends DispositivoElectronicoDeConsumo {
    private Pantalla pantallaTV;
    private Image imagen;
    public Television(String fabricante, String numeroSerie, String marca, String nombre, double costo,Pantalla newPantallaTV) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.pantallaTV = newPantallaTV;
        super.componentes.add(pantallaTV);
       
    }

    @Override
    public String toString() {
        return "Television{"+ super.toString()+ "pantallaTV=" + pantallaTV + '}';
    }

    public Pantalla getPantallaTV() {
        return pantallaTV;
    }
    
}
