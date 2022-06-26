package edu.aluismarte.diplomado.project.week11.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.aluismarte.diplomado.model.project.EmployeeStateJson;
import edu.aluismarte.diplomado.model.project.EmployeeStateJson2;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author aluis on 6/26/2022.
 */
class EmployeeDTOTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private static final String RAW_JSON = "{\"id\":1,\"name\":\"Lala\",\"state1\":\"3\",\"state2\":0}";

    private final EmployeeDTO employeeDTOBase = EmployeeDTO.builder()
            .id(1L)
            .name("Lala")
            .state1(EmployeeStateJson.OUT)
            .state2(EmployeeStateJson2.ACTIVE)
            .build();

    @Test
    void serializeTest() throws JsonProcessingException {
        String jsonValue = objectMapper.writeValueAsString(employeeDTOBase);
        assertEquals(RAW_JSON, jsonValue);
    }

    @Test
    void deserializeTest() throws IOException {
        EmployeeDTO employeeDTO = objectMapper.readValue(RAW_JSON, EmployeeDTO.class);
        assertEquals(employeeDTOBase.getId(), employeeDTO.getId());
        assertEquals(employeeDTOBase.getName(), employeeDTO.getName());
        assertEquals(employeeDTOBase.getState1(), employeeDTO.getState1());
        assertEquals(employeeDTOBase.getState2(), employeeDTO.getState2());
    }
}