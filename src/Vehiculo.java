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

    public void arrancar(){

        System.out.println(" Soy un carro y voy a Arrancar ");

    }
    public void frenar(){

        System.out.println(" Soy un carro y voy a Frenar ");
    }
    public void tanquear(){

        System.out.println(" Soy un carro y voy a Tanquear ");

    }
    public void acelerar(){

        System.out.println(" Soy un carro y voy a acelerar ");

    }

}
