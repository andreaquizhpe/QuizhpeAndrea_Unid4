# Sistema de Gestión de Contenidos Audiovisuales

## Descripción

Este proyecto fue desarrollado para la asignatura de Programación Orientada a Objetos de la Universidad Politécnica Salesiana.

El sistema permite gestionar diferentes tipos de contenidos audiovisuales, incluyendo películas, series de televisión, documentales y podcasts. Durante su desarrollo se aplicaron conceptos de Programación Orientada a Objetos, persistencia de datos mediante archivos CSV, patrón MVC, principios SOLID y pruebas unitarias con JUnit 5.

---

## Cambios Realizados

### Etapa 1: Manejo de Archivos

Se implementó la persistencia de datos utilizando archivos CSV.

Funcionalidades incorporadas:

* Lectura de películas desde archivos CSV.
* Lectura de series de televisión desde archivos CSV.
* Lectura de documentales desde archivos CSV.
* Lectura de podcasts desde archivos CSV.
* Lectura de actores, investigadores y temporadas.
* Escritura de datos en archivos CSV.
* Creación automática de la carpeta `Archivos`.

Archivos utilizados:

* peliculas.csv
* series.csv
* documentales.csv
* podcast.csv
* actores.csv
* investigadores.csv
* temporadas.csv

---

### Etapa 2: Refactorización y Código Limpio

Mejoras realizadas:

* Reorganización del proyecto utilizando el patrón MVC.
* Nombres descriptivos para clases, métodos y variables.
* Eliminación de código duplicado.
* Creación de métodos reutilizables.
* Mejora de la legibilidad del código.
* Simplificación de comentarios redundantes.

---

### Etapa 3: Aplicación de Principios SOLID

Principios aplicados:

#### Single Responsibility Principle (SRP)

Cada clase posee una responsabilidad específica.

Ejemplos:

* ArchivoManager administra archivos.
* ViewMenu administra la interacción con el usuario.
* Los controladores gestionan la lógica del sistema.

#### Open/Closed Principle (OCP)

La clase abstracta `ContenidoAudiovisual` permite extender el sistema mediante nuevas subclases sin modificar el código existente.

#### Liskov Substitution Principle (LSP)

Las clases:

* Pelicula
* SerieDeTV
* Documental
* Podcast

pueden utilizarse como objetos de tipo `ContenidoAudiovisual`.

#### Interface Segregation Principle (ISP)

Se implementaron interfaces específicas para las operaciones de persistencia.

#### Dependency Inversion Principle (DIP)

Los controladores dependen de abstracciones mediante interfaces en lugar de implementaciones concretas.

---

### Etapa 4: Documentación

Se actualizó:

* Diagrama de clases UML.
* Comentarios relevantes del código.
* Documentación del proyecto.

---

### Etapa 5: Pruebas Unitarias

Se implementaron pruebas utilizando JUnit 5.

Clases probadas:

* Pelicula
* SerieDeTV
* Documental
* Podcast
* Actor
* Investigador
* Temporada
* ExceptionContenido
* ControllerPelicula

Se verificaron:

* Casos normales.
* Casos límite.
* Manejo de excepciones.

---

## Estructura del Proyecto

src/

├── Model/

│ ├── ContenidoAudiovisual

│ ├── Pelicula

│ ├── SerieDeTV

│ ├── Documental

│ ├── Podcast

│ ├── Actor

│ ├── Investigador

│ └── Temporada

│

├── Controller/

│ ├── ControllerPelicula

│ ├── ControllerSerie

│ ├── ControllerDocumental

│ └── ControllerPodcast

│

├── View/

│ └── ViewMenu

│

├── util/

│ └── ArchivoManager

│

├── Exception/

│ └── ExceptionContenido

│

└── Principal/

└── PruebaAudioVisual

test/

├── PeliculaTest

├── SerieDeTVTest

├── DocumentalTest

├── PodcastTest

├── ActorTest

├── InvestigadorTest

├── TemporadaTest

├── ExceptionContenidoTest

└── ControllerPeliculaTest

---

## Cómo Clonar el Proyecto

```bash
git clone https://github.com/andreaquizhpe/QuizhpeAndrea_Unid4.git
```

Ingresar al proyecto:

```bash
cd QuizhpeAndrea_Unid4
```

---

## Cómo Ejecutar el Proyecto

1. Abrir el proyecto en Eclipse.
2. Actualizar dependencias si es necesario.
3. Ejecutar la clase:

```text
Principal.PruebaAudioVisual
```

4. Utilizar el menú de consola para gestionar los contenidos audiovisuales.

---

## Cómo Ejecutar las Pruebas

1. Abrir la carpeta `test`.
2. Seleccionar la clase de prueba deseada.
3. Clic derecho.
4. Ejecutar como:

```text
Run As → JUnit Test
```

También es posible ejecutar todas las pruebas de forma conjunta desde la carpeta `test`.

---

## Tecnologías Utilizadas

* Java
* Eclipse IDE
* JUnit 5
* Git
* GitHub

---

## Autora

Andrea Quizhpe

Universidad Politécnica Salesiana

Programación Orientada a Objetos
