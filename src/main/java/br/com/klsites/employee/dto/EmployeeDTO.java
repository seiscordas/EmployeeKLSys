package br.com.klsites.employee.dto;

import br.com.klsites.employee.entities.Employee;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
@Getter
@Setter
public class EmployeeDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    @NotBlank(message = "Required field")
    private String name;
    @Email(message = "Invalid email")
    private String email;
    @NotNull(message = "Required field")
    private Long departmentId;

    public EmployeeDTO() {
    }

    public EmployeeDTO(Long id, String name, String email, Long departmentId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.departmentId = departmentId;
    }
    public EmployeeDTO(Employee entity) {
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        departmentId = entity.getDepartment().getId();
    }
}
