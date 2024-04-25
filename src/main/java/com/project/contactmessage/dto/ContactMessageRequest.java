package com.project.contactmessage.dto;

import com.project.payload.response.ResponseMessage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ContactMessageRequest {

    @NotNull(message = "Please enter name")
    @Size(min=3, max = 20, message = "Your email should be at least 3 characters")
    @Pattern(regexp = "\\A(?!\\s*\\Z).+", message = "Your message must consist of the character .")
    private String name;

    @NotNull(message = "Please enter your email")
    @Size(min=5, max = 30, message = "Your email should be at least 5 characters")
    @Email(message = "Please enter valid email")
    private String email;

    @NotNull(message = "Please enter subject")
    @Size(min=4, max = 20, message = "Your subject should be at least 4 chars")
    @Pattern(regexp = "\\A(?!\\s*\\Z).+", message = "Your message must consist of the character .")

    private String subject;

    @NotNull(message = "Please enter your message")
    @Size(min=4, max = 20, message = "Your message should be at least 4 chars")
    @Pattern(regexp = "\\A(?!\\s*\\Z).+", message = "Your message must consist of the character .")
    private String message;
}
