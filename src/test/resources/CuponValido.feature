Feature: Papelera Dimar
  Esta prueba es para verificar la funcionalidad al agregar un cupón válido

  Scenario: Introducir un cupón válido
	Given Abrí el navegador Chrome
	When Entro en la url: http://dimar.wmeza.com/
	Then En el menú principal Ingreso en la opción de productos
	And Selecciono un producto y presiono el botón Añadir Carrito
	And Aparece una ventana donde presiono Ver Carrito
	And Agrego el código del cupón
	And Presiono el botón de Aplicar cupón donde agrega monto descuento y lo resta con el subtotal y actualiza el total
	And Salir