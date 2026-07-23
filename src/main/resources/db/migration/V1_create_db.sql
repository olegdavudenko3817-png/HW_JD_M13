CREATE TABLE Client
(
    id   BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(200) NOT NULL CHECK (LENGTH(name) >= 3)
);

CREATE TABLE Planet
(
    id   VARCHAR(100) PRIMARY KEY,
    name VARCHAR(500) NOT NULL CHECK (lENGTH(name) >= 1)
);

CREATE TABLE Ticket
(
    id             BIGINT AUTO_INCREMENT PRIMARY KEY,
    created_at     TIMESTAMP WITH TIME ZONE NOT NULL,
    client_id      BIGINT      NOT NULL,
    from_planet_id VARCHAR(100) NOT NULL,
    to_planet_id   VARCHAR(100) NOT NULL,

    FOREIGN KEY (client_id) REFERENCES Client (id),
    FOREIGN KEY (from_planet_id) REFERENCES Planet (id),
    FOREIGN KEY (to_planet_id) REFERENCES Planet (id)
);