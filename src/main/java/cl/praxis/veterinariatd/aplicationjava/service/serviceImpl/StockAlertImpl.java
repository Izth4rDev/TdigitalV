package cl.praxis.veterinariatd.aplicationjava.service.serviceImpl;
import cl.praxis.veterinariatd.aplicationjava.modelo.Producto;
import cl.praxis.veterinariatd.aplicationjava.modelo.Sucursal;
import cl.praxis.veterinariatd.aplicationjava.service.IStockAlert;
import java.util.List;

public class StockAlertImpl implements IStockAlert {

    private List<Sucursal> sucursales;

    public StockAlertImpl(List<Sucursal> sucursales){
        this.sucursales = sucursales;
    }

    @Override
    public void checkStock(int id_producto, int id_sucursal) {
        Producto selecProducto = new Producto();

        for(Sucursal sucursal : sucursales){
            if(sucursal.getId() == id_sucursal){

                List<Producto> productos = sucursal.getProductos();

                for(Producto producto : productos){
                    if(producto.getId_producto() == id_producto){
                       selecProducto = producto;
                    }
                }

                System.out.println(selecProducto.getNombre_producto() +" "+ selecProducto.getStock());

                if((selecProducto.getTipo_producto().equals("medicinal") &&  selecProducto.getStock()< 15) || (selecProducto.getTipo_producto().equals("accesorio") && selecProducto.getStock() < 5)){
                    System.out.println("Alerta: tienes que reponer el stock del producto" + selecProducto.getNombre_producto());
                }else{
                    System.out.println("tienes buen stock del producto" + selecProducto.getNombre_producto());
                }
            }
        }
    }
}
