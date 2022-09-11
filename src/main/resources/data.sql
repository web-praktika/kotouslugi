-- service
INSERT INTO service
values (0,
        'При рождении трех и более котят вы можете получить субсидии в виде пачки корма.',
        'Регистрация рождения котят');
INSERT INTO service
values (1,
        'Подходи ответственно к здоровью питомца. Здоровый кот - мало хлопот.',
        'Запись на приём к ветеринару');
INSERT INTO service
values (5,
        'Зарегистрируй имущество и спи спокойно',
        'Оформление лотка в котореестр');
INSERT INTO service
values (6,
    'Официальное разрешение на один сильный Кусь',
    'Оформления лицензии на Кусь');
INSERT INTO service
values (7,
        'Разрешения для наглых котиков',
        'Разрешение на одну атаку с высоты');
INSERT INTO service
values (8,
        'Разрешения для очень наглых котиков',
        'Внезапная смена игры на охоту на человеков');

-- category
INSERT INTO category
values (0, 'Семья и дети');
INSERT INTO category
values (1, 'Медицина');
INSERT INTO category
values (2, 'Социальные услуги');
INSERT INTO category
values (3, 'Недвижимость');
INSERT INTO category
values (4, 'Разрешения');

-- service_to_category
INSERT INTO service_category
values (0, 0);
INSERT INTO service_category
values (1, 1);
INSERT INTO service_category
values (5, 3);
INSERT INTO service_category
values (6, 2);
INSERT INTO service_category
values (7, 4);
INSERT INTO service_category
values (8, 4);

-- person
INSERT into person
VALUES (1111,'2001-01-01','Жак','Фреско');
INSERT into person
VALUES (1112,'2001-01-02','Леопольд','Дружелюбов');
INSERT into person
VALUES (1113,'2001-01-03','Гарфилд','Лазаньо');
INSERT into person
VALUES (1114,'2001-01-04','Кузя','Шерстенович');
