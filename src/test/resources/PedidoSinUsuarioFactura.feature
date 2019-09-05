Feature: Papelera Dimar
  Esta prueba es para verificar la funcionalidad de realizar un pedido sin y usuario creando uno y sea con factura.

  Scenario: Realizar un pedido sin usuario creando uno y tenga una factura
	Given Abrí el navegador Chrome
	When Ingreso a la URL: https://dimar.wmeza.com
	Then Ingreso en el menú principal en Productos
	And Selecciono un producto y presiono el botón Añadir Carrito
	And Presiono el botón de la ventana emergente de Ver Carrito
	And Presiono el botón de Finalizar Compra
	And Lleno el formulario del detalle de compra con factura y presiono Realizar Pedido