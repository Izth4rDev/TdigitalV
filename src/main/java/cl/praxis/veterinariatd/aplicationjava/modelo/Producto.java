package cl.praxis.veterinariatd.aplicationjava.modelo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Producto {
    private int id_producto;
    private String nombre_producto;
    private String tipo_producto;
    private int Stock;
}
