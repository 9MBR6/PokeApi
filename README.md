# PokeApp - Mi Aprendizaje en Spring Boot y Consumo de APIs

## Descripción

**PokeApp** es un proyecto personal que he creado con el objetivo de aprender y profundizar en **Spring Boot** y en el consumo de APIs externas. Esta aplicación me está ayudando a entender mejor los conceptos fundamentales de Spring, así como a practicar la implementación de controladores REST y la gestión de datos. La aplicación consulta la [PokeAPI](https://pokeapi.co/), una API REST que proporciona información detallada sobre los Pokémon.

Este proyecto me está permitiendo aprender y mejorar mis habilidades en:

- Configuración de un proyecto Spring Boot desde cero.
- Consumo de APIs REST externas utilizando Spring.
- Manejo y transformación de datos obtenidos de una API.
- Implementación de controladores REST de manera efectiva.

## Funcionalidades

- Consultar información básica de un Pokémon por su nombre.
- Mostrar datos como el ID, nombre, orden, altura y peso del Pokémon.
- Responder a solicitudes HTTP GET con los datos formateados en JSON.

## Dependencias Utilizadas

Para desarrollar este proyecto, estoy utilizando las siguientes dependencias:

### 1. Spring Boot Starter Web
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.28</version>
    <scope>provided</scope>
</dependency>

<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <optional>true</optional>
</dependency>

## Instalación y Ejecución

1. **Clonar el repositorio:**

    ```bash
    git clone https://github.com/tuusuario/pokeapp.git
    cd pokeapp
    ```

2. **Compilar y empaquetar la aplicación:**

    ```bash
    mvn clean package
    ```

3. **Ejecutar la aplicación:**

    ```bash
    mvn spring-boot:run
    ```

4. **Acceder a la aplicación:**

   Una vez que la aplicación esté en ejecución, puedes acceder a ella a través de la siguiente URL en tu navegador:

    ```bash
    http://localhost:8080/pokemon/{nombre}
    ```

    **Ejemplo:**

    ```bash
    http://localhost:8080/pokemon/bagon
    ```

5. **Respuesta JSON:**

    La respuesta JSON para el Pokémon "bagon" será similar a:

    ```json
    {
        "id": 371,
        "name": "bagon",
        "order": 492,
        "height": 6,
        "weight": 421
    }
    ```