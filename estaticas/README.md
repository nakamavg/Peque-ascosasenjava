# Variables y Métodos Estáticos en Java
Variables Estáticas:

Declaradas con la palabra clave static.
Pertenecen a la clase, no a instancias individuales.
Solo hay una copia en memoria, compartida por todas las instancias de la clase.
Ejemplo:
```java
class Mobile {
	static String name = "Smartphone";
}
``````
Métodos Estáticos:

Declarados con la palabra clave static.
Pueden ser llamados sin crear una instancia de la clase.
No pueden acceder a variables de instancia (no estáticas) directamente.
Ejemplo:

```java
class Mobile {
    static void show() {
        System.out.println("Name: " + name);
    }
}

```
```java

class Mobile {
	static String name = "Smartphone";
	String brand;
	int price;

	static void show() {
		System.out.println("Name: " + name);
	}
}

public class estaticas {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.brand = "Samsung";
		m1.price = 30000;

		Mobile m2 = new Mobile();
		m2.brand = "Apple";
		m2.price = 70000;

		Mobile.show();
	}
}
````
``
Resumen

- Variables estáticas: Compartidas por todas las instancias.
- Métodos estáticos: Pueden ser llamados sin instancias.