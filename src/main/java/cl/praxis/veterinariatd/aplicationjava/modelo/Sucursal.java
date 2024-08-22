package cl.praxis.veterinariatd.aplicationjava.modelo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Sucursal {
    private int id;
    private String nombre_sucursal;
    private String sucursal_direccion;
    private List<Producto> productos;
}

