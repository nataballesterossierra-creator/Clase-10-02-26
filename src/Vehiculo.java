public class Vehiculo {

    private String modelo;
    private String numMotor;
    private String Serial;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, String nummotor, String serial) {
        this.modelo = modelo;
        this.numMotor = nummotor;
        Serial = serial;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(String numMotor) {
        this.numMotor = numMotor;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", Nummotor='" + numMotor + '\'' +
                ", Serial='" + Serial + '\'' +
                '}';
    }
    /* Metodos Propios*/

     /* Tipos de metodos
                                                 vacio
        *    sin parametros sin retorno : public void frenar (){}

        *    sin parametros con retorno : public string frenar (){
                                          //primer forma
                                          return "Estoy frenando";

                                          //segunda forma
                                           string mensaje = "Estoy frenando";
                                           return mensaje;

        * Con parametros sin retorno:    public void tanqueo(int cantidad)
                                          sout("el combustible es: cantCombustible+Cantidad");


                                               return           parametro
        * Con parametros con retorno:     public int tanqueo (int cantidad){
                                          return cantCombustible + cantidad
                                            }

                                            siempre que un metodo tenga un return se debe llamar con un sout.
                                            cuando el metodo es sin retorno se llama el objeto sin sout.
         */

       //Metodo sin parametros sin retorno
    public void arrancar(){

        System.out.println(" Soy un carro y voy a Arrancar ");

    }

             //Metodo con retorno sin parametros
    public String frenar(){

       return" Soy un carro y voy a Frenar ");
    }
    public int tanquear(){

        return 56;
    }


           // Metodo con retorno y parametros
    public int retanquear(int cantidad){

       int c = 56;

       return c + cantidad;

    }

}
