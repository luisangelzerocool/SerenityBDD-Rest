#language: es
#author: Luis Angel Vanegas Martinez

Característica: creación de categoría y post
  Yo como usuario del sistema quiero crear una categoría para posteriormente
  hacer un nuevo post con la categoría adicionada anteriormente

  Antecedentes: crear categoria y post
    Dado que Luis ingresa su usuario admin@phptravels.com y contraseña demoadmin

  @RunnerTags
  Escenario: crear categoría
    Dado que Luis ingresa al menú Blog - Blog Categorias
    Cuando el digita los datos de la categoria
    |category_name|status|name_russian|name_farsi|name_german |name_french|name_turkish|name_arabic|name_spanish|name_vietnam|
    |pasión       |Enable|страсть     |شور       |Leidenschaft|la passion |tutku       |شغف        |pasión      |passsion    |
    Entonces debería ver la nueva categoria llamada pasión

  @RunnerTags
  Escenario: crear post
    Dado que Luis ingresa al menú Blog - Posts
    Cuando ingresa los datos del un nuevo post
    |status|category|post_title |permalink|body  |key_words|desciption |
    |Enable|pasión  |post pasión|.com     |texto1|pasiónKey|descripción|
    Entonces debería ver el nuevo post llamado post pasión
