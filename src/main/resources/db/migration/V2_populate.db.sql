INSERT INTO CLIENT (NAME)
VALUES ('Oliver'),
       ('James'),
       ('Amelia'),
       ('Emma'),
       ('Lucas'),
       ('Mia'),
       ('Mateo'),
       ('Oleh'),
       ('Anna'),
       ('Isabella');

INSERT INTO PLANET (ID, NAME)
VALUES ('VEN283', 'Venus'),
       ('NEPT12', 'Neptune'),
       ('SAT23', 'Saturn'),
       ('JUPT89', 'Jupiter'),
       ('URAN77', 'Uranus');

INSERT INTO TICKET (CREATED_AT, CLIENT_ID, FROM_PLANET_ID, TO_PLANET_ID)
VALUES (TIMESTAMP '2021-02-02 12:00:00', 1, 'SAT23', 'URAN77'),
       (TIMESTAMP '2009-03-11 12:00:00', 1, 'VEN283', 'NEPT12'),
       (TIMESTAMP '2001-11-03 12:00:00', 2, 'URAN77', 'VEN283'),
       (TIMESTAMP '2000-05-02 12:00:00', 3, 'NEPT12', 'JUPT89'),
       (TIMESTAMP '2022-12-12 12:00:00', 4, 'VEN283', 'SAT23'),
       (TIMESTAMP '2025-04-09 12:00:00', 5, 'NEPT12', 'JUPT89'),
       (TIMESTAMP '2024-01-03 12:00:00', 6, 'URAN77', 'NEPT12'),
       (TIMESTAMP '2026-12-06 12:00:00', 7, 'JUPT89', 'VEN283'),
       (TIMESTAMP '2015-11-08 12:00:00', 8, 'URAN77', 'VEN283'),
       (TIMESTAMP '2018-05-06 12:00:00', 9, 'JUPT89', 'URAN77'),
       (TIMESTAMP '2017-03-04 12:00:00', 10, 'SAT23', 'URAN77');

