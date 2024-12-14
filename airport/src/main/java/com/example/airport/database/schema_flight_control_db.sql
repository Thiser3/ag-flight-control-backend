-- Criando a tabela `airports`
DROP TABLE IF EXISTS airports;

CREATE TABLE airports (
                          AirportID SERIAL PRIMARY KEY,
                          Name VARCHAR(60) NOT NULL,
                          ICAO_Code VARCHAR(4) NOT NULL,
                          Country VARCHAR(3) NOT NULL,
                          Region VARCHAR(30),
                          City VARCHAR(30) NOT NULL,
                          Type VARCHAR(6) NOT NULL
);

-- Criando a tabela `enterprises`
DROP TABLE IF EXISTS enterprises;

CREATE TABLE enterprises (
                             enterpriseID SERIAL PRIMARY KEY,
                             name VARCHAR(45) NOT NULL
);

-- Inserindo dados na tabela `enterprises`
INSERT INTO
    enterprises (enterpriseID, name)
VALUES (1, 'teste'),
       (2, 'teste2'),
       (3, 'name');

-- Criando a tabela `models`
DROP TABLE IF EXISTS models;

CREATE TABLE models (
                        modelID INT PRIMARY KEY,
                        name VARCHAR(45) NOT NULL,
                        seats INT NOT NULL
);

-- Criando a tabela `flights` (sem a restrição de chave estrangeira por enquanto)
DROP TABLE IF EXISTS flights;

CREATE TABLE flights (
                         FlightsID SERIAL PRIMARY KEY,
                         Starting_AirportID INT NOT NULL,
                         Destiny_AirportID INT NOT NULL,
                         AircraftID INT NOT NULL
);

-- Criando a tabela `aircrafts` (sem a restrição de chave estrangeira por enquanto)
DROP TABLE IF EXISTS aircrafts;

CREATE TABLE aircrafts (aircraftID INT PRIMARY KEY);

-- Adicionando restrições de chave estrangeira (após as tabelas e dados serem criados)
ALTER TABLE aircrafts
    ADD CONSTRAINT FlightID FOREIGN KEY (aircraftID) REFERENCES flights (FlightsID);