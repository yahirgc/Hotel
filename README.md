En un hotel de renombre se requiere automatizar:
Procesos de renta de cuartos.
Control de personas que ingresan y salen en determinados tiempos.
Disponibilidad de habitaciones.

El sistema ingresará los datos de una persona que es el titular de la renta del cuarto, para lo cual deberá
capturar los datos mas elementales como son nombre, apellido paterno, apellido materno, dirección de
residencia (calle, numero, numero interior, colonia, código postal), curp, clave de elector, entre otros datos
principales que puedan ayudar a su correcta identificación.
Cada una de estas personas estará asociada a un room (cuarto), pero además de eso, se deberá contar
con el registro de cuantos días quiere quedarse, el numero de personas que lo acompañan, las edades de
las personas, parentescos entre ellos, y datos básicos que ayuden a identificar a las personas
acompañantes.
En caso de que las personas que lo acompañen se queden los mismos días que el titular del cuarto,
deberá ser especificado, de lo contrario deberán indicar por cuantos días se quedan los acompañantes,
esto con fines legales y de investigación en caso de un acontecimiento legal.
Una vez que el usuario abandone el hotel, se deberá eliminar el registro de los datos del titular y con ello a
su vez se deberán eliminar los datos de las personas que lo acompañaban.
El sistema también deberá permitir hacer modificaciones a los usuarios del hotel, esto en caso de que
existan errores de captura de datos o en caso de que el usuario(s) decidan ampliar o reducir su estancia en
el hotel.
Se podrán hacer consultas de los huéspedes que se encuentran activos en el sistema al momento de la
búsqueda, estas búsquedas podrán ser de forma individual o del total de titulares que ocupan un
determinado espacio dentro del hotel, otra consulta puede ser de los acompañantes de los titulares de los
cuartos de hotel (realice las búsquedas por nombre, id, curp o como considere más eficiente).
Se deberá agregar cualquier otra funcionalidad que no se especifique explícitamente en el documento pero
que implícitamente se requiera para el buen funcionamiento del sistema.
Por último, al concluir la estancia del usuario se revisará si no tiene cargos extras por daños al hotel (daños
en camas, televisiones, regaderas, lámparas, etc.), el sistema deberá mostrar tanto para el usuario como

Proyecto final de programación III - Java

para el cliente el monto total a pagar, desglosando los conceptos más importantes para su correcta
comprensión.
Algunos de los datos más importantes para el manejo del sistema son los siguientes:
num_cuarto, nombre, apellido_pat, apellido_mat, calle, numero, num_int, cp, fecha_ingreso, fecha_salida,
hora_ingreso, hora_salida, monto_por_dia, total_pagar, número_acomp, etc.
Consideraciones:
 Para realizar este proyecto considere los siguientes temas de programación en Java.
 Herencia, abstracción, encapsulamiento, modularidad y polimorfismo
 Uso de funciones, clases abstractas, clases concretas, clases finales e interfaces.
 Métodos sobrecargados, constructores, getters and setters
 Considere el uso de polimorfismo (@Override) en algunas secciones del proyecto.
 Manejo de archivos en java.
 Manejo de interfaces de usuario (GUI) de forma amigable.
 Paso de parámetros y retorno de valores en funciones
 Entre otros temas vistos en clase y los que se necesiten investigar para realizar un buen proyecto.

Proyecto final de programación III - Java
