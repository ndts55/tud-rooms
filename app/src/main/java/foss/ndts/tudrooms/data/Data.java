package foss.ndts.tudrooms.data;

import foss.ndts.tudrooms.model.Building;

import static foss.ndts.tudrooms.model.Area.S;

public class Data {
    private static final Building[] buildings = {
            new Building(S, "101", "Karolinenplatz 5, 64289, Darmstadt", "karo 5", "Audimax"),
            new Building(S, "102", "Hochschulstraße 3, 64289, Darmstadt", "Altes Hauptgebäude (Westflügel)"),
            new Building(S, "103", "Hochschulstraße 1, 64289, Darmstadt", "Altes Hauptgebäude"),
            new Building(S, "105", "Magdalenenstraße 12, 64289, Darmstadt", "Maschinenhaus"),
            new Building(S, "108", "Magdalenenstraße 4, 64289, Darmstadt", "Maschinenbau"),
            new Building(S, "109", "Magdalenenstraße 6, 64289, Darmstadt", "Maschinenbauhalle"),
            new Building(S, "110", "Magdalenenstraße 2, 64289, Darmstadt", "Druckmaschinen"),
            new Building(S, "111", "Alexanderstraße 4, 64283, Darmstadt", "Mensa", "Otto-Berndt-Halle"),
            new Building(S, "113", "Alexanderstraße 6, 64283, Darmstadt", "Pädagogik", "Berufspädagogik"),
            new Building(S, "114", "Alexanderstraße 8, 64283, Darmstadt", "Papierfabrikation"),
            new Building(S, "115", "Alexanderstraße 10, 64283, Darmstadt", "Psychologie"),
            new Building(S, "117", "Magdalenenstraße 27, 64289, Darmstadt", "Sportwissenschaft (Hofreite Vorderhaus)"),
            new Building(S, "118", "Magdalenenstraße 27, 64289, Darmstadt", "Sportwissenschaft (Hofreite Hinterhaus)"),
            new Building(S, "120", "Magdalenenstraße 8, 64289, Darmstadt", "Universitäts- und Landesbibliothek", "ULB"),
            new Building(S, "121", "Magdalenenstraße 25, 64289, Darmstadt", "Kinderhaus II – Stadtmitte (im Bau)"),
            new Building(S, "122", "Alexanderstraße 2, 64283, Darmstadt", "Karl Plagge-Haus"),
            new Building(S, "160", "Magdalenenstraße 23, 64289, Darmstadt", "Verwaltung"),
            new Building(S, "201", "Hochschulstraße 12, 64289, Darmstadt", "Rau-Bau"),
            new Building(S, "202", "Hochschulstraße 10, 64289, Darmstadt", "Robert-Piloty-Gebäude"),
            new Building(S, "203", "Hochschulstraße 14, 64289, Darmstadt", "Studierendenhaus"),
            new Building(S, "204", "Hochschulstraße 8, 64289, Darmstadt", "Festkörperphysik"),
            new Building(S, "205", "Hochschulstraße 6A, 64289, Darmstadt", "Physik Werkstätten"),
            new Building(S, "206", "Hochschulstraße 6, 64289, Darmstadt", "Physik Hörsäle"),
            new Building(S, "207", "Hochschulstraße 6, 64289, Darmstadt", "Physik Institute"),
            new Building(S, "208", "Hochschulstraße 4, 64289, Darmstadt", "Physik Hörsaal Uhrturm"),
            new Building(S, "209", "Hochschulstraße 4A, 64289, Darmstadt", "Physik Lichttechnik"),
            new Building(S, "210", "Hochschulstraße 2, 64289, Darmstadt", "Institutsgebäude"),
            new Building(S, "211", "Schlossgartenstraße 2, 64289, Darmstadt", "Physik Institutsgebäude"),
            new Building(S, "212", "Schlossgartenstraße 4, 64289, Darmstadt", "Institutsgebäude"),
            new Building(S, "213", "Schlossgartenstraße 6,6A, 64289, Darmstadt", "Fraunhofer-Institut für Betriebsfestigkeit und Systemzuverlässigkeit LBF Bereich Kunststoffe"),
            new Building(S, "214", "Schlossgartenstraße 9, 64289, Darmstadt", "Kernphysik / S-DALINAC"),
            new Building(S, "215", "Schlossgartenstraße 7, 64289, Darmstadt", "Mathematik / Physik"),
            new Building(S, "217", "Schlossgartenstraße 8, 64289, Darmstadt", "Halbleitertechnik"),
            new Building(S, "305", "Fraunhoferstraße 5, 64283, Darmstadt", "Fraunhofer-Institut für Graphische Datenverarbeitung (IGD)"),
            new Building(S, "306", "Merckstraße 25, 64283, Darmstadt", "Hans-Busch-Institut", "EtIt"),
            new Building(S, "307", "Rundeturmstraße 1, 64283, Darmstadt", "Ernst-Neufert-Halle"),
            new Building(S, "308", "Landgraf-Georg-Straße 8, 64283, Darmstadt", "Hochspannungshalle"),
            new Building(S, "309", "Landgraf-Georg-Straße 6, 64283, Darmstadt", "EtIt Hallen mit Werkstätten"),
            new Building(S, "310", "Landgraf-Georg-Straße 4, 64283, Darmstadt", "EtIt Institute"),
            new Building(S, "311", "Landgraf-Georg-Straße 2, 64283, Darmstadt", "EtIt Hörsäle"),
            new Building(S, "312", "Marktplatz 15, 64283, Darmstadt", "Schloss Universitäts- und Landesbibliothek (ULB)"),
            new Building(S, "313", "Marktplatz 15, 64283, Darmstadt", "Schloss Kaisersaalbau, Institute"),
            new Building(S, "314", "Marktplatz 15, 64283, Darmstadt", "Schloss Kirchenbau", "Paukergang", "Torhalle"),
            new Building(S, "315", "Marktplatz 15, 64283, Darmstadt", "Schloss Glockenbau"),
            new Building(S, "316", "Marktplatz 15, 64283, Darmstadt", "Schloss Wallhaus"),
            new Building(S, "317", "Marktplatz, 64283, Darmstadt", "Schloss Brückenhaus"),
            new Building(S, "319", "Rundeturmstraße 12, 64283, Darmstadt", "Instituts- und Verwaltungsgebäude"),
            new Building(S, "320", "Rundeturmstraße 10, 64283, Darmstadt", "Instituts- und Verwaltungsgebäude"),
            new Building(S, "321", "Fraunhoferstraße 4, 64283, Darmstadt", "Verfügungsgebäude Elektrotechnik"),
            new Building(S, "401", "Karolinenplatz 3, 64289, Darmstadt", "Mollerbau (Haus der Geschichte / Staatsarchiv)"),
            new Building(S, "402", "Grafenstraße 2, 64283, Darmstadt", "Werkstoffkunde/ Staatliche Materialprüfungsanstalt (MPA)"),
            new Building(S, "407", "Poststraße 5, 64293, Darmstadt", "Studienkolleg für ausländische Studierende"),
            new Building(S, "410", "Dolivostraße 15, 64293, Darmstadt", "Institutsgebäude"),
            new Building(S, "413", "Bleichstraße 2, 64283, Darmstadt", "Institutsgebäude"),
            new Building(S, "414", "Mornewegstraße 26-32, 64293, Darmstadt", "FB Informatik / LOEWE-Schwerpunkt CASED"),
            new Building(S, "415", "Goethestraße 48,50, 64285, Darmstadt", "Institutsgebäude"),
            new Building(S, "417", "Holzstraße 2, 64283, Darmstadt", "Holzstraße 2"),
            new Building(S, "418", "Robert-Bosch-Straße 7 64293, Darmstadt", "TIZ", "Technologie- und Innovationszentrum Darmstadt Studienkolleg Informatik"),
            new Building(S, "420", "Holzhofallee 38, 64295, Darmstadt", "Institutsgebäude Holzhofallee"),
            new Building(S, "421", "Im Carree 3, 64283, Darmstadt", "Institutsgebäudeim Carree"),
            new Building(S, "422", "Landwehrstraße 48A-50, 64293, Darmstadt", "Institutsgebäude"),
            new Building(S, "423", "Landwehrstraße 50A, 64293, Darmstadt", "Institutsgebäude"),
            new Building(S, "424", "Landwehrstraße 54, 642893, Darmstadt", "Institutsgebäude"),
            new Building(S, "425", "Schleiermacherstraße 10,12, 64283, Darmstadt", "Verwaltungsgebäude"),
            new Building(S, "426", "Feldbergstraße 78, 64283, Darmstadt", "Verwaltungsgebäude"),
            new Building(S, "484", "Dieburger Straße 241, 64287, Darmstadt", "Georg-Christoph-Lichtenberg-Haus, Internationales Begegnungszentrum (IBZ)"),
            new Building(S, "485", "Dieburger Straße 241, 64287, Darmstadt", "Reithalle mit Stallungen")
    };
}