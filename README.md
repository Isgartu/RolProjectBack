# RolProjectBack

## Project based in Pathfinder Rol Game

Info: https://es.wikipedia.org/wiki/Pathfinder_(juego_de_rol)

Info: http://devir.es/producto/pathfinder-reglas-basicas/

## Setup the Application

1. Input data in data.sql / data-h2.sql

2. Type `mvn spring-boot:run` from the root directory of the project to run the application. Or automatic run with your favourite IDE

## Endpoints

### Players

localhost:8080/pathfinder/v1/players
Shows all global players information

localhost:8080/pathfinder/v1/players/1
Show details player information

localhost:8080/pathfinder/v1/players/search?charactername=charactername1
Search player information by charactername

localhost:8080/pathfinder/v1/players/search?gamername=gamername2
Search player information by gamername

