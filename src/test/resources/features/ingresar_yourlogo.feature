#Author: Johana Ospina
Feature: Ingresar a la url  y realizar un registro
    Como usuaria quiero ingresar a la url
    y registrarme para realizar compras


Scenario: Ingresar a la URL y registrarse en YourLogo
        Given que el actor ingrese a la url
        When crea una cuenta con los datos
        |Nombre  |Apellido  |Email                      |Contrasena|Empresa     |Domicilio         |Ciudad  |Estado  |Codigopostal|Pais          |TelefonodeCasa|TelefonoMovil  |Alias|
        |Johana|Ospina   |johanaospina@hotmail.com|Ospina0904|Bancolombia|Calle 84 num 59 50|Bogota|Colorado|88976       |United States|2993002       |3234483018     |johana@gmail.com|
        And busca un producto y lo agrega al carrito
        |Blouse|
        Then verifica que el precio sea el correcto
