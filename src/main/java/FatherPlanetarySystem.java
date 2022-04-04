/***
 * La clase abstracta es la que hereda las propiedades a utilizar y el método a programar
 * @author Daniel Mauricio Naranjo Benavides - naranjobenavidesd@gmail.com
 */
public abstract class FatherPlanetarySystem {
    private final Double mass;
    private final Double density;
    private final Double diameter;
    private final Double distanceSun;
    private final Integer id;
    private final String name;
    private final Double gravity;
    public static Integer generateCodePlayer = 1;

    public FatherPlanetarySystem(String name, Double mass, Double density, Double diameter, Double gravity, Double distanceSun) {
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.gravity = gravity;
        this.distanceSun = distanceSun;
        this.id = generateCodePlayer++;
    }

    //Estos métodos get sirven para poder acceder a las propiedades que son utilizadas en las clases hijas.

    public Double getDensity() {
        return density;
    }

    public Double getDiameter() {
        return diameter;
    }

    public Double getDistanceSun() {
        return distanceSun;
    }

    public Double getMass() {
        return mass;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getGravity(){
        return gravity;
    }

    //Este método lo que hará es calcular la atracción gravitacional de cada uno de los ocho planetas con el sol

    public abstract void gravitationalPull();
}
