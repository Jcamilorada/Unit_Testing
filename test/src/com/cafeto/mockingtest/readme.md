#Ejemplo Mockito

En el ejemplo estamos usando un generador de reportes que puede guardar los reportes generados en varios formatos y para
 esto usa una clase que se encarga de codificar el reporte en los diferentes formatos y guardar los archivos.

¿Cuales son los efectos efectos colaterales que queremos evitar en las pruebas unitarias de la clase generadora de los reportes?

* La creación en el sistema de archivos de los documentos generados por los reportes.
* El método que se encarga de crear el archivo, llenarlo y cerrarlo, no está implementado.

En la [Clase de test](https://github.com/Jcamilorada/Unit_Testing/blob/master/src/test/java/mockingtest/ReportGeneratorTest.java) 
se encuentran los ejemplos del uso de mocktito para:

1. Podemos hacer mock a clases concretas y a interfaces igualmente. (*@mock*)

2. Se quiere probar que se llama al codificador correcto cuando se quiere generar un archivo en un formato determinado y
 no se llama a ningún otro codificador. (*verify*)

3. Podemos espiar en los llamados a los métodos. Es decir, hacemos mock parcial, el objeto es envuelto en el mock pero 
los métodos que vamos a espiar se llaman realmente. (*@spy*)

4. Podemos capturar los parámetros que se pasan a los métodos para hacer verificaciones sobre ellos. (**argument captors**)