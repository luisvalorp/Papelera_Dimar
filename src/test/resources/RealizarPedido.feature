Feature: Papelera Dimar
  Esta prueba es para verificar el funcionamiento de realizar un pedido con usuario existente


  Scenario: Realizar un pedido con usuario existente
	Given Abrir Chrome
	When Ingreso a la dirección dimar.meza.com
	Then Selecciono Productos en el menú principal
	And Agrego un producto en el botón Agregar a Carrito
	And Realizo un click en Ver Carrito
	And Realizo click en el botón Finalizar Compra
	And Hago click en ¿Ya eres Cliente? y agrego las Credenciales
	And Presiono Acceder
	And Eligo la Región
	And Presiono el botón de Realizar Pedido y espero que se visualice la pantalla de pago