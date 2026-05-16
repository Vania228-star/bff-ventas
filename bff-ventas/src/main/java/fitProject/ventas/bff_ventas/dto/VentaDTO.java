package fitProject.ventas.bff_ventas.dto;

import lombok.Data;

@Data
public class VentaDTO {
    private String userId;
    private String projectId;
    private Double amount;
    private String status;
}
