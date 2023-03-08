package com.somesh.coldstreamauth;

public class SensitechAuthResponse {
  @Override
  public String toString() {
    return "SensitechAuthResponse{" +
            "access_token='" + access_token + '\'' +
            ", token_type='" + token_type + '\'' +
            ", expires_in=" + expires_in +
            ", refresh_token='" + refresh_token + '\'' +
            ", error='" + error + '\'' +
            ", scope='" + scope + '\'' +
            '}';
  }

  private String access_token;
  private String token_type;
  private long expires_in;
  private String refresh_token;
  private String error;
  private String scope;

  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public String getAccess_token() {
    return access_token;
  }

  public void setAccess_token(String access_token) {
    this.access_token = access_token;
  }

  public String getToken_type() {
    return token_type;
  }

  public void setToken_type(String token_type) {
    this.token_type = token_type;
  }

  public long getExpires_in() {
    return expires_in;
  }

  public void setExpires_in(long expires_in) {
    this.expires_in = expires_in;
  }

  public String getRefresh_token() {
    return refresh_token;
  }

  public void setRefresh_token(String refresh_token) {
    this.refresh_token = refresh_token;
  }
}