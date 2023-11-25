package com.chat.system;

import java.util.*;
import java.util.stream.Collectors;

public class GestorEventos {

    private Map<String, List<OyenteEvento>> suscriptores = new HashMap<>();

    public GestorEventos(String... tipoCanal) {
        for (String tipo : tipoCanal) {
            this.suscriptores.put(tipo, new ArrayList<>());
        }
    }

    public void suscribir(String tipoCanal, OyenteEvento suscriptor) {
        List<OyenteEvento> usuarios = suscriptores.get(tipoCanal);
        usuarios.add(suscriptor);
    }

    public void dessucribir(String tipoCanal, OyenteEvento suscriptor) {
        List<OyenteEvento> usuarios = suscriptores.get(tipoCanal);
        usuarios.remove(suscriptor);
    }

    public void notificar(String tipoRevista, String edicion) {
        List<OyenteEvento> usuarios = suscriptores.get(tipoRevista);
        Set<String> nombresSuscriptores = usuarios.stream()
                .map(OyenteEvento::getNombre)
                .collect(Collectors.toSet());

        for (OyenteEvento suscriptor : usuarios) {
            suscriptor.enviarMensaje(tipoRevista, edicion);
        }

        if (!usuarios.isEmpty()) {
            usuarios.get(0).listarSuscriptores(tipoRevista, nombresSuscriptores);
        }
    }

}
