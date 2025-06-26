/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2_examen2_salvador_macias;

/**
 *
 * @author Apple
 */
public class etapa {

    private String nombre;
    private int unidadesPorProcesar;
    private int tiempoPorUnidad;
    private int unidadesProcesadas;

    public etapa(String nombre, int unidadesPorProcesar, int tiempoPorUnidad) {
        this.nombre = nombre;
        this.unidadesPorProcesar = unidadesPorProcesar;
        this.tiempoPorUnidad = tiempoPorUnidad;
        this.unidadesProcesadas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getUnidadesPorProcesar() {
        return unidadesPorProcesar;
    }

    public int getTiempoPorUnidad() {
        return tiempoPorUnidad;
    }

    public int getUnidadesProcesadas() {
        return unidadesProcesadas;
    }

    public void setUnidadesProcesadas(int unidadesProcesadas) {
        this.unidadesProcesadas = unidadesProcesadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidadesPorProcesar(int unidadesPorProcesar) {
        this.unidadesPorProcesar = unidadesPorProcesar;
    }

    public void setTiempoPorUnidad(int tiempoPorUnidad) {
        this.tiempoPorUnidad = tiempoPorUnidad;
    }

    @Override
    public String toString() {
        return "etapa{" + "nombre=" + nombre + ", unidadesPorProcesar=" + unidadesPorProcesar + ", tiempoPorUnidad=" + tiempoPorUnidad + ", unidadesProcesadas=" + unidadesProcesadas + '}';
    }

}
