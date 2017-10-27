package foss.ndts.tudrooms.data;

import java.util.Locale;

public class Stadtmitte implements UniLocation {
    private static final String Short = "S";

    private static final String DisplayName = "Stadtmitte";

    private static final String[] Buildings = {
            "S1|01",
            "S1|02",
            "S1|03",
            "S1|05",
            "S1|08",
            "S1|09",
            "S1|10",
            "S1|11",
            "S1|13",
            "S1|14",
            "S1|15",
            "S1|17",
            "S1|18",
            "S1|20",
            "S1|21",
            "S1|22",
            "S1|60",

            "S2|01",
            "S2|02",
            "S2|03",
            "S2|04",
            "S2|05",
            "S2|06",
            "S2|07",
            "S2|08",
            "S2|09",
            "S2|10",
            "S2|11",
            "S2|12",

            "S2|13",
            "S2|14",
            "S2|15",
            "S2|17",

            "S3|05",
            "S3|06",
            "S3|07",
            "S3|08",
            "S3|09",
            "S3|10",
            "S3|11",
            "S3|12",
            "S3|13",
            "S3|14",
            "S3|15",
            "S3|16",
            "S3|17",
            "S3|19",
            "S3|20",
            "S3|21",

            "S4|01",
            "S4|02",
            "S4|07",
            "S4|10",
            "S4|13",
            "S4|14",
            "S4|15",
            "S4|17",

            "S4|18",
            "S4|20",
            "S4|21",
            "S4|22",
            "S4|23",
            "S4|24",
            "S4|25",
            "S4|26",
            "S4|84",
            "S4|85"
    };

    private static final String[] Names = {
            "Universitätszentrum, karo 5, Audimax",
            "Altes Hauptgebäude (Westflügel",
            "Altes Hauptgebäude",
            "Maschinenhaus",
            "Maschinenbau",
            "Maschinenbauhalle Mitte",
            "Druckmaschinen",
            "Mensa mit Otto-Berndt-Halle",
            "Pädagogik / Berufspädagogik",
            "Papierfabrikation",
            "Psychologie",
            "Sportwissenschaft (Hofreite Vorderhaus",
            "Sportwissenschaft (Hofreite Hinterhaus",
            "Universitäts- und Landesbibliothek ULB",
            "Kinderhaus II – Stadtmitte (im Bau",
            "Karl Plagge-Haus",
            "Verwaltung",

            "Rau - Bau",
            "Robert - Piloty - Gebäude",
            "Studierendenhaus",
            "Festkörperphysik",
            "Physik Werkstätten",
            "Physik Hörsäle",
            "Physik Institute",
            "Physik Hörsaal Uhrturm",
            "Physik Lichttechnik",
            "Institutsgebäude",
            "Physik Institutsgebäude",
            "Institutsgebäude",
            "Fraunhofer - Institut für Betriebsfestigkeit und Systemzuverlässigkeit LBF, Bereich Kunststoffe",
            "Kernphysik / S - DALINAC",
            "Mathematik / Physik",
            "Halbleitertechnik",

            "Fraunhofer - Institut für Graphische Datenverarbeitung(IGD",
            "Elektrotechnik und Informationstechnik(Hans - Busch - Institut",
            "Ernst - Neufert - Halle",
            "Hochspannungshalle",
            "Elektrotechnik und Informationstechnik Hallen mit Werkstätten",
            "Elektrotechnik und Informationstechnik Institute",
            "Elektrotechnik und Informationstechnik Hörsäle",
            "Schloss Universitäts - und Landesbibliothek(ULB",
            "Schloss Kaisersaalbau, Institute",
            "Schloss Kirchenbau, Paukergang, Torhalle",
            "Schloss Glockenbau",
            "Schloss Wallhaus",
            "Schloss Brückenhaus",
            "Instituts - und Verwaltungsgebäude(Anmietung",
            "Instituts - und Verwaltungsgebäude",
            "Verfügungsgebäude Elektrotechnik",

            "Mollerbau(Haus der Geschichte / Staatsarchiv(Anmietung",
            "Werkstoffkunde / Staatliche Materialprüfungsanstalt(MPA",
            "Studienkolleg für ausländische Studierende",
            "Institutsgebäude(Anmietung",
            "Institutsgebäude(Anmietung",
            "FB Informatik / LOEWE - Schwerpunkt CASED(Anmietung",
            "Institutsgebäude(Anmietung",
            "Holzstraße 2(Anmietung",
            "TIZ Technologie - und Innovationszentrum Darmstadt Studienkolleg Informatik(Anmietung",
            "Institutsgebäude Holzhofallee(Anmietung",
            "Institutsgebäude im Carree",
            "Institutsgebäude",
            "Institutsgebäude",
            "Institutsgebäude",
            "Verwaltungsgebäude(Anmietung",
            "Verwaltungsgebäude(Anmietung",
            "Georg - Christoph - Lichtenberg - Haus, Internationales Begegnungszentrum(IBZ",
            "Reithalle mit Stallungen",
    };

