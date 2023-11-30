CREATE DATABASE IF NOT EXISTS HumanFriends;
USE HumanFriends;

CREATE TABLE IF NOT EXISTS Pets (
    animal_id INT PRIMARY KEY,
    name VARCHAR(50),
    type VARCHAR(20) DEFAULT 'Pet',
    birth_date DATE,
    animal_command VARCHAR(200)
);

CREATE TABLE IF NOT EXISTS PackAnimals (
    animal_id INT PRIMARY KEY,
    name VARCHAR(50),
    type VARCHAR(20) DEFAULT 'Pack Animal',
    birth_date DATE,
    animal_command VARCHAR(200)
);

INSERT INTO Pets VALUES
 (1, 'Fido', 'Dog', '2020-01-01', 'Sit, Stay, Fetch'),
(2, 'Whiskers', 'Cat', '2019-05-15', 'Sit, Pounce'),
(3, 'Hammy', 'Hamster', '2021-03-10', 'Roll, Hide'),
(4, 'Buddy', 'Dog', '2018-12-10', 'Sit, Paw, Bark'),
(5, 'Smudge', 'Cat', '2020-02-20', 'Sit, Pounce, Scratch'),
(6, 'Peanut', 'Hamster', '2021-08-01', 'Roll, Spin'),
(7, 'Bella', 'Dog', '2019-11-11', 'Sit, Stay, Roll'),
(8, 'Oliver', 'Cat', '2020-06-30', 'Meow, Scratch, Jump');


INSERT INTO PackAnimals VALUES 
 (1, 'Thunder', 'Horse', '2015-07-21', 'Trot, Canter, Gallop'),
(2, 'Sandy', 'Camel', '2016-11-03', 'Walk, Carry Load'),
(3, 'Eeyore', 'Donkey', '2017-09-18', 'Walk, Carry Load, Bray'),
(4, 'Storm', 'Horse', '2014-05-05', 'Trot, Canter'),
(5, 'Dune', 'Camel', '2018-12-12', 'Walk, Sit'),
(6, 'Burro', 'Donkey', '2019-01-23', 'Walk, Bray, Kick'),
(7, 'Blaze', 'Horse', '2016-02-29', 'Trot, Jump, Gallop'),
(8, 'Sahara', 'Camel', '2015-08-14', 'Walk, Run');

DELETE FROM PackAnimals WHERE type = 'Camel';

CREATE TABLE IF NOT EXISTS HorsesAndDonkeys AS
SELECT * FROM PackAnimals WHERE type IN ('Horse', 'Donkey');

CREATE TABLE IF NOT EXISTS YoungAnimals AS
SELECT * FROM Pets WHERE TIMESTAMPDIFF(YEAR, birth_date, CURDATE()) BETWEEN 1 AND 3
UNION
SELECT * FROM HorsesAndDonkeys WHERE TIMESTAMPDIFF(YEAR, birth_date, CURDATE()) BETWEEN 1 AND 3;

CREATE TABLE IF NOT EXISTS AllAnimals AS
SELECT 'Pets' AS source, * FROM Pets
UNION
SELECT 'HorsesAndDonkeys' AS source, * FROM HorsesAndDonkeys
UNION
SELECT 'YoungAnimals' AS source, * FROM YoungAnimals;

