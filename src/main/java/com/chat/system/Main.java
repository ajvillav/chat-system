package com.chat.system;

public class Main {
    public static void main(String[] args) {
        SistemaChat sistemaChat = new SistemaChat();

        String usuario1 = "Andrés";
        String usuario2 = "Veronica";
        String usuario3 = "Alejandro";

        // Suscripciones de Andrés
        sistemaChat.getEventos().suscribir("Canal Deportes", new NotificacionEnvio(usuario1));
        sistemaChat.getEventos().suscribir("Canal Deportes", new NotificacionRespuesta(usuario1));

        sistemaChat.getEventos().suscribir("Canal Noticias", new NotificacionEnvio(usuario1));
        sistemaChat.getEventos().suscribir("Canal Noticias", new NotificacionRespuesta(usuario1));
        System.out.println("\nUsuario Andrés se suscribe para enviar y recibir mensajes a los canales de deportes y noticias");

        // Suscripciones de Vero
        sistemaChat.getEventos().suscribir("Canal Deportes", new NotificacionRespuesta(usuario2));

        sistemaChat.getEventos().suscribir("Canal Noticias", new NotificacionRespuesta(usuario2));

        sistemaChat.getEventos().suscribir("Canal Farandula", new NotificacionEnvio(usuario2));
        sistemaChat.getEventos().suscribir("Canal Farandula", new NotificacionRespuesta(usuario2));
        System.out.println("\nUsuari@ Vero se suscribe para enviar y recibir mensajes a los canales de noticias, deportes y farandula");

        // Suscripciones de Alejandro
        sistemaChat.getEventos().suscribir("Canal Farandula", new NotificacionRespuesta(usuario3));
        System.out.println("\nUsuari@ Alejandro se suscribe para enviar y recibir mensajes al canal de farandula\n");


        //ENVIO Y RECEPCIÓN DE MENSAJES
        sistemaChat.publicarMensaje("Canal Deportes", "Messi acaba de ganar el balón de oro!");
        sistemaChat.publicarMensaje("Canal Noticias", "Continua la guerra entre Israel y Palestina");
        sistemaChat.publicarMensaje("Canal Farandula", "Shakira paga millonaria multa");
    }
}
