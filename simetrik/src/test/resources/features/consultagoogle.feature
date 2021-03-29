#language: es
#author: Luis Angel Vanegas Martinez

Característica: Consulta en Google

  @RunnerTags
  Escenario: consultar en google
    Dado que Luis ingresa al sitio de google
    Cuando el ingresa la palabra "Simetrik"
    Entonces Luis no deberia ver la frase "Simetrik | Collaborative and automatic reconciliator"