    private static final String[] Addresses = {
            "Karolinenplatz 5, 64289, Darmstadt",
            "Hochschulstraße 3, 64289, Darmstadt",
            "Hochschulstraße 1, 64289, Darmstadt",
            "Magdalenenstraße 12, 64289, Darmstadt",
            "Magdalenenstraße 4, 64289, Darmstadt",
            "Magdalenenstraße 6, 64289, Darmstadt",
            "Magdalenenstraße 2, 64289, Darmstadt",
            "Alexanderstraße 4, 64283, Darmstadt",
            "Alexanderstraße 6, 64283, Darmstadt",
            "Alexanderstraße 8, 64283, Darmstadt",
            "Alexanderstraße 10, 64283, Darmstadt",
            "Magdalenenstraße 27, 64289, Darmstadt",
            "Magdalenenstraße 27, 64289, Darmstadt",
            "Magdalenenstraße 8, 64289, Darmstadt",
            "Magdalenenstraße 25, 64289, Darmstadt",
            "Alexanderstraße 2, 64283, Darmstadt",
            "Magdalenenstraße 23, 64289, Darmstadt",

            "Hochschulstraße 12, 64289, Darmstadt",
            "Hochschulstraße 10, 64289, Darmstadt",
            "Hochschulstraße 14, 64289, Darmstadt",
            "Hochschulstraße 8, 64289, Darmstadt",
            "Hochschulstraße 6A, 64289, Darmstadt",
            "Hochschulstraße 6, 64289, Darmstadt",
            "Hochschulstraße 6, 64289, Darmstadt",
            "Hochschulstraße 4, 64289, Darmstadt",
            "Hochschulstraße 4A, 64289, Darmstadt",
            "Hochschulstraße 2, 64289, Darmstadt",
            "Schlossgartenstraße 2, 64289, Darmstadt",
            "Schlossgartenstraße 4, 64289, Darmstadt",
            "Schlossgartenstraße 6 6A, 64289, Darmstadt",
            "Schlossgartenstraße 9, 64289, Darmstadt",
            "Schlossgartenstraße 7, 64289, Darmstadt",
            "Schlossgartenstraße 8, 64289, Darmstadt",

            "Fraunhoferstraße 5, 64283, Darmstadt",
            "Merckstraße 25, 64283, Darmstadt",
            "Rundeturmstraße 1, 64283, Darmstadt",
            "Landgraf - Georg - Straße 8, 64283, Darmstadt",
            "Landgraf - Georg - Straße 6, 64283, Darmstadt",
            "Landgraf - Georg - Straße 4, 64283, Darmstadt",
            "Landgraf - Georg - Straße 2, 64283, Darmstadt",
            "Marktplatz 15, 64283, Darmstadt",
            "Marktplatz 15, 64283, Darmstadt",
            "Marktplatz 15, 64283, Darmstadt",
            "Marktplatz 15, 64283, Darmstadt",
            "Marktplatz 15, 64283, Darmstadt",
            "Marktplatz, 64283, Darmstadt",
            "Rundeturmstraße 12, 64283, Darmstadt",
            "Rundeturmstraße 10, 64283, Darmstadt",
            "Fraunhoferstraße 4, 64283, Darmstadt",

            "Karolinenplatz 3, 64289, Darmstadt",
            "Grafenstraße 2, 64283, Darmstadt",
            "Poststraße 5, 64293, Darmstadt",
            "Dolivostraße 15, 64293, Darmstadt",
            "Bleichstraße 2, 64283, Darmstadt",
            "Mornewegstraße 26 - 32, 64293, Darmstadt",
            "Goethestraße 48 50, 64285, Darmstadt",
            "Holzstraße 2, 64283, Darmstadt",
            "Robert - Bosch - Straße 7, Lise - Meitner - Straße 10 64293, Darmstadt",
            "Holzhofallee 38, 64295, Darmstadt",
            "Im Carree 3, 64283, Darmstadt",
            "Landwehrstraße 48A - 50, 64293, Darmstadt",
            "Landwehrstraße 50A, 64293, Darmstadt",
            "Landwehrstraße 54, 642893, Darmstadt",
            "Schleiermacherstraße 10 12, 64283,Darmstadt",
            "Feldbergstraße 78, 64283, Darmstadt",
            "Dieburger Straße 241, 64287, Darmstadt",
            "Dieburger Straße 241, 64287, Darmstadt"
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

// S – Standort Stadtmitte
// S1 – Abschnitt Stadtmitte Mitte
// S1|01	Universitätszentrum, karo 5, Audimax	Karolinenplatz 5	64289	Darmstadt
// S1|02	Altes Hauptgebäude (Westflügel)	Hochschulstraße 3	64289	Darmstadt
// S1|03	Altes Hauptgebäude	Hochschulstraße 1	64289	Darmstadt
// S1|05	Maschinenhaus	Magdalenenstraße 12	64289	Darmstadt
// S1|08	Maschinenbau	Magdalenenstraße 4	64289	Darmstadt
// S1|09	Maschinenbauhalle Mitte	Magdalenenstraße 6	64289	Darmstadt
// S1|10	Druckmaschinen	Magdalenenstraße 2	64289	Darmstadt
// S1|11	Mensa mit Otto-Berndt-Halle	Alexanderstraße 4	64283	Darmstadt
// S1|13	Pädagogik / Berufspädagogik	Alexanderstraße 6	64283	Darmstadt
// S1|14	Papierfabrikation	Alexanderstraße 8	64283	Darmstadt
// S1|15	Psychologie	Alexanderstraße 10	64283	Darmstadt
// S1|17	Sportwissenschaft (Hofreite Vorderhaus)	Magdalenenstraße 27	64289	Darmstadt
// S1|18	Sportwissenschaft (Hofreite Hinterhaus)	Magdalenenstraße 27	64289	Darmstadt
// S1|20	Universitäts- und Landesbibliothek ULB	Magdalenenstraße 8	64289	Darmstadt
// S1|21	Kinderhaus II – Stadtmitte (im Bau)	Magdalenenstraße 25	64289	Darmstadt
// S1|22	Karl Plagge-Haus	Alexanderstraße 2	64283	Darmstadt
// S1|60	Verwaltung	Magdalenenstraße 23	64289	Darmstadt
// S2 – Abschnitt Stadtmitte Nord
// S2|01	Rau-Bau	Hochschulstraße 12	64289	Darmstadt
// S2|02	Robert-Piloty-Gebäude	Hochschulstraße 10	64289	Darmstadt
// S2|03	Studierendenhaus	Hochschulstraße 14	64289	Darmstadt
// S2|04	Festkörperphysik	Hochschulstraße 8	64289	Darmstadt
// S2|05	Physik Werkstätten	Hochschulstraße 6A	64289	Darmstadt
// S2|06	Physik Hörsäle	Hochschulstraße 6	64289	Darmstadt
// S2|07	Physik Institute	Hochschulstraße 6	64289	Darmstadt
// S2|08	Physik Hörsaal Uhrturm	Hochschulstraße 4	64289	Darmstadt
// S2|09	Physik Lichttechnik	Hochschulstraße 4A	64289	Darmstadt
// S2|10	Institutsgebäude	Hochschulstraße 2	64289	Darmstadt
// S2|11	Physik Institutsgebäude	Schlossgartenstraße 2	64289	Darmstadt
// S2|12	Institutsgebäude	Schlossgartenstraße 4	64289	Darmstadt
// S2|13	Fraunhofer-Institut für Betriebsfestigkeit und Systemzuverlässigkeit LBF, Bereich Kunststoffe	Schlossgartenstraße 6,6A	64289	Darmstadt
// S2|14	Kernphysik / S-DALINAC	Schlossgartenstraße 9	64289	Darmstadt
// S2|15	Mathematik / Physik	Schlossgartenstraße 7	64289	Darmstadt
// S2|17	Halbleitertechnik	Schlossgartenstraße 8	64289	Darmstadt
// S3 – Abschnitt Stadtmitte Süd
// S3|05	Fraunhofer-Institut für Graphische Datenverarbeitung (IGD)	Fraunhoferstraße 5	64283	Darmstadt
// S3|06	Elektrotechnik und Informationstechnik (Hans-Busch-Institut)	Merckstraße 25	64283	Darmstadt
// S3|07	Ernst-Neufert-Halle	Rundeturmstraße 1	64283	Darmstadt
// S3|08	Hochspannungshalle	Landgraf-Georg-Straße 8	64283	Darmstadt
// S3|09	Elektrotechnik und Informationstechnik Hallen mit Werkstätten	Landgraf-Georg-Straße 6	64283	Darmstadt
// S3|10	Elektrotechnik und Informationstechnik Institute	Landgraf-Georg-Straße 4	64283	Darmstadt
// S3|11	Elektrotechnik und Informationstechnik Hörsäle	Landgraf-Georg-Straße 2	64283	Darmstadt
// S3|12	Schloss Universitäts- und Landesbibliothek (ULB)	Marktplatz 15	64283	Darmstadt
// S3|13	Schloss Kaisersaalbau, Institute	Marktplatz 15	64283	Darmstadt
// S3|14	Schloss Kirchenbau, Paukergang, Torhalle	Marktplatz 15	64283	Darmstadt
// S3|15	Schloss Glockenbau	Marktplatz 15	64283	Darmstadt
// S3|16	Schloss Wallhaus	Marktplatz 15	64283	Darmstadt
// S3|17	Schloss Brückenhaus	Marktplatz	64283	Darmstadt
// S3|19	Instituts- und Verwaltungsgebäude (Anmietung)	Rundeturmstraße 12	64283	Darmstadt
// S3|20	Instituts- und Verwaltungsgebäude	Rundeturmstraße 10	64283	Darmstadt
// S3|21	Verfügungsgebäude Elektrotechnik	Fraunhoferstraße 4	64283	Darmstadt
// S4 – Abschnitt Stadtmitte Außenbereiche
// S4|01	Mollerbau (Haus der Geschichte / Staatsarchiv) (Anmietung)	Karolinenplatz 3	64289	Darmstadt
// S4|02	Werkstoffkunde/ Staatliche Materialprüfungsanstalt (MPA)	Grafenstraße 2	64283	Darmstadt
// S4|07	Studienkolleg für ausländische Studierende	Poststraße 5	64293	Darmstadt
// S4|10	Institutsgebäude (Anmietung)	Dolivostraße 15	64293	Darmstadt
// S4|13	Institutsgebäude (Anmietung) Bleichstraße 2	64283	Darmstadt
// S4|14	FB Informatik / LOEWE-Schwerpunkt CASED (Anmietung)	Mornewegstraße 26-32	64293	Darmstadt
// S4|15	Institutsgebäude (Anmietung)	Goethestraße 48,50	64285	Darmstadt
// S4|17	Holzstraße 2 (Anmietung)	Holzstraße 2	64283	Darmstadt
// S4|18	TIZ Technologie- und Innovationszentrum Darmstadt Studienkolleg Informatik (Anmietung)	Robert-Bosch-Straße 7 Lise-Meitner-Straße 10	64293	Darmstadt
// S4|20	Institutsgebäude Holzhofallee (Anmietung)	Holzhofallee 38	64295	Darmstadt
// S4|21	Institutsgebäude im Carree	Im Carree 3	64283	Darmstadt
// S4|22	Institutsgebäude	Landwehrstraße 48A-50	64293	Darmstadt
// S4|23	Institutsgebäude	Landwehrstraße 50A	64293	Darmstadt
// S4|24	Institutsgebäude	Landwehrstraße 54	642893	Darmstadt
// S4|25	Verwaltungsgebäude (Anmietung)	Schleiermacherstraße 10,12	64283	Darmstadt
// S4|26	Verwaltungsgebäude (Anmietung)	Feldbergstraße 78	64283	Darmstadt
// S4|84	Georg-Christoph-Lichtenberg-Haus, Internationales Begegnungszentrum (IBZ)	Dieburger Straße 241	64287	Darmstadt
// S4|85	Reithalle mit Stallungen	Dieburger Straße 241	64287	Darmstadt