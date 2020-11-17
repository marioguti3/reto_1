package com.example.Reto_1.API;

import java.util.ArrayList;
import java.util.Arrays;

import com.example.Reto_1.Model.Pedido;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class PedidosController {
    
    private static ArrayList<Pedido> pedidos = new ArrayList<Pedido>(Arrays.asList(

        new Pedido(1,"20/07/2020","Carlos","En curso"),
        new Pedido(2,"2/10/2020","Mario","Aceptado"),
        new Pedido(3,"17/01/2020","Chema","Enviado"),
        new Pedido(4,"18/09/2020","Victor","Entregado")

));


/*  @GetMapping("/pollas")
     public ArrayList<Pedido> GetAll(@RequestParam(
         name = "id_pedido",
         required = false,
         defaultValue = "0") int id_pedido){
             ArrayList<Pedido> result = getId_pedido(id_pedido);

             return result;
         }
    
public static ArrayList<Pedido> getId_pedido(int id_pedido){
    ArrayList<Pedido> result = pedidos;
    if(id_pedido !=0){
        result = new ArrayList<Pedido>();
        for(Pedido pedido : pedidos){
            if(pedido.getId_pedido()== id_pedido)
            result.add(pedido);
        }
    }
    return result;
}
 */





 



@GetMapping("/pedidos")
 private ArrayList<Pedido> getAllpedidos(){

    return pedidos;
 }
   
}
    





