package com.portal.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude
public class CarPostDTO {

    private String model;

    private String brand;

    private String price;

    private String description;

    private String engineVersion;

    private String city;

    private String createdDate;

    private String ownerId;

    private String ownerName;

    private String ownerType;

    private String contact;

}
