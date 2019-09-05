Feature: Papelera Dimar
  Se prueba la funcionalidad del inicio de sesión de un usuario válido

  Scenario: Inicio de sesión de usuario válido
	Given Abro el navegador Chrome
	When Ingreso a la URL: https://dimar.wmeza.com
	Then Carga el Home y presiono en la opción Acceder/Registrase
	And Carga una ventana donde se puede ingresar el Usuario o Correo y contraseña, las agrego
	And Luego presiono el botón Acceder
	And Se observa que inició sesión y se cierra el navegador