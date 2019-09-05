Feature: Papelera Dimar
  Esta prueba es para verificar la funcionalidad al agregar un cupón vencido

  Scenario: Introducir un cupón vencido
	Given Abrí el navegador Chrome
	When Entro en la url: http://dimar.wmeza.com/
	Then En el menú principal Ingreso en la opción de productos
	And Selecciono un producto y presiono el botón Añadir Carrito
	And Aparece una ventana donde presiono Ver Carrito
	And Agrego el código del cupón vencido
	And Presiono el botón de Aplicar cupón vencido
	And Salir