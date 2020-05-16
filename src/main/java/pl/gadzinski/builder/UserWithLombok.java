package pl.gadzinski.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserWithLombok {

        private Long id;
        private String firstName;
        private String lastName;
        private Integer age;
        private String phoneNumber;


    }


