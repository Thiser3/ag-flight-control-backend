CREATE TABLE flights (
  FlightID INTEGER NOT NULL AUTO_INCREMENT,
  Starting_AirportID INTEGER NOT NULL,
  Destiny_AirportID INTEGER NOT NULL,
  AircraftID INTEGER NOT NULL,
  PRIMARY KEY (FlightID)
  CONSTRAINT FK_Starting_AirportID FOREIGN KEY (Starting_AirportID) REFERENCES airports(AirportID),
  CONSTRAINT FK_Destiny_AirportID FOREIGN KEY (Destiny_AirportID) REFERENCES airports(AirportID),
  CONSTRAINT FK_AircraftID FOREIGN KEY (AircraftID) REFERENCES aircraft(AircraftID)
  );