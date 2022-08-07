/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;


public class Ahorcado {

    private String[] palabra;
    private Integer letrasEncontradas;
    private Integer jugadasMax;

    public Ahorcado() {
    }
    

    public Ahorcado(String[] palabra, Integer letrasEncontradas, Integer jugadasMax) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMax = jugadasMax;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public Integer getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(Integer letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public Integer getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(Integer jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", letrasEncontradas=" + letrasEncontradas + ", jugadasMax=" + jugadasMax + '}';
    }
    
    
    
    
}
