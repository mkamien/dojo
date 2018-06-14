### Asignación de aulas
En la Universidad de la Matanza, se dispone de un lugar llamado CAU (Centro Atención Unificado), el cual se encarga de asignar aulas y laboratorios bajo solicitud de los docentes. Dada una solicitud, debe devolverse un aula y una etiqueta, que indique que aula fue asignada y permita pegarse en la puerta de la misma (Ej: "Aula: Lab B").

- Dado un conjunto de Aulas disponibles, se solicita una de ellas con capacidad para al menos 10 personas. 
Ej:  [{nombre:”Lab A”, capacidad:5},{nombre:”Lab B”, capacidad:15}]   -> "Aula: Lab B"

-  Dado el mismo listado, se solicita un aula para 30 personas. Se espera como respuesta: “No hay aula disponible”
Ej:  [{nombre:”Lab A”, capacidad:5},{nombre:”Lab B”, capacidad:15}]   -> “No hay aula disponible” 

- La gente de arquitectura necesita además de capacidad en el aula, que la misma cumpla con cierta cantidad de metros cuadrados para poder exponer sus maquetas.
Ej:  [{nombre:”Lab A”, capacidad:5, m2:’10},{nombre:”Lab B”, capacidad:15, m2:20}, {nombre:”Lab C”, capacidad:15, m2:50}]   -> capacidad 10, 30m2 -> "Aula: Lab C"

- Ciertas materias pueden solicitar que el aula que necesiten, disponga de cierta cantidad de computadoras. Dicha solicitud, al igual que los metros cuadrados son opcionales. 

Ej:  [{nombre:”Lab A”, capacidad:5, m2:’10},{nombre:”Lab B”, capacidad:15, m2:20}, {nombre:”Lab C”, capacidad:15, m2:50}{nombre:”Lab D”, capacidad:15, m2:50, posee computadoras}]   -> capacidad 10, 30m2 , y que posea computadoras-> "Aula: Lab D"

-  Dado el aumento de alumnos no videntes en la universidad, se desea que las etiquetas se impriman en braille.


### Metodología

Programación orientada a objetos + TDD

### Agenda

1. Planteo de problema (5 minutos)
2. Codificación (30 - 40 minutos)
3. Puesta en común (Hasta el final)

## Pasos para realizar el workshop 

1. Clonamos el repo:

    ```bash
        git clone https://github.com/diegosanchez/dojo.git
    ```

2. Descargamos el branch remote correspondiente al workshop:

    ```bash
        git checkout workshop
    ```

### Pasos específicos para javascript

1. Instalamos módulos

    ```bash
        npm install
    ```

2. Ejecutamos los tests

    ```bash
        npm run test
    ```
    
    o
    
    ```bash
        make
    ```

#### Qué necesito?

2. node 4.2.3
3. npm  2.14.7


### Pasos específicos para java

1. Ejecutamos los tests

    ```bash
        mvn test
        ( Estando en la carpeta que contiene el pom.xml )
    ```



#### Qué necesito?

1. Maven 3+ ( brew install maven )
2. JDK 1.7 u 1.8## Pasos para realizar el workshop


## Qué necesito?

1. Notebook para realizar workshop (si queres hacerlo, sino podes venir a compartir tus experiencias)
2. Ganas de compartir tu solución.
