package fr.univ.rouen.ollca.ollcargo.errandmanager.configurations;

import org.springframework.core.convert.converter.Converter;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Allows conversion and role extraction from JWT token
 */

public class CustomJwtAuthenticationConverter implements Converter<Jwt, AbstractAuthenticationToken>
{
    private static Collection<? extends GrantedAuthority> extractResourceRoles(final Jwt jwt)
    {
        Map<String, Object> resourceAccess = jwt.getClaim("resource_access");
        Map<String, Object> ollcargoAccess = (Map<String, Object>) resourceAccess.get("Ollcargo");
        Collection<String> roles = (Collection<String>) ollcargoAccess.get("roles");
        if (resourceAccess != null && ollcargoAccess != null && roles != null)
            return roles.stream()
                    .map(x -> new SimpleGrantedAuthority("ROLE_" + x))
                    .collect(Collectors.toSet());
        return Collections.emptySet();
    }

    private final JwtGrantedAuthoritiesConverter defaultGrantedAuthoritiesConverter = new JwtGrantedAuthoritiesConverter();

    public CustomJwtAuthenticationConverter() {}

    @Override
    public AbstractAuthenticationToken convert(final Jwt source)
    {
        Collection<GrantedAuthority> authorities = Stream.concat(defaultGrantedAuthoritiesConverter.convert(source)
                                .stream(),
                        extractResourceRoles(source).stream())
                .collect(Collectors.toSet());
        return new JwtAuthenticationToken(source, authorities);
    }
}