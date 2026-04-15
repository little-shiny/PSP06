# 📘 Actividades 6.1 y 6.2 – Programación de Servicios y Procesos

## 🧩 Actividad 6.1

### 🎯 Objetivo

Desarrollar una aplicación en Java que:

* Solicite un nombre de usuario válido
* Solicite un nombre de fichero válido
* Muestre el contenido del fichero
* Implemente validación de datos
* Genere logs de la ejecución

---

### ⚙️ Funcionamiento de la aplicación

1. **Solicitud de nombre de usuario**

    * Se pide al usuario un nombre.
    * Restricciones:

        * Exactamente 8 caracteres
        * Solo letras minúsculas
    * Se valida mediante la clase `Validador`.

2. **Solicitud del fichero**

    * Se pide el nombre del fichero con extensión.
    * Restricciones:

        * Máximo 8 caracteres para el nombre
        * Extensión de 3 caracteres (ej: `.txt`)
    * También se valida con `Validador`.

3. **Lectura del fichero**

    * Se utiliza `BufferedReader` y `FileReader`.
    * Se muestra el contenido línea por línea.

---

### 📝 Sistema de logs

Se implementa usando:

* `Logger`
* `FileHandler`
* `SimpleFormatter`

Se registran eventos como:

* Solicitud de datos
* Validaciones correctas/incorrectas
* Errores al leer ficheros

El log se guarda en:

```
app.log
```

---

## 🧩 Actividad 6.2

### 🎯 Objetivo

Ampliar la aplicación anterior añadiendo:

* Restricción de acceso a un directorio específico
* Firma digital de la aplicación

---

### 🔒 Restricción de acceso a ficheros

Se ha limitado la lectura de archivos únicamente al directorio:

```
C:/datos
```

#### ✔️ Implementación

* Se comprueba que la ruta del fichero comienza por `C:/datos`
* Si no cumple, se deniega el acceso

#### 💡 Nota

Se ha añadido un comentario en el código simulando el uso de un sistema de permisos:

```java
// System.setSecurityManager(new SecurityManager());
```

Esto representa cómo se gestionaban permisos en versiones antiguas de Java.

---

### ✍️ Firma digital de la aplicación

Se ha firmado la aplicación para garantizar:

* Integridad del código
* Autenticidad del autor

#### ✔️ Pasos realizados

1. **Generación del certificado (keystore)**

```bash
keytool -genkeypair -alias miFirma -keyalg RSA -keystore miKeystore.jks
```

2. **Creación del archivo JAR**

```bash
jar cvf miApp.jar com/actividad_6_1/*.class
```

3. **Firma del JAR**

```bash
jarsigner -keystore miKeystore.jks miApp.jar miFirma
```

4. **Verificación de la firma**

```bash
jarsigner -verify miApp.jar
```

---

## 🧠 Conclusiones

* Se ha trabajado la validación de datos de entrada en Java
* Se ha implementado un sistema de logging profesional
* Se ha controlado el acceso a recursos del sistema (ficheros)
* Se ha aprendido a firmar digitalmente una aplicación Java

---

## 📂 Estructura del proyecto

```
com.actividad_6_1
│
├── login.java
├── Validador.java
└── app.log
```

---

## ✅ Requisitos

* Java JDK instalado
* Consola/terminal para ejecutar comandos (`keytool`, `jarsigner`)

---
_[INFO] archivo README implementado con ayuda de la IA_

