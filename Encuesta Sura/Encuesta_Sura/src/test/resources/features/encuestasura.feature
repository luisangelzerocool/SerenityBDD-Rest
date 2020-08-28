#language: es
#author: Luis Angel Vanegas Martinez

Característica: Como colaborador necesito reportar mi estado de salud para que mi empresa lleve un control

  @RunnerTags
  Escenario: reportar estado de salud en Sura
    Dado que Luis ingresa al sitio de encuesta de Sura
    Cuando el digita los datos de la encuesta solicitada
    |IDENTIFICACION|NOMBRE_COMPLETO            |
    |1040517302    |LUIS ANGEL VANEGAS MARTINEZ|
    Entonces Luis deberia ver la palabra
