package com.example.Reto_1.API;

import java.util.ArrayList;
import java.util.Arrays;

import com.example.Reto_1.Model.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController{
    private static ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(

            new Product(1, "Producto 1", "20",
                    "https://assets.mmsrg.com/isr/166325/c1/-/ASSET_MMS_70511491/wcs_overlay_prod_detail/Reloj-deportivo---Fitbit-Versa-2--Oro-rosa--GPS--Sumergible--15-modos-de-ejercicio--An%C3%A1lisis-del-sue%C3%B1o"),
            new Product(2, "Producto 2", "40",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcS3-0do0Vw036tFG_QhnYR6vARcbx0MWq-yx60kmWpBJnzyH_hLsnRPy_4nATzSqsvYeCxKnTBh&usqp=CAc"),
            new Product(3, "Producto 3", "500",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRhME4vy94fdwwvBVqaLSIUqCzMzy4NwPohbA&usqp=CAU"),
            new Product(4, " Producto 4", "50",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcToKOotdsuCB2zfCSo-y6e0ajfE3o3yzk936bIytP16-RAbOUiNgAlvpvwlglzXk_gfymaBETFL&usqp=CAc")

    ));
   
    @GetMapping("/productos")
    private ArrayList<Product> getAllProducts(
            @RequestParam(name = "nombre", defaultValue = "", required = false) String nombre,
            @RequestParam(name = "precio", defaultValue = "", required = false) String precio) {

        ArrayList<Product> AllProducts = new ArrayList<Product>();
        if (nombre.equals("") && precio.equals("")) {
            return products;
        }
        if (!nombre.equals("") && precio.equals("")) {
            for (Product product : products) {
                if (product.getNombre().contains(nombre)) {
                    AllProducts.add(product);

                }

            }
            return AllProducts;
        }

        if (nombre.equals("") && !precio.equals("")) {
            for (Product product : products) {
                if (product.getPrecio().contains(precio)) {
                    AllProducts.add(product);

                }

            }

            return AllProducts;

        }

        if (!nombre.equals("") && !precio.equals("")) {
            for (Product product : products) {
                if (product.getPrecio().contains(precio) && product.getNombre().contains(nombre)) {
                    AllProducts.add(product);

                }

            }

            return AllProducts;

        }

        return null;

    }


}