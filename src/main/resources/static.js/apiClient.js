var apiClient =( function() {
	var equipoBackEnd = configuracion.getEquipoBackEnd();
	var version = configuracion.getVersion();
	
	return{
		login(name, psw){
			return $.ajax({
				url: equipoBackEnd+"/user/login",
				type: "POST",
				data: '{"name":"'+nombre+'" ,"psw":"'+password+'"}', 
				contentType: "application/json",
			});
		},
	};
	
	
})