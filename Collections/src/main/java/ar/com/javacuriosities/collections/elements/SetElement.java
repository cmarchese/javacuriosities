package ar.com.javacuriosities.collections.elements;

import java.util.Objects;

/*
 * Creo un elemento para guardar en un Set,
 * Le ponemos un String adentro, con su constructor para
 * que los reciba y el método toString para imprimir ese String
 */
public class SetElement {

    private String name;

    public SetElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SetElement{" + "name=" + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    /*
     * Dejarlo comentado, hasta que corremos el ejemplo
     * y vemos como que acepta duplicados, después descomentarlo y volver a correr
     * SetCollection.java.
     *
     *
     * El contrato de equals dice que si dos objetos son iguales o sea que su método equals
     * retorna true el hashCode debe ser el mismo, porque el hashCode se usa para almacenar en baldes
     * y la funcion hashCode puede tener valores duplicados y el equals define si son realmente iguales
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SetElement other = (SetElement) obj;
        return Objects.equals(this.name, other.name);
    }
}
