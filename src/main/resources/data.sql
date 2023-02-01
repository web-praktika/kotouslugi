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
        'Не смотри под хвост  - смотри на ГИБДД пост',
        'Оформление котоправ');


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
values (4, 'Движимость');

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
values (6, 4);


-- предзаполденение отделов ГИБДД
INSERT INTO otdels_gibdd
values (3603, 'ул.Ленина, 36', 'Воронеж');
INSERT INTO otdels_gibdd
values (3601, 'ул.Шишкова, 54', 'Воронеж');
INSERT INTO otdels_gibdd
values (1505, 'ул.Пушкина, 15', 'Москва');
INSERT INTO otdels_gibdd
values (1782, 'ул.Победы, 124', 'Санкт-Петербург');
INSERT INTO otdels_gibdd
values (1784, 'ул.Ленина, 31', 'Санкт-Петербург');
INSERT INTO otdels_gibdd
values (1506, 'ул.9 января, 190', 'Москва');