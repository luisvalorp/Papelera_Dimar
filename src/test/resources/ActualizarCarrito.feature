Feature: Papelera Dimar
  Esta prueba es para verificar la funcionalidad al actualizar el carrito de compra

  Scenario: Actualizar carrito de compra
	Given Al Abrir el navegador Chrome
	When Ingreso a dimar.meza.com
	Then Ingreso a Producto en el menú principal
	Then Agrego un producto al carrito presionando agregar a carrito
	Then Presiono el botón de Ver Carrito de la ventana emergente
	Then Presiono el sigo de + para añadir una cantidad más
	Then Presiono el botón de Actualizar Carrito
	Then Se ve un mensaje que dice: Carrito actualizado.