package cl.praxis.veterinariatd.aplicationjava;
import cl.praxis.veterinariatd.aplicationjava.modelo.Mascota;
import cl.praxis.veterinariatd.aplicationjava.modelo.Producto;
import cl.praxis.veterinariatd.aplicationjava.modelo.Sucursal;
import cl.praxis.veterinariatd.aplicationjava.service.serviceImpl.AtentionAlertServiceImpl;
import cl.praxis.veterinariatd.aplicationjava.service.serviceImpl.StockAlertImpl;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        //seteo productos y su stock 2
        Producto producto1 = new Producto(1,"Ibuprofeno", "medicinal", 23);
        Producto producto2 = new Producto(2,"Correa", "accesorio", 2);
        List<Producto> productos1 = new ArrayList<>();
        productos1.add(producto1);
        productos1.add(producto2);
        //seteo productos y su stock 2
        Producto producto3 = new Producto(1,"paracetamol", "medicinal", 41);
        Producto producto4 = new Producto(2,"Polar", "accesorio", 25);
        List<Producto> productos2 = new ArrayList<>();
        productos2.add(producto3);
        productos2.add(producto4);
        //Seteo de sucursales
        Sucursal sucursal1 = new Sucursal(1,"sucursal freire","Concepcion 1335",productos1);
        Sucursal sucursal2 = new Sucursal(2,"sucursal blanco","blanco 486",productos2);
        //lista de sucursales
        List<Sucursal> sucursales = new ArrayList<>();
        sucursales.add(sucursal1);
        sucursales.add(sucursal2);
        //Menu stock
        System.out.println("ingrese el id de la sucursal");
        int id_sucursal = sc.nextInt();
        System.out.println("ingrese el id del producto");
        int id_producto = sc.nextInt();
        //servicio stock
        StockAlertImpl stockAlert = new StockAlertImpl(sucursales);
        stockAlert.checkStock(id_producto,id_sucursal);

        Mascota mascota1 = new Mascota("Sansa","Perro","Cirugia", LocalDate.parse("2024-05-26"));
        Mascota mascota2 = new Mascota("Tachi","Perro","Control", LocalDate.parse("2024-05-26"));
        Mascota mascota3 = new Mascota("Loky","Gato","Cirugia", LocalDate.parse("2024-03-15"));

        List<Mascota> mascotas = new ArrayList<>();
        mascotas.add(mascota1);
        mascotas.add(mascota2);
        mascotas.add(mascota3);
        AtentionAlertServiceImpl atentionAlertService = new AtentionAlertServiceImpl(mascotas);

        System.out.println("ingrese la fecha a consultar en este formato YYYY-MM-DD");
        LocalDate fecha = LocalDate.parse(sc.next());
        atentionAlertService.alertaDeAtencion(fecha);
    }
}
