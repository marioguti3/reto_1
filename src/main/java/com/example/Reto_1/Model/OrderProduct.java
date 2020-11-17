package com.example.Reto_1.Model;


public class OrderProduct{

    public OrderProduct(){}

 public OrderProduct(int id_product, int id_pedido, int cantidad ){
this.id_product = id_product;
this.id_pedido = id_pedido;
this.cantidad = cantidad;
    }

    private int id_product;
    public int getId_product(){return id_product;}
    public int setId_product(int id_product){return id_product;}

    private int id_pedido;
    public int getId_pedido(){return id_pedido;}
    public int setId_pedido(int id_pedido){return id_pedido;}

    public int cantidad;
    public int getCantidad(){return cantidad;}
    public int setCantidad(int cantidad){return cantidad;}
}