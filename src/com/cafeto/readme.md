# Mockito

## Intro

Para ejecutar pruebas unitarias se requiere tener la unidad que se desea probar en un ambiente completamente aislado de manera que posibles efector colaterales en unidades diferentes no afecten el comportamiento de la unidad que queremos probar.

[**Mockito**](http://mockito.org/ "Sitio oficial") es un framework que nos permite fácilmente simular el comportamiento de las unidades con las que interactúa la unidad que queremos probar de tal manera de lograr el aislamiento. Además de registrar[[1]](http://site.mockito.org/mockito/docs/current/org/mockito/Mockito.html#1 "Cita") y verificar las interacciones que tiene la unidad a probar con cada una de las unidades con las que tiene relación.

* Mockito nos permite enmascarar tanto clases concretas como interfaces. [[2]](http://site.mockito.org/mockito/docs/current/org/mockito/Mockito.html#stubbing "Cita")
* Simular los resultados devueltos por métodos invocados así estos estén o no implementados. [[3]](http://site.mockito.org/mockito/docs/current/org/mockito/Mockito.html#stubbing "cita")
* Verificar[[1]](http://site.mockito.org/mockito/docs/current/org/mockito/Mockito.html#1 "Cita") de manera individual cada una de las interacciones que tuvo la unidad con los objetos "envueltos" en el mock.
* Verificar la cantidad de invocaciones a un método, si fue invocado al menos una vez, si no fue invocado, etc. [[4]](http://site.mockito.org/mockito/docs/current/org/mockito/Mockito.html#exact_verification "Cita")
* Capturar los argumentos que se pasan como parámetros a los mocks u objetos reales que estén siendo espiados para luego hacer las verificaciones necesarias sobre estos. [[5]](http://site.mockito.org/mockito/docs/current/org/mockito/Mockito.html#captors "Cita")

## Cuando usar mocking?

Se debería usar mocking para los objetos con los que tiene relación la unidad que se quiere probar para evitar los efectos colaterales que se puedan producir por la ejecución de las clases relacionadas. Sin embargo objetos que solo almacenan datos o propios del API del lenguaje no son buenos candidatos para ser enmascarados.

###Nota

Es una buena práctica crear un constructor de la clase que reciba las dependencias que tiene, de esta manera se mejora la visibilidad y se facilita la configuración de las pruebas unitarias y el paso de los mocks en reemplazo de las dependencias.