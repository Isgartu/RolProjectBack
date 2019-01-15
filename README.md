# RolProjectBack

## Project based in Pathfinder Rol Game  

Info: https://es.wikipedia.org/wiki/Pathfinder_(juego_de_rol)  

Info: http://devir.es/producto/pathfinder-reglas-basicas/  


## Setup the Application  

1. Input data in data.sql / data-h2.sql  

2. Type `bin \ mysqld --console` in the directory where MariaDB is unzipped to start MariaDB  
Project zip file: src\main\resources\mariadb-10.3.12-winx64.zip  
Url: https://downloads.mariadb.org/  

3. Type `mvn spring-boot:run` from the root directory of the project to run the application. Or automatic run with your favourite IDE

4. Launch the Prometheus server by using the command `prometheus.exe --config.file=YAML_FILE_PATH`  
Project zip file: src\main\resources\prometheus-2.6.0.windows-amd64.zip  
Url: https://prometheus.io/download/  

5. Launch the Grafana server by executing `grafana-server.exe` from the bin directory  
Project zip file: src\main\resources\grafana-5.4.3.zip  
Url: https://grafana.com/grafana/download  

Tip: to visualize the database you can use HeidiSQL Portable
Project zip file: src\main\resources\HeidiSQL_9.5_64_Portable.zip  
Url: https://www.heidisql.com/download.php  


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

