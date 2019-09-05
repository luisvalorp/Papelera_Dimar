Feature: Papelera Dimar
  Esta prueba es para verificar la funcionalidad al momento de finalizar la compra

  Scenario: Finalizar compra con éxito
	Given Abrir el browser Chrome
	When Abro la url dimar.meza.com
	Then Ingreso en el menú principal en Productos
	And Luego presiono el botón de Agregar Carrito
	And Presiono el botón de la ventana emergente de Ver Carrito
	And Luego presiono el Botón Finalizar Compra y debe cargar la pantalla del Detalle.