CREATE TABLE "aircrafts" (
  "aircraftID" INTEGER NOT NULL,
  PRIMARY KEY ("aircraftID"),
  CONSTRAINT "FlightID" FOREIGN KEY ("aircraftID") REFERENCES "flights" ("FlightsID")