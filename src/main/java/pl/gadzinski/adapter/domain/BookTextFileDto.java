package pl.gadzinski.adapter.domain;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class BookTextFileDto {

    private String name;
    private String author;
    private String ISBN;
    private String description;
    private Integer year;
    private Integer month;
    private Integer day;

}
