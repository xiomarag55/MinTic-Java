package reto4;

import java.util.ArrayList;

public class Restaurante {

    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Restaurante() {

    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void agregarPedidoLista(Pedido p) {
        boolean agregado = false;
            for (Pedido pedido : pedidos) {
                if (pedido.getnPedido().equals(p.getnPedido())) {
                    agregado = true;
                }
            }

        if (!agregado) {
            pedidos.add(p);
        }
    }

    public void eliminarPedido(String nPedidos) {
        pedidos.removeIf(n -> n.getnPedido().equals(nPedidos));
    }

    public double calcularGanancias() {
        double sumaTotal = 0;
        for (Pedido pedido : pedidos) {
            sumaTotal += pedido.getCostoPedido();
        }
        return sumaTotal;

    }

    public double promedioGananciasTotales() {

        return calcularGanancias() / pedidos.size();
    }

    public double desviacionEstandarGananciasTotales() {
        double promedio = promedioGananciasTotales();
        double temp = 0;
        double varianza = 0;
        for (Pedido pedido : pedidos) {
            temp += (pedido.getCostoPedido() - promedio) * (pedido.getCostoPedido() - promedio);
            varianza = temp / (pedidos.size());

        }
        return Math.sqrt(varianza);

    }

    public double retornarCostoPedido(String ID) {
        double costo = 0;
        for (Pedido pedido : pedidos) {
            if (ID == pedido.getnPedido()) {
                costo = pedido.getCostoPedido();
            }

        }
        return costo;

    }

}
