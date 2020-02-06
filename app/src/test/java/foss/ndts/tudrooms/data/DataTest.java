package foss.ndts.tudrooms.data;

import org.junit.jupiter.api.Test;

class DataTest {
    @Test
    void DataIsValid() {
        UniLocation[] uniLocations = {
                new Stadtmitte(), new BotanischerGarten(), new Lichtwiese(), new Hochschulstadion(), new Windkanal()
        };

        for (UniLocation uniLocation : uniLocations) {
            assert uniLocation.buildings().length == uniLocation.names().length && uniLocation.names().length == uniLocation.addresses().length;
        }
    }
}