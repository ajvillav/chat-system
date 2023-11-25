package com.chat.system;

import java.util.List;
import java.util.Set;

public class NotificacionEnvio implements OyenteEvento {

    private String nombre;

    public NotificacionEnvio(String registro) {
        this.nombre = registro;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void enviarMensaje(String tipoCanal, String contenido) {
        System.out.println("El/la usuari@ " + nombre + " acaba de enviar un mensaje con el contenido \"" + contenido + "\" al canal " + tipoCanal + "\n");
    }

    @Override
    public void listarSuscriptores(String tipoCanal, Set<String> nombresSuscriptores) {
        System.out.println("Los usuarios suscritos al " + tipoCanal + " son: " + String.join(", ", nombresSuscriptores) + "\n");
    }

}
