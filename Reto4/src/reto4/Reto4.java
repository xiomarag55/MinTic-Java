package reto4;

public class Reto4 {

    public static void main(String[] args) {

        Restaurante r = new Restaurante();
        Pedido p = new Pedido();
        p.setnPedido("1");
        p.setCostoPedido(9000);
        r.agregarPedidoLista(p);

        Pedido p1 = new Pedido();
        p1.setnPedido("2");
        p1.setCostoPedido(8000);
        r.agregarPedidoLista(p1);
        
        Pedido p3 = new Pedido();
        p3.setnPedido("3");
        p3.setCostoPedido(18000);
        r.agregarPedidoLista(p3);
        for (Pedido pedido : r.getPedidos()) {
            System.out.print(pedido.getnPedido()+ ": ");
            System.out.println(pedido.getCostoPedido());
        }
        System.out.println("Ganancias: " + r.calcularGanancias());
        System.out.println("Promedio: " + r.promedioGananciasTotales());
        System.out.println("Desviación estandar: " + r.desviacionEstandarGananciasTotales() );
    }

}
