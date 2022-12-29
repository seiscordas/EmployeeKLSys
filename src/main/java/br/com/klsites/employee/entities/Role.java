package br.com.klsites.employee.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "tb_role")
@Data
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authority;

    public Role() {
    }

    public Role(Long id, String authority) {
        this.id = id;
        this.authority = authority;
    }
}
