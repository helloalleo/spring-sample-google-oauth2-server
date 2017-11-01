/**
 * @author Balaji
 *
 *         26-Oct-2017 - Balaji creation CorsFilterAdapter.java
 */
package com.example.server.config;

import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author Balaji
 *
 */
public class CorsFilterAdapter {
	private final String clientUrl;
	  private final String[] headers;
	  private final String[] methods;

	  public CorsFilterAdapter(String clientUrl, String headers, String methods) {
	    this.clientUrl = clientUrl;
	    this.headers = headers.split(",");
	    this.methods = methods.split(",");
	  }

	  public CorsFilter corsFilter(boolean allowCredentials) {
	    CorsConfiguration config = new CorsConfiguration();
	    config.setAllowCredentials(false);
      config.addAllowedOrigin(clientUrl);
	    for (String header: headers) {
	      config.addAllowedHeader(header);
	    }
	    for (String method : methods) {
	      config.addAllowedMethod(method);
	    }
	    config.setAllowCredentials(allowCredentials);
	    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	    source.registerCorsConfiguration("/**", config);
	    return new CorsFilter(source);
	  }
}
