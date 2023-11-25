package com.chat.system;

import java.util.List;
import java.util.Set;

public class NotificacionRespuesta implements OyenteEvento{

    @Override
    public String getNombre() {
        return nombre;
    }

    private String nombre;

    public NotificacionRespuesta(String email) {
        this.nombre = email;
    }

    @Override
    public void enviarMensaje(String tipoCanal, String contenido) {
        System.out.println("Los usuarios suscritos al " + tipoCanal + " recibieron mensaje con contenido \"" + contenido + "\"\n");
    }

    @Override
    public void listarSuscriptores(String tipoCanal, Set<String> nombresSuscriptores) {
        System.out.println("Los usuarios suscritos al " + tipoCanal + " son: " + String.join(", ", nombresSuscriptores) + "\n");
    }

}
