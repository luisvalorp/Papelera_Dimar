Feature: Papelera Dimar
  Esta prueba es para verificar el comportamiento del cambio de direccion en el carrito de compra.

  Scenario: Cambiar dirección en el carrito de compra
	Given Abro el Chrome como navegador
	When Entro a dimar.meza.com
	Then Realizo click en el menú principal en la opción Productos
	And Agrego un producto al carrito de compra
	And Presiono Ver Carrito
	And Presiono cambiar dirección
	And Eligo otra dirección distinta a (Metropolitana de Santiago) en la selección desplegable
	And Presiono actualizar
	And Se visualiza la pantalla correspondiente
