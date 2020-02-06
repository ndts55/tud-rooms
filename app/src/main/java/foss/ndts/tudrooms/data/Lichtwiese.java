package foss.ndts.tudrooms.data;


public class Lichtwiese implements UniLocation {
    private static final String DisplayName = "Lichtwiese";

    private static final String[] Buildings = {
            "L1|01",
            "L1|02",
            "L1|03",
            "L1|04",
            "L1|05",
            "L1|06",
            "L1|07",
            "L1|08",
            "L1|09",
            "L1|10",
            "L1|11",
            "L1|12",
            "L2|01",
            "L2|02",
            "L2|03",
            "L2|04",
            "L2|05",
            "L2|06",
            "L2|07",
            "L2|66",
            "L3|01",
            "L3|02",
            "L3|03",
            "L3|04",
            "L3|60",
            "L3|62",
            "L4|01",
            "L4|02",
            "L5|01",
            "L5|02",
            "L5|03",
            "L5|04",
            "L5|05",
            "L5|06",
            "L5|07",
            "L5|08",
            "L5|60"
    };

    private static final String[] Names = {
            "Maschinenbau Institute",
            "Maschinenbauhalle 1, U-Station Maschinenbau",
            "Maschinenbauhalle 5",
            "Maschinenbauhalle 4 (Prüfstand)",
            "Maschinenbauhalle 3",
            "Maschinenbauhalle 2",
            "Maschinenbauhalle 6",
            "Forschungsgebäude 1",
            "CO2-Versuchshalle",
            "Gerhard Pahl-Zentrum (Lehrzentrum Maschinenbau)",
            "Maschinenbauhalle 8 (ETA-Fabrik)",
            "Fahrzeughalle",
            "Materialwissenschaft",
            "Organische Chemie",
            "Chemiehörsaalgebäude",
            "Physikalische Chemie",
            "Anorganische Chemie",
            "Center of Smart Interfaces (CSI)",
            "M³ Laborgebäude",
            "Entsorgungszentrum",
            "Architektur",
            "Solar Decathlon 2007",
            "Solar Decathlon 2009",
            "Hörsaal temporär",
            "UniKITA, Krabbelgruppen",
            "Kinderhaus I-Lichtwiese",
            "Mensa Lichtwiese Lieferanschrift",
            "Hörsaal- und Medienzentrum (HMZ)",
            "Bauingenieurwesen Institutsgebäude 1",
            "Bauingenieurhalle 1",
            "Bauingenieurhalle 4",
            "Bauingenieurhalle 3",
            "Bauingenieurhalle 2",
            "Bauingenieurwesen Institutsgebäude 2",
            "Bauingenieurhalle 5",
            "Hochleistungsrechner",
            "Wertstoffzentrum"
    };

