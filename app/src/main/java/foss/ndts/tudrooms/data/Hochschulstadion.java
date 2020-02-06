package foss.ndts.tudrooms.data;

public class Hochschulstadion implements UniLocation {
    private static final String DisplayName = "Hochschulstadion";

    private static final String[] Buildings = {
            "H1|01",
            "H1|02",
            "H1|03",
            "H1|04",
            "H1|05",
            "H1|06",
            "H1|07",
            "H1|08",
            "H1|82",
            "H1|84"
    };

    private static final String[] Names = {
            "Sporthallen",
            "Hochschulstadion, Laufbahn und Sitzterrassen",
            "unifit",
            "Hochschulstadion Kinderbadebecken",
            "Hochschulstadion Garderoben",
            "Hochschulstadion Schwimmbad mit Tribüne",
            "Kletterhalle Alpenverein",
            "Bürogebäude Unisport-Zentrum",
            "Otto Wolfskehl-Haus(Internationales Gästehaus)",
            "uniKITA-Waldkindergarten"
    };

    private static final String[] Addresses = {
            "Lichtwiesenweg 5 64287, Darmstadt",
            "Lichtwiesenweg 64287, Darmstadt",
            "Lichtwiesenweg 15 64287, Darmstadt",
            "Lichtwiesenweg 64287, Darmstadt",
            "Lichtwiesenweg 64287, Darmstadt",
            "Lichtwiesenweg 64287, Darmstadt",
            "Lichtwiesenweg 15 64287, Darmstadt",
            "Lichtwiesenweg 3 64287, Darmstadt",
            "Nieder-Ramstädter Straße 130, 130A 64287, Darmstadt",
            "Lichtwiesenweg 9A 64287, Darmstadt"
    };

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

// H – Standort Hochschulstadion
// H1|01	Sporthallen	Lichtwiesenweg 5	64287	Darmstadt
// H1|02	Hochschulstadion, Laufbahn und Sitzterrassen	Lichtwiesenweg	64287	Darmstadt
// H1|03	unifit  Lichtwiesenweg 15	64287	Darmstadt
// H1|04	Hochschulstadion Kinderbadebecken	Lichtwiesenweg	64287	Darmstadt
// H1|05	Hochschulstadion Garderoben	Lichtwiesenweg	64287	Darmstadt
// H1|06	Hochschulstadion Schwimmbad mit Tribüne	Lichtwiesenweg	64287	Darmstadt
// H1|07	Kletterhalle Alpenverein	Lichtwiesenweg 15	64287	Darmstadt
// H1|08	Bürogebäude Unisport-Zentrum	Lichtwiesenweg 3	64287	Darmstadt
// H1|82	Otto Wolfskehl-Haus (Internationales Gästehaus)	Nieder-Ramstädter Straße 130, 130A	64287	Darmstadt
// H1|84	uniKITA – Waldkindergarten	Lichtwiesenweg 9A	64287	Darmstadt