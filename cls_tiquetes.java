public class cls_tiquetes {
  private String fecha;
  private int id_cliente;
  private int cantidad;
  private String tipo_clase;
  private double subtotal;
  private double IVA;
  private double descuento;
  private double total;

  public cls_tiquetes(String fecha, int id_cliente, int cantidad, String tipo_clase, double subtotal, double IVA, double descuento, double total) {
    this.fecha = fecha;
    this.id_cliente = id_cliente;
    this.cantidad = cantidad;
    this.tipo_clase = tipo_clase;
    this.subtotal = subtotal;
    this.IVA = IVA;
    this.descuento = descuento;
    this.total = total;
  }

  public String getFecha() {
    return fecha;
  }

  public int getId_cliente() {
    return id_cliente;
  }

  public int getCantidad() {
    return cantidad;
  }

  public String getTipo_clase() {
    return tipo_clase;
  }

  public double getSubtotal() {
    return subtotal;
  }

  public double getIVA() {
    return IVA;
  }

  public double getDescuento() {
    return descuento;
  }

  public double getTotal() {
    return total;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }
}
