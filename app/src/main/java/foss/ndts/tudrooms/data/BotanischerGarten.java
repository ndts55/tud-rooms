package foss.ndts.tudrooms.data;


import java.util.Locale;

public class BotanischerGarten implements UniLocation {
    private static final String Short = "B";

    private static final String DisplayName = "Botanischer Garten";

    private static final String[] Buildings = {
            "B1|01", "B1|02", "B1|03", "B1|04", "B1|06", "B1|07", "B1|08", "B1|70",
            "B2|01", "B2|02", "B2|03", "B2|04", "B2|05", "B2|06", "B2|07", "B2|61",
    };

    private static final String[] Names = {
            "Botanik, Zoologie(Institutsgebäude mit Energiehaus",
            "Botanik(Altbau",
            "Großes Gewächshaus",
            "Versuchsgewächshaus",
            "Kalthauspflanzen(Gewächshaus",
            "Orchideenhaus(Gewächshaus",
            "Mobi - Office I",
            "Infopavillon Botanischer Garten",
            "Angewandte Geowissenschaften und Hörsaal",
            "Angewandte Geowissenschaften",
            "Biologie Verfügungsgebäude",
            "Ökologisches Versuchsgewächshaus",
            "Bioinnovationszentrum I(BIZ I",
            "Bioinnovationszentrum II(BIZ II",
            "Mobi - Office II",
            "Studierendenzentrum Botanik, Cafe Bios"
    };

    private static final String[] Addresses = {
            "Schnittspahnstraße 3, 64287, Darmstadt",
            "Schnittspahnstraße 4, 64287, Darmstadt",
            "Schnittspahnstraße 5, 64287, Darmstadt",
            "Schnittspahnstraße 5, 64287, Darmstadt",
            "Schnittspahnstraße 5, 64287, Darmstadt",
            "Schnittspahnstraße 5, 64287, Darmstadt",
            "Schnittspahnstraße 2, 64287, Darmstadt",
            "Schnitspahnstraße, 64287, Darmstadt",
            "Schnittspahnstraße 9 64287 Darmstadt",
            "Schnittspahnstraße 9 64287 Darmstadt",
            "Schnittspahnstraße 10 64287 Darmstadt",
            "Schnittspahnstraße 10A 64287 Darmstadt",
            "Schnittspahnstraße 12 64287 Darmstadt",
            "Schnittspahnstraße 13 64287 Darmstadt",
            "Schnittspahnstraße 13 64287 Darmstadt",
            "Schnittspahnstraße 11 64287 Darmstadt"
    };

    public boolean isOk() {
        return Buildings.length == Names.length && Names.length == Addresses.length;
    }

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

// B – Standort Botanischer Garten
// B1 – Abschnitt Botanischer Garten West
// B1|01	Botanik, Zoologie (Institutsgebäude mit Energiehaus)	Schnittspahnstraße 3	64287	Darmstadt
// B1|02	Botanik (Altbau)	Schnittspahnstraße 4	64287	Darmstadt
// B1|03	Großes Gewächshaus	Schnittspahnstraße 5	64287	Darmstadt
// B1|04	Versuchsgewächshaus	Schnittspahnstraße 5	64287	Darmstadt
// B1|06	Kalthauspflanzen (Gewächshaus)	Schnittspahnstraße 5	64287	Darmstadt
// B1|07	Orchideenhaus (Gewächshaus)	Schnittspahnstraße 5	64287	Darmstadt
// B1|08	Mobi-Office I	Schnittspahnstraße 2	64287	Darmstadt
// B1|70	Infopavillon Botanischer Garten	Schnitspahnstraße	64287	Darmstadt
// B2 – Abschnitt Botanischer Garten Ost
// B2|01	Angewandte Geowissenschaften und Hörsaal	Schnittspahnstraße 9	64287	Darmstadt
// B2|02	Angewandte Geowissenschaften	Schnittspahnstraße 9	64287	Darmstadt
// B2|03	Biologie Verfügungsgebäude	Schnittspahnstraße 10	64287	Darmstadt
// B2|04	Ökologisches Versuchsgewächshaus	Schnittspahnstraße 10A	64287	Darmstadt
// B2|05	Bioinnovationszentrum I (BIZ I)	Schnittspahnstraße 12	64287	Darmstadt
// B2|06	Bioinnovationszentrum II (BIZ II)	Schnittspahnstraße 13	64287	Darmstadt
// B2|07	Mobi-Office II	Schnittspahnstraße 13	64287	Darmstadt
// B2|61	Studierendenzentrum Botanik, Cafe Bios	Schnittspahnstraße 11	64287	Darmstadt