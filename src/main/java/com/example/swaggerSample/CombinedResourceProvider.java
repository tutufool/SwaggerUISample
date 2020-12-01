package com.example.swaggerSample;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

@Component
@Primary
public class CombinedResourceProvider implements SwaggerResourcesProvider {

	public List<SwaggerResource> get() {

		SwaggerResource jerseySwaggerResource = new SwaggerResource();
		jerseySwaggerResource.setLocation("/test/swagger.json");
		jerseySwaggerResource.setSwaggerVersion("2.0");
		jerseySwaggerResource.setName("test");

		return Arrays.asList(jerseySwaggerResource);

	}

}
