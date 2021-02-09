package co.com.tallergrupo7.restclient.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Office {

    private String code;
    private String name;
}
