/***
 * Esta clase lo que hace es heredar de la clase abstracta las propiedades y así mismo imprimirlas,
 * y además hace el método que se encarga del cálculo de la atracción gravitacional de cualquiera de los 8 planetas,
 * con el sol
 * @author Daniel Mauricio Naranjo Benavides - naranjobenavidesd@gmail.com
 */
public class Planet  extends FatherPlanetarySystem{
    public Double ditance;
    public Double F;
    public Double massSun;

    public Planet(String name, Double mass, Double density, Double diameter, Double gravity, Double distanceSun) {
        super(name, mass, density, diameter, gravity, distanceSun);
        this.massSun = 1.9891E30;
    }

    @Override
    public void gravitationalPull() {
        ditance = Math.pow(this.getDistanceSun(), 2);
        F = this.getGravity() * ((this.getMass() * massSun) / ditance);
        System.out.println("\nLa atracción gravitatoria entre: " +this.getName()+ " y el Sol \n" +
                            "Es de: " +F);
    }



    @Override
    public String toString()
    {
        return "\nNombre Planeta: " + this.getName() +
                "\nId: " + this.getId() +
                "\nMasa: " + this.getMass() + " Kg" +
                "\nDensidad: " + this.getDensity() + " g/cm³" +
                "\nDiámetro: " + this.getDiameter() + " km" +
                "\nGravedad: " + this.getGravity() + " m/s²" +
                "\nDistancia al Sol: " + this.getDistanceSun() + " km";
    }
}
