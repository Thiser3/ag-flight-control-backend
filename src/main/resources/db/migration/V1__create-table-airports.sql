CREATE TABLE "airports" (
  "airportID" INTEGER NOT NULL AUTO_INCREMENT,
  "name" VARCHAR(60) NOT NULL,
  "icao_code" VARCHAR(4) NOT NULL,
  "country" VARCHAR(3) NOT NULL,
  "region" VARCHAR(30) DEFAULT NULL,
  "city" VARCHAR(30) NOT NULL,
  "type" VARCHAR(6) NOT NULL,
  PRIMARY KEY ("airportID")
)