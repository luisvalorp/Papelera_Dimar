Feature: Papelera Dimar
  Esta prueba es para verificar el funcionamiento del la opción deshacer al momento de eliminar un producto en el
  carrito de compra.

  Scenario: Funcionamiendo de la opción deshacer al eliminar un producto del carrito de compra
	Given Inicio el navegador Chrome
	When Entro al sitio dimar.meza.com
	Then Ingreso en el menú principal en Productos
	And Agrego al carrito en el botón correspondiete
	And Presiono el botón de Ver Carrito de la ventana emergente
	And Al cargar la pantalla hago click en el Icono de X para eliminar
	And Presiono la opción deshacer
	And Verifico el producto que estaba anteriormente y salgo