package com.example.Reto_1.Model;

public class Product{
    public Product(){}

    public Product(int id_product,String nombre, String precio, String url){
        this.id_product = id_product;
        this.nombre = nombre;
        this.precio = precio;
        this.url = url;
    } 

private int id_product;
private String nombre;
private String precio;
private String url;

public int getId(){
    return id_product;
}

public void setId(int id_product){
    this.id_product = id_product;
}

public String getNombre(){
    return nombre;
}

public void setNombre(String nombre){
    this.nombre = nombre;
}

public String getPrecio(){
    return precio;
}

public void setPrecio(String precio){
    this.precio = precio;
}

public String getUrl(){
    return url;
}

public void setUrl(String url){
    this.url = url;
}

}