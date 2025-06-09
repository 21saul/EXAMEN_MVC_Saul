## Refactorización y Explicación

**Refactoricé mi pseudocódigo ya que al principio del examen no estaba al tanto de que se podía restar la gasolina sin límite**  
**(es decir, que no había que manejar ningún tipo de excepción).**

---

## Implementación de las nuevas funcionalidades: `Avanzar()` y `EcharGasolina()`
```bash
1. Declaré las variables `gasolina` y `distancia` en la clase `Coche`.


2. Declaré las opciones de las nuevas funcionalidades en el menú de la `View`.


3. Añadí las funciones necesarias en la `View` y el `Controller`:
    - `pedirGasolina()` y `pedirMatricula()` son llamadas por `echarGasolina()` en el `Controller`.  
      Recogen los litros introducidos por el usuario en la vista y muestran un mensaje indicando que se ha aumentado la gasolina.
    - `pedirDistancia()` en la vista permite introducir los metros a recorrer, y se enlaza con la función `avanzar()` del `Controller`.


4. Creé la función `avanzar()` en `Coche.java` que recoge la variable `metros` y devuelve un booleano (`true`)
   Esta función actualiza tanto la distancia recorrida como el valor de la gasolina al avanzar.  
   Se utilizará posteriormente en el `Model` para completar la funcionalidad de avanzar.
   
   
5. Finalmente, se enlazan el `Controller` y el `Model`:
    - Las funciones `avanzar()` y `echarGasolina()` del modelo modifican directamente las variables internas del objeto `Coche`.
    - Esto se hace utilizando la lógica interna del propio `Coche.java`, accediendo al coche específico mediante el método `getCoche()`.
```
---
