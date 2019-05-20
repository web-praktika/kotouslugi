-- service
INSERT INTO service
values (0,
        '"Подходи ответственно к регистрации потомства. При рождении треж и более котят вы можете получить субсидии в виде пачки корма."',
        '"Регистрация рождения котят"');
INSERT INTO service
values (1,
        '"Подходи ответственно к здоровью питомца. Здоровый кот - мало хлопот."',
        '"Запись на приём к ветеринару"');
INSERT INTO service
values (2,
        '"Уже забыли как выглядит чистый кот. Тогда мы идём к вам."',
        '"Помыть кота"');
INSERT INTO service
values (3,
        '"Оформи заявление на получение корбки уже сегодня "',
        '"Социальная помощь котосемьям"');
INSERT INTO service
values (4,
        '"..."',
        '"Пенсионный котофонд"');
INSERT INTO service
values (5,
        '"Ну типа как с недвижимостью. Это будет электронная услуга с очередью выполнения."',
        '"Оформление лотка в котореестр"');


-- category
INSERT INTO category
values (0, '"Семья и дети"');
INSERT INTO category
values (1, '"Медицина"');
INSERT INTO category
values (2, '"Социалка"');
INSERT INTO category
values (3, '"Котостроительство"');

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