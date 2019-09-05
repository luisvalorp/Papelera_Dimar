Feature: Papelera Dimar
  Esta prueba es para verificar el funcionamiento de Realizar un pedido Sin Usuario

  Scenario: Realizar un pedido sin Usuario Existente
	Given Abro Chrome (Navegador)
	When Entro al website dimar.wmeza.com
	Then Selecciono en el menú principal Productos
	And Agrego al carrito en el botón correspondiete
	And Presiono en el botón de Ver Carrito
	And Presiono el botón de Finalizar Compra
	And Lleno el formulario del detalle de compra y presiono Realizar Pedido
	And Verifico que me envíe a la URL de la forma de pago
