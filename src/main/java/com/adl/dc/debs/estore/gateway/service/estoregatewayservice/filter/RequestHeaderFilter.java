package com.adl.dc.debs.estore.gateway.service.estoregatewayservice.filter;


import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

/**
 * @author: Irshad Hameed
 * Filter class to pass required custom header to services
 */

@Component
public class RequestHeaderFilter extends AbstractGatewayFilterFactory<RequestHeaderFilter.Config> {

    public RequestHeaderFilter() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            ServerHttpRequest req = exchange.getRequest();
            return chain.filter(exchange.mutate().request(req).build());
        };
    }

    public static class Config {
        /**/
    }
}

