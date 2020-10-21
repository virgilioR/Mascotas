package com.virgilio.mascotas;

public class Mascota {

    private int image;
    private String nombre;
    private int raiting;

    public Mascota(int image, String nombre, int raiting) {
        this.image = image;
        this.nombre = nombre;
        this.raiting = raiting;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }
}
