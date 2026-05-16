package fitProject.ventas.bff_ventas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fitProject.ventas.bff_ventas.client.VentasClient;
import fitProject.ventas.bff_ventas.dto.VentaDTO;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/bff/sales")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class BffVentaController {

    private final VentasClient ventasClient;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VentaDTO desviarAlMicroservicio(@RequestBody VentaDTO datosCompra) {
        return ventasClient.enviarCompraABackend(datosCompra);
    }
}
