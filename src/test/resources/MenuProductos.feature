Feature: Papelera Dimar
  Estas pruebas muestran diferentes escenarios en el mismo menú donde se verificará la funcionalidad al presionar
  el tipo de producto y se realiza la busqueda correctamente

  Scenario: Visualizar todos los productos al ingresar en "Productos" en el menú principal
	Given Inicio el navegador Chrome
	When Entro al sitio dimar.meza.com
	Then Selecciono en el menú principal Productos
	And Visualizo todos los productos

  Scenario: Visualizar todas las bolsas al presionar "Bolsas"
	Given Inicio el navegador Chrome
	When Entro al sitio dimar.meza.com
	Then Selecciono en el menú principal Productos
	And Visualizo todas las bolsas

  Scenario: Visualizar todas las cajas de pizzas al presionar "Cajas Pizzas"
	Given Inicio el navegador Chrome
	When Entro al sitio dimar.meza.com
	Then Selecciono en el menú principal Productos
	And Visualizo todas las cajas de pizzas

  Scenario: Visualizar todas las cajas estandar al presionar "Cajas Estandar"
	Given Inicio el navegador Chrome
	When Entro al sitio dimar.meza.com
	Then Selecciono en el menú principal Productos
	And Visualizo todas las cajas estandar

  Scenario: Visualizar todas las cajas de aletas cortas al presionar "Aletas Cortas"
	Given Inicio el navegador Chrome
	When Entro al sitio dimar.meza.com
	Then Selecciono en el menú principal Productos
	And Visualizo todas las cajas aletas cortas

  Scenario: Visualizar todas las cajas de aletas largas al presionar "Cajas Aletas Largas"
	Given Inicio el navegador Chrome
	When Entro al sitio dimar.meza.com
	Then Selecciono en el menú principal Productos
	And Visualizo todas las cajas aletas largas

  Scenario: Visualizar todas las cajas para botellas al presionar "Cajas para botellas"
	Given Inicio el navegador Chrome
	When Entro al sitio dimar.meza.com
	Then Selecciono en el menú principal Productos
	And Visualizo todas las cajas para botellas

  Scenario: Visualizar todas las cajas de separadores clásicos al presionar "Separadores Clásicos"
	Given Inicio el navegador Chrome
	When Entro al sitio dimar.meza.com
	Then Selecciono en el menú principal Productos
	And Visualizo todas las cajas de separadores clásicos

  Scenario: Visualizar todas las cajas de separadores especiales al presionar "Separadores Especiales"
	Given Inicio el navegador Chrome
	When Entro al sitio dimar.meza.com
	Then Selecciono en el menú principal Productos
	And Visualizo todas las cajas de separadores especiales

  Scenario: Visualizar todas las cajas postales al presionar "Cajas Postales"
	Given Inicio el navegador Chrome
	When Entro al sitio dimar.meza.com
	Then Selecciono en el menú principal Productos
	And Visualizo todas las cajas postales

  Scenario: Visualizar todas las cajas sin aletas al presionar "Cajas Sin Aletas"
	Given Inicio el navegador Chrome
	When Entro al sitio dimar.meza.com
	Then Selecciono en el menú principal Productos
	And Visualizo todas las cajas sin aletas

  Scenario: Visualizar todas las cajas wrap al presionar "Cajas Wrap"
	Given Inicio el navegador Chrome
	When Entro al sitio dimar.meza.com
	Then Selecciono en el menú principal Productos
	And Visualizo todas las cajas wrap


