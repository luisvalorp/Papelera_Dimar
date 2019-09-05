Feature: Papelera Dimar
  Esta prueba es para verificar la funcionalidad de eliminar un producto del carrito de compras

  Scenario: Eliminar un producto del carrito de compras
	Given Inicio el navegador Chrome
	When Entro al sitio dimar.meza.com
	Then Entro en el menú principal en la opción de Productos
	Then Luego realizo click en el botón de Agregar a Carrito
	Then En la ventana emergente presiono el botón de Ver Carrito
	And Al cargar la pantalla hago click en el Icono de X para eliminar
	And Verfico el mensaje correspondiente con la opción de ¿Deshacer?.