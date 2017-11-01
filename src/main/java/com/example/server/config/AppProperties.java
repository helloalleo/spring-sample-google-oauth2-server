/**
 * @author Balaji
 * <p>
 * 26-Oct-2017 - Balaji creation AppProperties.java
 */
package com.example.server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Balaji
 *
 */
@Component
public class AppProperties {
  @Value("${CLIENT_URL}")
  private String clientUrl;
  @Value("${HEADERS}")
  private String corsHeaders;
  @Value("${METHODS}")
  private String corsMethods;

  public String getClientUrl() {
    return clientUrl;
  }

  public void setClientUrl(String clientUrl) {
    this.clientUrl = clientUrl;
  }

  public String getCorsHeaders() {
    return corsHeaders;
  }

  public void setCorsHeaders(String corsHeaders) {
    this.corsHeaders = corsHeaders;
  }

  public String getCorsMethods() {
    return corsMethods;
  }

  public void setCorsMethods(String corsMethods) {
    this.corsMethods = corsMethods;
  }
}