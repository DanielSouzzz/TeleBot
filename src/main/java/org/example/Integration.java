package org.example;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.CalendarScopes;

import java.io.IOException;
import java.util.Collections;

public class Integration {
    private static final String APP_NAME = "MyBot";

    private Calendar service;

    public Integration() throws IOException {
        // Autenticação
        GoogleCredential credential = GoogleCredential
                .getApplicationDefault()
                .createScoped(Collections.singleton(CalendarScopes.CALENDAR));

        // Inicia o serviço do Google Calendar.
        service = new Calendar.Builder(
                credential.getTransport(),
                credential.getJsonFactory(),
                credential)
                .setApplicationName(APP_NAME)
                .build();
    }

    public Calendar getService() {
        return service;
    }
}
