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
        ditance = Math.pow(this.DistanceSun(), 2);
        F = this.Gravity() * ((this.Mass() * massSun) / ditance);
        System.out.println("\nLa atracción gravitatoria entre: " +this.Name()+ " y el Sol \n" +
                            "Es de: " +F);
    }



    @Override
    public String toString()
    {
        return "\nNombre Planeta: " + this.Name() +
                "\nId: " + this.Id() +
                "\nMasa: " + this.Mass() + " Kg" +
                "\nDensidad: " + this.Density() + " g/cm³" +
                "\nDiámetro: " + this.Diameter() + " km" +
                "\nGravedad: " + this.Gravity() + " m/s²" +
                "\nDistancia al Sol: " + this.DistanceSun() + " km";
    }
}
