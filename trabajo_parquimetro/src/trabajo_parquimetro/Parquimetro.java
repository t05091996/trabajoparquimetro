package trabajo_parquimetro;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
//aqui se crea la clase parquimetro
public class Parquimetro {

    private String placa;
    private String tipo;
    private String color;
    private String marca;
    private String Run;
    private String Nombre;
    private String Apellidos;
    private Integer Edad;
    private String Nacionalidad;
    private String Visa;
    private String hora_entrada;
    
    //constructor con parametros
    public Parquimetro(String placa, String tipo, String color, String marca, String Run, String Nombre, String Apellidos, Integer Edad, String Nacionalidad, String Visa, String hora_entrada) {
        this.placa = placa.toUpperCase();
        this.tipo = tipo.toUpperCase();
        this.color = color.toUpperCase();
        this.marca = marca.toUpperCase();
        this.Run = Run.toUpperCase();
        this.Nombre = Nombre.toUpperCase();
        this.Apellidos = Apellidos.toUpperCase();
        this.Edad = Edad;
        this.Nacionalidad = Nacionalidad.toUpperCase();
        this.Visa = Visa.toUpperCase();
        this.hora_entrada = hora_entrada;
    }
    
    //metodo sobreescrito para cuando se agregue en la lista, muestre los datos necesarios
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("").append(tipo);
        sb.append(" ").append(placa);
        sb.append(" Marca ").append(marca);
        sb.append(" Hora Entrada=").append(hora_entrada);
        sb.append(" Perteneciente al Run ").append(Run);
        return sb.toString();
    }
   //setter de la clase
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setRun(String Run) {
        this.Run = Run;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public void setVisa(String Visa) {
        this.Visa = Visa;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    //getter de la clase
    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getRun() {
        return Run;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public Integer getEdad() {
        return Edad;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public String getVisa() {
        return Visa;
    }

    public String getHora_entrada() {
        return hora_entrada;
    }


    
}
