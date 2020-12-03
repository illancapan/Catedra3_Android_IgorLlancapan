package Models;

public class Clientes {

    private String id;
    private String nombreCliente;
    private String destinoCliente;
    private String promocionCliente;

    public Clientes()
    {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDestinoCliente() {
        return destinoCliente;
    }

    public void setDestinoCliente(String destinoCliente) {
        this.destinoCliente = destinoCliente;
    }

    public String getPromocionCliente() {
        return promocionCliente;
    }

    public void setPromocionCliente(String promocionCliente) {
        this.promocionCliente = promocionCliente;
    }
}
