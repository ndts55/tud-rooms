package foss.ndts.tudrooms.data;

import java.util.Locale;

public class Windkanal implements UniLocation {
    private static final String Short = "W";
    private static final String DisplayName = "Windkanal / Flugplatz";


    private static final String[] Buildings = {
            "W1|01", "W1|03", "W1|04", "W1|05", "W1|06", "W1|07", "W1|08",
            "W2|01", "W2|02", "W2|03", "W2|04", "W2|05"
    };

    private static final String[] Names = {
            "Flugtechnik (Labore)", "Flugtechnik (Werkstätten)", "Flugtechnik (Windkanal und Halle)", "Minimaxoffice", "Prüfhalle Hochspannungstrasse(im Bau)", "Bürogebäude", "Halle",
            "Tower(August-Euler-Informationszentrum)", "Halle 1", "Halle 2", "Halle 3", "Douglas DC - 8(August-Euler-Informationszentrum)"
    };

    private static final String[] Addresses = {
            "Flughafenstraße 19 64347 Griesheim", "Flughafenstraße 19 64347 Griesheim", "Flughafenstraße 19 64347 Griesheim", "Flughafenstraße 19 64347 Griesheim", "Flughafenstraße 64347 Griesheim", "Flughafenstraße 15 64347 Griesheim", "Flughafenstraße 15 64347 Griesheim",
            "August-Euler-Flugplatz 7 64347 Darmstadt", "August-Euler-Flugplatz 19 64347 Darmstadt", "August-Euler-Flugplatz 9 64347 Darmstadt", "August-Euler-Flugplatz 11 64347 Darmstadt", "August-Euler-Flugplatz 1 64347 Darmstadt"
    };

    public String arrayLengths() {
        return String.format(Locale.ENGLISH, "%s\nBuildings:\t%d\nNames:\t%d\nAddresses:\t%d\n", Short, Buildings.length, Names.length, Addresses.length);
    }

    public String displayName() {
        return DisplayName;
    }

    public String[] buildings() {
        return Buildings;
    }

    public String[] names() {
        return Names;
    }

    public String[] addresses() {
        return Addresses;
    }
}

// W – Standort Windkanal / Flugplatz
// W1 – Abschnitt Windkanal
// W1|01	Flugtechnik (Labore)	Flughafenstraße 19	64347	Griesheim
// W1|03	Flugtechnik (Werkstätten)	Flughafenstraße 19	64347	Griesheim
// W1|04	Flugtechnik (Windkanal und Halle)	Flughafenstraße 19	64347	Griesheim
// W1|05	Minimaxoffice	Flughafenstraße 19	64347	Griesheim
// W1|06	Prüfhalle Hochspannungstrasse ( im Bau)	Flughafenstraße	64347	Griesheim
// W1|07	Bürogebäude	Flughafenstraße 15	64347	Griesheim
// W1|08	Halle	Flughafenstraße 15	64347	Griesheim
// W2 – Abschnitt Flugplatz
// W2|01	Tower (August-Euler-Informationszentrum)	August-Euler-Flugplatz 7	64347 Darmstadt
// W2|02	Halle 1	August-Euler-Flugplatz 19	64347	Darmstadt
// W2|03	Halle 2	August-Euler-Flugplatz 9	64347	Darmstadt
// W2|04	Halle 3	August-Euler-Flugplatz 11	64347	Darmstadt
// W2|05	Douglas DC-8 (August-Euler-Informationszentrum)