package com.chat.system;

public class SistemaChat {

    private GestorEventos eventos;
    private String contenido;

    private String usuario;

    public GestorEventos getEventos() {
        return eventos;
    }

    public SistemaChat() {
        this.eventos = new GestorEventos("Canal Deportes", "Canal Farandula", "Canal Noticias");
    }

    public void publicarMensaje(String tipoCanal, String contenido) {
        this.contenido = contenido;
        eventos.notificar(tipoCanal, contenido);
    }

}
