package edu.aluismarte.diplomado.project.week11.response;

import edu.aluismarte.diplomado.project.week11.dto.EmployeeDTO;
import lombok.*;

/**
 * @author aluis on 6/26/2022.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreateEmployeeResponse {

    private EmployeeDTO employee;
}
