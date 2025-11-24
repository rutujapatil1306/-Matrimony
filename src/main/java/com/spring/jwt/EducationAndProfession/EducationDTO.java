package com.spring.jwt.EducationAndProfession;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EducationDTO {

    private Integer educationAndProfessionalDetailsId;

    @NotNull(message = "Education field cannot be empty")
    @Size(max = 45, message = "Education cannot exceed 45 characters")
    private String education;

    @NotNull(message = "Degree field cannot be empty")
    @Size(max = 45, message = "Degree cannot exceed 45 characters")
    private String degree;

    @NotNull(message = "Occupation field cannot be empty")
    @Size(max = 45, message = "Occupation cannot exceed 45 characters")
    private String occupation;

    @NotNull(message = "Occupation details cannot be empty")
    @Size(max = 45, message = "Occupation details cannot exceed 45 characters")
    private String occupationDetails;

    @NotNull(message = "Income per year cannot be empty")
    @Positive(message = "Income per year must be a positive number")
    private Integer incomePerYear;

    @Size(max = 45, message = "CompleteProfile cannot exceed 45 characters")
    private String status;

    @Size(max = 45, message = "Additional details cannot exceed 45 characters")
    private String educationAndProfessionalDetailsCol;

    private Integer userId;
}
