package lnaix.estudos.secured_service.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("resource")
    public String getResource(@AuthenticationPrincipal Jwt jwt){
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("<p>JWT Token: %s</p>".formatted(jwt.getTokenValue()));
        strBuilder.append("<p>JWT Headers: %s</p>".formatted(jwt.getHeaders()));
        strBuilder.append("<p>JWT Claims: %s</p>".formatted(jwt.getClaims().toString()));
        strBuilder.append("<p>Resource accessed by: %s (with subject: %s)</p>".formatted(jwt.getClaim("preferred_username"),
                jwt.getSubject()));
        return strBuilder.toString();
    }

}
