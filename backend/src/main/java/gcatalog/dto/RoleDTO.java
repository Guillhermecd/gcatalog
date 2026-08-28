package gcatalog.dto;

import java.util.HashSet;
import java.util.Set;

import gcatalog.entity.Role;

public class RoleDTO {
    private Long id;
    private String authority;

    private Set<UserDTO> users = new HashSet<>();

    public RoleDTO(Role role) {
    }

    public RoleDTO(Long id, String authority) {
        super();
        this.id = id;
        this.authority = authority;
    }

    public RoleDTO(Role entity, Set<UserDTO> users) {
        this.id = entity.getId();
        this.authority = entity.getAuthority();
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Set<UserDTO> getUsers() {
        return users;
    }

    public void setUsers(Set<UserDTO> users) {
        this.users = users;
    }
}
