package com.example.Reto_1.Model;
public class Pedido{
    
    public Pedido(){}

    public Pedido(int id_pedido ,String date, String nombre_user, String estado){
        this.id_pedido = id_pedido;
        this.date = date;
        this.nombre_user = nombre_user;
        this.estado = estado;
    }


    private int id_pedido;
   private String date;
   private String nombre_user;
   private String estado;

   public int getId_pedido(){
    return id_pedido;
}

public void setId_pedido(int id_pedido){
    this.id_pedido = id_pedido;
}
public String getDate(){
    return date;
}

public void setDate(String date){
    this.date = date;
}
public String getNombre_user(){
    return nombre_user;
}

public void setNombre_user(String nombre_user){
    this.nombre_user = nombre_user;
}

public String getEstado(){
    return estado;
}

public void setEstado(String estado){
    this.estado = estado;
}
    }
