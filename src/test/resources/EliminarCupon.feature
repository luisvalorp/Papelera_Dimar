Feature: Papelera Dimar
  Esta prueba es para verificar la funcionalidad de eliminar un cupon válido

  Scenario: Eliminar un cupón válido
	Given Iniciar el navegador chrome
	When Entre al sitio web dimar.wmaza.com
	Then Entro en la opción de Productos en el menú principal
	And Realizo click en Agregar Carrito
	And Presiono en la ventana emergente en Ver Carrito
	And Agrego cupón válido(no vencido y existente), presino Aplicar Cupón
	And Luego elimino el cupon y se verifica el mensaje correspondiente