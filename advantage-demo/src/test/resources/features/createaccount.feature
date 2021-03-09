#language: es
#Author: Luis Angel Vanegas

Característica: Como usuario requiero registrarme en el sitio de AdvantageDemo

  @RunnerTags
  Escenario: crear cuenta
    Dado que luis quiere registrarse en el sitio
    Cuando luis ingresa sus datos personales
    |username|email                  |password    |confirmpassword    |firstname|lastname|phonenumber|country |city    |address      |state    |postalcode|
    |xlavm   |angelvamart@hotmail.com|Luis12345   |Luis12345          |luis     |vanegas |3137695177 |Colombia|Medellin|calle 1 #57-3|Antioquia|50001     |
    Entonces luis debe ver su nombre de usuario xlavm