    private static final String[] Addresses = {
            "Otto-Berndt-Straße 2 64287, Darmstadt",
            "Jovanka-Bontschits-Straße 3 64287, Darmstadt",
            "Jovanka-Bontschits-Straße 9 64287, Darmstadt",
            "Jovanka-Bontschits-Straße 11 64287, Darmstadt",
            "Ottilie-Bock-Straße 6 64287, Darmstadt",
            "Ottilie-Bock-Straße 2 64287, Darmstadt",
            "Jovanka-Bontschits-Straße 10 64287, Darmstadt",
            "Otto-Berndt-Straße 3 64287, Darmstadt",
            "Ottilie-Bock-Straße 4 64287, Darmstadt",
            "Jovanka-Bontschits-Straße 7 64287, Darmstadt",
            "Eugen-Kogon-Straße 4 64287, Darmstadt",
            "Ottilie-Bock-Straße 2A 64287, Darmstadt",
            "Alarich-Weiss-Straße 2 64287, Darmstadt",
            "Alarich-Weiss-Straße 4 64287, Darmstadt",
            "Alarich-Weiss-Straße 6 64287, Darmstadt",
            "Alarich-Weiss-Straße 8 64287, Darmstadt",
            "Alarich-Weiss-Straße 12 64287, Darmstadt",
            "Alarich-Weiss-Straße 10 64287, Darmstadt",
            "Alarich-Weiss-Straße 16 64287, Darmstadt",
            "Alarich-Weiss-Straße 14 64287, Darmstadt",
            "El-Lissitzky-Straße 1 64287, Darmstadt",
            "El-Lissitzky-Straße 3 64287, Darmstadt",
            "El-Lissitzky-Straße 3A 64287, Darmstadt",
            "El-Lissitzky-Straße 64287, Darmstadt",
            "El-Lissitzky-Straße 5 64287, Darmstadt",
            "El-Lissitzky-Straße 7 64287, Darmstadt",
            "Alarich-Weiss-Straße 3 64287, Darmstadt",
            "Franziska-Braun-Straße 10 64287, Darmstadt",
            "Franziska-Braun-Straße 7 64287, Darmstadt",
            "Günter-Behnisch-Straße 14 64287, Darmstadt",
            "Günter-Behnisch-Straße 12 64287, Darmstadt",
            "Günter-Behnisch-Straße 10 64287, Darmstadt",
            "Günter-Behnisch-Straße 8 64287, Darmstadt",
            "Franziska-Braun-Straße 3 64287, Darmstadt",
            "Franziska-Braun-Straße 5 64287, Darmstadt",
            "Günter-Behnisch-Straße 4 64287, Darmstadt",
            "Günter-Behnisch-Straße 2 64287, Darmstadt"
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

// L – Standort Lichtwiese
// L1 – Abschnitt Lichtwiese Quartier Maschinenbau
// L1|01	Maschinenbau Institute	Otto-Berndt-Straße 2	64287	Darmstadt
// L1|02	Maschinenbauhalle 1, U-Station Maschinenbau	Jovanka-Bontschits-Straße 3	64287	Darmstadt
// L1|03	Maschinenbauhalle 5	Jovanka-Bontschits-Straße 9	64287	Darmstadt
// L1|04	Maschinenbauhalle 4 (Prüfstand)	Jovanka-Bontschits-Straße 11	64287	Darmstadt
// L1|05	Maschinenbauhalle 3	Ottilie-Bock-Straße 6	64287	Darmstadt
// L1|06	Maschinenbauhalle 2	Ottilie-Bock-Straße 2	64287	Darmstadt
// L1|07	Maschinenbauhalle 6	Jovanka-Bontschits-Straße 10	64287	Darmstadt
// L1|08	Forschungsgebäude 1	Otto-Berndt-Straße 3	64287	Darmstadt
// L1|09	CO2-Versuchshalle	Ottilie-Bock-Straße 4	64287	Darmstadt
// L1|10	Gerhard Pahl-Zentrum (Lehrzentrum Maschinenbau)	Jovanka-Bontschits-Straße 7	64287	Darmstadt
// L1|11	Maschinenbauhalle 8 (ETA-Fabrik)	Eugen-Kogon-Straße 4	64287	Darmstadt
// L1|12	Fahrzeughalle	Ottilie-Bock-Straße 2A	64287	Darmstadt
// L2 – Abschnitt Lichtwiese Quartier Chemie und Materialwissenschaften
// L2|01	Materialwissenschaft	Alarich-Weiss-Straße 2	64287	Darmstadt
// L2|02	Organische Chemie	Alarich-Weiss-Straße 4	64287	Darmstadt
// L2|03	Chemiehörsaalgebäude	Alarich-Weiss-Straße 6	64287	Darmstadt
// L2|04	Physikalische Chemie	Alarich-Weiss-Straße 8	64287	Darmstadt
// L2|05	Anorganische Chemie	Alarich-Weiss-Straße 12	64287	Darmstadt
// L2|06	Center of Smart Interfaces (CSI)	Alarich-Weiss-Straße 10	64287	Darmstadt
// L2|07	M³ Laborgebäude	Alarich-Weiss-Straße 16	64287	Darmstadt
// L2|66	Entsorgungszentrum	Alarich-Weiss-Straße 14	64287	Darmstadt
// L3 – Abschnitt Lichtwiese Quartier Architektur
// L3|01	Architektur	El-Lissitzky-Straße 1	64287	Darmstadt
// L3|02	Solar Decathlon 2007	El-Lissitzky-Straße 3	64287	Darmstadt
// L3|03    Solar Decathlon 2009	El-Lissitzky-Straße 3A	64287	Darmstadt
// L3|04	Hörsaal temporär	El-Lissitzky-Straße	64287	Darmstadt
// L3|60	UniKITA, Krabbelgruppen	El-Lissitzky-Straße 5	64287	Darmstadt
// L3|62	Kinderhaus I – Lichtwiese	El-Lissitzky-Straße 7	64287	Darmstadt
// L4 – Abschnitt Lichtwiese Quartier Forum und Mensa
// L4|01	Mensa Lichtwiese    Lieferanschrift	Alarich-Weiss-Straße 3  Franziska-Braun-Straße 9	64287	Darmstadt
// L4|02	Hörsaal- und Medienzentrum (HMZ)	Franziska-Braun-Straße 10	64287	Darmstadt
// L5 – Abschnitt Lichtwiese Quartier Bauingenieurwesen
// L5|01	Bauingenieurwesen   Institutsgebäude 1	Franziska-Braun-Straße 7	64287	Darmstadt
// L5|02	Bauingenieurhalle 1	Günter-Behnisch-Straße 14	64287	Darmstadt
// L5|03	Bauingenieurhalle 4	Günter-Behnisch-Straße 12	64287	Darmstadt
// L5|04	Bauingenieurhalle 3	Günter-Behnisch-Straße 10	64287	Darmstadt
// L5|05	Bauingenieurhalle 2	Günter-Behnisch-Straße 8	64287	Darmstadt
// L5|06	Bauingenieurwesen Institutsgebäude 2	Franziska-Braun-Straße 3	64287	Darmstadt
// L5|07	Bauingenieurhalle 5	Franziska-Braun-Straße 5	64287	Darmstadt
// L5|08	Hochleistungsrechner	Günter-Behnisch-Straße 4	64287	Darmstadt
// L5|60	Wertstoffzentrum	Günter-Behnisch-Straße 2	64287	Darmstadt