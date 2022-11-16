package com.acme.urproviderwebservices.users.store.resource;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UpdateStoreResource {
    private Long id;

    @NotNull
    @NotBlank
    @Size(max = 60)
    private String name;

    @NotNull
    @NotBlank
    private String email;

    @Size(max = 200)
    private Long phoneNumber;
    @Size(max = 20)
    private String password;
    @NotNull
    @NotBlank
    private String image;
    @NotNull
    @NotBlank
    @Size(max = 20)
    private String address;
}
