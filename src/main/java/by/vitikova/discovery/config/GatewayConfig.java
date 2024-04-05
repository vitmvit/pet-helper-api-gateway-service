package by.vitikova.discovery.config;

import by.vitikova.discovery.UserDto;
import by.vitikova.discovery.auth.JwtDto;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.codec.ServerCodecConfigurer;

/**
 * Конфигурация шлюза (Gateway) для маршрутизации запросов.
 */
@Configuration
public class GatewayConfig {

    /**
     * Создает RouteLocator для конфигурации маршрутов шлюза.
     *
     * @param builder объект RouteLocatorBuilder для создания маршрутов
     * @return объект RouteLocator с настроенными маршрутами
     */
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()

                // auth-service
                .route("pet-helper-auth-service", r -> r.path("/api/v1/auth/signUp")
                        .and().method("POST")
                        .and().readBody(JwtDto.class, s -> true)
                        .uri("http://localhost:8082"))
                .route("pet-helper-auth-service", r -> r.path("/api/v1/auth/signIn")
                        .and().method("POST")
                        .and().readBody(JwtDto.class, s -> true)
                        .uri("http://localhost:8082"))
                .route("pet-helper-auth-service", r -> r.path("/api/v1/auth/check")
                        .and().method("POST")
                        .uri("http://localhost:8082"))

                // user-service
                .route("pet-helper-user-service", r -> r.path("/api/v1/users/**")
                        .and().method("GET")
                        .uri("http://localhost:8081"))
                .route("pet-helper-user-service", r -> r.path("/api/v1/users/password/**")
                        .and().method("PUT")
                        .uri("http://localhost:8081"))

                // admin-service
                .route("pet-helper-admin-service", r -> r.path("/api/v1/admin")
                        .and().method("POST")
                        .and().readBody(UserDto.class, s -> true)
                        .uri("http://localhost:8083"))
                .route("pet-helper-admin-service", r -> r.path("/api/v1/admin")
                        .and().method("PUT")
                        .uri("http://localhost:8083"))
                .route("pet-helper-admin-service", r -> r.path("/api/v1/admin")
                        .and().method("PATCH")
                        .uri("http://localhost:8083"))
                .route("pet-helper-admin-service", r -> r.path("/api/v1/admin/**")
                        .and().method("GET")
                        .uri("http://localhost:8083"))
                .route("pet-helper-admin-service", r -> r.path("/api/v1/admin")
                        .and().method("GET")
                        .uri("http://localhost:8083"))
                .route("pet-helper-admin-service", r -> r.path("/api/v1/admin/**")
                        .and().method("DELETE")
                        .uri("http://localhost:8083"))
                .route("pet-helper-admin-service", r -> r.path("/api/v1/admin")
                        .and().method("DELETE")
                        .uri("http://localhost:8083"))

                // message-service
                .route("pet-helper-message-service", r -> r.path("/api/v1/chats")
                        .and().method("GET")
                        .uri("http://localhost:8084"))
                .route("pet-helper-message-service", r -> r.path("/api/v1/chats/**")
                        .and().method("GET")
                        .uri("http://localhost:8084"))
                .route("pet-helper-message-service", r -> r.path("/api/v1/chats")
                        .and().method("POST")
                        .uri("http://localhost:8084"))
                .route("pet-helper-message-service", r -> r.path("/api/v1/chats/**")
                        .and().method("POST")
                        .uri("http://localhost:8084"))
                .route("pet-helper-message-service", r -> r.path("/api/v1/chats/**")
                        .and().method("PUT")
                        .uri("http://localhost:8084"))
                .route("pet-helper-message-service", r -> r.path("/api/v1/chats/**")
                        .and().method("DELETE")
                        .uri("http://localhost:8084"))
                .build();
    }

    /**
     * Создает ServerCodecConfigurer для настройки кодеков.
     *
     * @return объект ServerCodecConfigurer
     */
    @Bean
    public ServerCodecConfigurer serverCodecConfigurer() {
        return ServerCodecConfigurer.create();
    }
}