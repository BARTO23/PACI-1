/*
 Una aerolinia que debe registrar a los pasajeros:
-id
-nombre
-contacto
-correo
-sexo
-membresia: bronce, plata, oro, platino

Bronce: 10% descuento
Plata: 15% descuento
Oro: 25% descuento
Platino: 35% descuento

Compra de tiquetes (clase economica = 450.000, turista = 600.000 o VIP = 900.000):
-fecha
-id_cliente
-Cantidad
-tipo_clase
-subtotal
-IVA
-Descuento
-total

Pago:
-Efectivo: 5% descuento
-Tarjeta de credito: 7% de incremento
-Tarjeda debito: 2% Descuento
-Transferencia: 10% descuento

Notas: el pasajero puede comprar vario tiquetes y se debe sumar el total del descueto obtenido
 */


// Registro pajaro
public class cls_pasajero {
    private int id;
    private String nombre;
    private String contacto;
    private String correo;
    private String sexo;
    private String membresia;

    public cls_pasajero(int id, String nombre, String contacto, String correo, String sexo, String membresia) {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
        this.correo = correo;
        this.sexo = sexo;
        this.membresia = membresia;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public String getCorreo() {
        return correo;
    }

    public String getSexo() {
        return sexo;
    }

    public String getMembresia() {
        return membresia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }

    public void comprar_tiquete(int id_cliente, int cantidad, String tipo_clase, double subtotal, double IVA, double descuento, double total) {
        // Compra de tiquetes
        
    }
}