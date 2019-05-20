-- service
INSERT INTO service
values (0,
        '"Подходи ответственно к регистрации потомства. При рождении треж и более котят вы можете получить субсидии в виде пачки корма."',
        '"Регистрация рождения котят"');
INSERT INTO service
values (1,
        '"Подходи ответственно к здоровью питомца. Здоровый кот - мало хлопот."',
        '"Запись в ветклинику');
INSERT INTO service
values (2,
        '"Корма и игрушки по спец цене. Все товары проверены и утверждены котокомиссией."',
        '"Доставка зоотоваров"');
INSERT INTO service
values (3,
        '"Уже забыли как выглядит чистый кот. Тогда мы идём к вам."',
        '"Помыть кота"');
INSERT INTO service
values (4,
        '"+"',
        '"Запись на приём к ветеринару"');
INSERT INTO service
values (5,
        '"..."',
        '"Социальная помощь котосемьям"');
INSERT INTO service
values (6,
        '"..."',
        '"Пенсионный котофонд"');
INSERT INTO service
values (7,
        '"Ну типа как с недвижимостью. Это будет электронная услуга с очередью выполнения."',
        '"Оформление лотка в котореестр"');


-- category
INSERT INTO category
values (0, '"Семья и дети"');
INSERT INTO category
values (1, '"Категория 1"');
INSERT INTO category
values (2, '"Категория 2"');

-- service_to_category
INSERT INTO service_category
values (0, 0);
INSERT INTO service_category
values (1, 0);
INSERT INTO service_category
values (2, 0);
INSERT INTO service_category
values (3, 1);
INSERT INTO service_category
values (4, 1);
INSERT INTO service_category
values (5, 1);
INSERT INTO service_category
values (6, 2);
INSERT INTO service_category
values (7, 2);