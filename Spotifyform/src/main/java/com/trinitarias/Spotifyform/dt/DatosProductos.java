package com.trinitarias.Spotifyform.dt;

import java.util.List;

public class DatosProductos {
    // ===== 4. Producto principal seleccionado =====
    private String productoPrincipal; // Plan básico / pro / premium

    // ===== 5. Productos secundarios (múltiple selección) =====
    private List<String> productosSecundarios; // antirrobo, instalación, entrega, etc.
    

	public DatosProductos(String productoPrincipal, List<String> productosSecundarios) {
		super();
		this.productoPrincipal = productoPrincipal;
		this.productosSecundarios = productosSecundarios;
	}

	public String getProductoPrincipal() {
		return productoPrincipal;
	}

	public void setProductoPrincipal(String productoPrincipal) {
		this.productoPrincipal = productoPrincipal;
	}

	public List<String> getProductosSecundarios() {
		return productosSecundarios;
	}

	public void setProductosSecundarios(List<String> productosSecundarios) {
		this.productosSecundarios = productosSecundarios;
	}
}
