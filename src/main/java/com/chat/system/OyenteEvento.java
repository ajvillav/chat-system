package com.chat.system;

import java.util.Set;

public interface OyenteEvento {

    void enviarMensaje(String tipoCanal, String contenido);
    void listarSuscriptores(String tipoCanal, Set<String> nombresSuscriptores);
    String getNombre();

}
