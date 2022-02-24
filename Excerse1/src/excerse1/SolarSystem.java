package excerse1;

/**
 * En esta clase se declararan los metodos y atributos
 * que seran heredados en otras clases
 * @version 01-01-01 2022-02-23
 * @author Jonathan Brito
 * @since 01
 */
public abstract class SolarSystem {
    
    /**
     * Se nombran los atributos que utilizaremos 
     */
    public String nomber;
    public float mass,density,diameter,distanceSun;

    /**
     * Constructor
     * @param nomber
     * @param mass
     * @param density
     * @param diameter
     * @param distanceSun 
     */
    public SolarSystem(String nomber, float mass, float density, float diameter, float distanceSun) {
        this.nomber=nomber;
        this.mass=mass;
        this.density=density;
        this.diameter=diameter;
        this.distanceSun=distanceSun;
    }
    
    public SolarSystem(){
        nomber="";
        mass=0;
        density=0;
        diameter=0;
        distanceSun=0;
    }

    /**
     * Este metodo se ha creado para que el usuario elija la actividad
     * que desea realizar
     * @param  mass masa del planeta
     * @param Distabce distancia con respecto al sol
     * 
     * @return 
     */
    public abstract float GravitationalForce(float mass,float Distance);
    public String toString(){
        
        return "Nombre: "+nomber+" Masa: "+mass
               +" Densidad: "+density+" Diametro: "+diameter+" Distancia del sol: "+distanceSun;
    }
}