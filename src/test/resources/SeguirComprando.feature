Feature: Papelera Dimar
  Esta prueba es para verificar el funcionamiento de la opción Seguir Comprando

  Scenario: Función de seguir comprando
	Given Abro el navegador Chrome
	When Entro al sitio dimar.meza.com
	Then Ingreso en el menú principal en Productos
	And Selecciono un producto y presiono el botón Añadir Carrito
	And Presiono el botón de la ventana emergente de Ver Carrito
	And Presiono en el botón Seguir Comprando
	And Selecciono un producto diferente y presiono el botón Añadir Carrito
	And Presiono el botón de Ver Carrito de la ventana emergente
	And Verifico los elementos seleccionados y salgo
