# Second task
Имеется реляционная база данных (oracle, sql server, mysql,
postgresql, sqlite и т.д. - любая). Завести в БД таблицу данных о
студентах, которая будет содержать: имя, фамилия, отчество, дата
рождения, группа, уникальный номер.
Реализовать консольный или графический пользовательский интерфейс, с
помощью которого можно: добавить студента, удалить студента по
уникальному номеру, вывести список студентов.

Так как особого уточнения не было, сделал c помощью hibernate. Если нужно будет переделать с jdbc, дайте знать.

## Технологии
- JDK 11
    - Spring
      - Boot
      - JPA
      - Web
- FlyWay
- Maven
- PostgreSQL
- HTML/CSS
    - Thymeleaf


## Инструкция по запуску

Склонировать репозиторий:
```sh
git clone https://github.com/direlul/first-task.git
```
В postgres создать бд:
```sh
CREATE DATABASE students;
```
Запустить в idea или
Собрать проект:
```sh
mvn clean install
```

Запустить jar архив в target:
```sh
java -jar SecondTask-0.0.1-SNAPSHOT.jar
```

