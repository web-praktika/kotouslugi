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
values (2,
        'Уже забыли как выглядит чистый кот. Тогда мы идём к вам.',
        'Помыть кота');
INSERT INTO service
values (3,
        'Оформи заявление на получение корбки уже сегодня',
        'Социальная помощь котосемьям');
INSERT INTO service
values (4,
        'То лапы ломит, то хвост отваливается? Пора на заслуженный отдых',
        'Пенсионный котофонд');
INSERT INTO service
values (5,
        'Зарегистрируй имущество и спи спокойно',
        'Оформление лотка в котореестр');
INSERT INTO service
values (6,
        'Зарегистрируйся и зарегестрируй своего котика',
        'Регистрация');
INSERT INTO service
values (7,
        'Добавь котика если ещё не сделал этого',
        'Регистрация котика');
INSERT INTO service
values (8,
        'Надоел котик? Тогда сдай его другому владельцу',
        'Миграция котов');


-- category
INSERT INTO category
values (0, 'Семья и дети');
INSERT INTO category
values (1, 'Медицина');
INSERT INTO category
values (2, 'Социальные услуги');
INSERT INTO category
values (3, 'Недвижимость');

-- service_to_category
INSERT INTO service_category
values (0, 0);
INSERT INTO service_category
values (1, 1);
INSERT INTO service_category
values (2, 1);
INSERT INTO service_category
values (3, 2);
INSERT INTO service_category
values (4, 2);
INSERT INTO service_category
values (5, 3);
INSERT INTO service_category
values (6, 2);
INSERT INTO service_category
values (7, 2);
INSERT INTO service_category
values (8, 2);

-- breed
INSERT INTO BREEDS
values(1, 'Шотландская вислоухая');
INSERT INTO BREEDS
values(2, 'Бенгальская кошка');
INSERT INTO BREEDS
values(3, 'Сиамская кошка');
INSERT INTO BREEDS
values(4, 'Абиссинская кошка');
INSERT INTO BREEDS
values(5, 'Русская голубая');
INSERT INTO BREEDS
values(6, 'Сибирская кошка');
INSERT INTO BREEDS
values(7, 'Невская маскарадная');
INSERT INTO BREEDS
values(8, 'Персидская кошка');
INSERT INTO BREEDS
values(9, 'Турецкая ангора');
INSERT INTO BREEDS
values(10, 'Бирманская кошка');
INSERT INTO BREEDS
values(11, 'Бурмилла');

-- cities
INSERT INTO CITIES
values(1, 'Воронеж');
INSERT INTO CITIES
values(2, 'Москва');
INSERT INTO CITIES
values(3, 'Курск');
INSERT INTO CITIES
values(4, 'Белгород');
