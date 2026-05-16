package fitProject.ventas.bff_ventas.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fitProject.ventas.bff_ventas.dto.VentaDTO;

@FeignClient(name = "ms-ventas", url = "${MICROSERVICIO_VENTAS_URL:http://ms-ventas:8080}")
public interface VentasClient {

    @PostMapping("/api/sales")
    VentaDTO enviarCompraABackend(@RequestBody VentaDTO datosCompra);
}