Sistema de Pagos en Java – Refactorización
Descripción
Proyecto en Java que implementa un sistema de pagos aplicando Programación Orientada a Objetos.
El ejercicio consiste en refactorizar el sistema para centralizar la validación del monto y evitar duplicación de código.
________________________________________
Objetivo
•	Centralizar la validación del monto.
•	Utilizar una clase abstracta que implemente la interfaz de pago.
•	Evitar reimplementar el método pago(int monto) en las clases concretas.
•	Aplicar los principios DRY, SOLID y Clean Code.
________________________________________
Estructura del proyecto
pagos/
├── App.java
├── interfaces/Pago.java
└── model/
    ├── PagoAbstracto.java
    ├── Bitcoin.java
    ├── Paypal.java
    ├── TarjetaCredito.java
    ├── Producto.java
    └── CarroCompra.java
________________________________________
Diseño
•	Pago: interfaz que define el método pago(int monto).
•	PagoAbstracto: clase abstracta que valida el monto y controla el flujo del pago.
•	Bitcoin / Paypal / TarjetaCredito: implementan solo la lógica específica del pago.
•	CarroCompra: gestiona productos, calcula el total y ejecuta el pago usando polimorfismo.
•	App: clase principal con menú por consola para probar el sistema.
________________________________________
Principios aplicados
•	DRY
•	Single Responsibility
•	Open / Closed
•	Dependency Inversion
________________________________________
Ejecución
Ejecutar la clase App.java desde VS Code y utilizar el menú por consola.
________________________________________
Conclusión
El refactor mejora la estructura del sistema sin modificar su comportamiento, logrando un diseño más limpio, reutilizable y mantenible.

