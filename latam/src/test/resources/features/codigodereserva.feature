#language: es
#author: Luis Angel Vanegas Martinez

Característica: como cliente requiero consultar el codigo de reserva para proceder con mi viaje

  @RunnerTags
  Escenario: consultar codigo de la reserva
    Dado que Luis ingresa al sitio de latam
    Cuando el ingresa a mis viajes y luego a ¿donde lo encuentras?
    Entonces Luis deberia ver un codigo de 6 digitos
