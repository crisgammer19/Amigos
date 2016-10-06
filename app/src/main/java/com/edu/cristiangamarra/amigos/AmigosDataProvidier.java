package com.edu.cristiangamarra.amigos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CRISTIAN GAMARRA on 05/10/2016.
 */
public class AmigosDataProvidier {
    public static List<Amigo> getAmigos(){
        List<Amigo> amigos = new ArrayList<Amigo>();

        for (int i = 1; i<101;i++){
            Amigo a = new Amigo();
            a.setNombre("Nombre"+i);
            a.setEmail("Email"+1+"@usuario.com,");
            amigos.add(a);


        }

        return amigos;
    }
}
