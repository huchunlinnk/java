package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1TCPSocketActionFluentImpl<A extends io.kubernetes.client.openapi.models.V1TCPSocketActionFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1TCPSocketActionFluent<A>{
  public V1TCPSocketActionFluentImpl() {
  }
  public V1TCPSocketActionFluentImpl(io.kubernetes.client.openapi.models.V1TCPSocketAction instance) {
    this.withHost(instance.getHost());

    this.withPort(instance.getPort());

  }
  private java.lang.String host;
  private io.kubernetes.client.custom.IntOrString port;
  public java.lang.String getHost() {
    return this.host;
  }
  public A withHost(java.lang.String host) {
    this.host=host; return (A) this;
  }
  public java.lang.Boolean hasHost() {
    return this.host != null;
  }
  
  /**
   * Method is deprecated. use withHost instead.
   */
  @java.lang.Deprecated
  public A withNewHost(java.lang.String arg0) {
    return (A)withHost(new String(arg0));
  }
  public io.kubernetes.client.custom.IntOrString getPort() {
    return this.port;
  }
  public A withPort(io.kubernetes.client.custom.IntOrString port) {
    this.port=port; return (A) this;
  }
  public java.lang.Boolean hasPort() {
    return this.port != null;
  }
  public A withNewPort(int value) {
    return (A)withPort(new IntOrString(value));
  }
  public A withNewPort(java.lang.String value) {
    return (A)withPort(new IntOrString(value));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1TCPSocketActionFluentImpl that = (V1TCPSocketActionFluentImpl) o;
    if (host != null ? !host.equals(that.host) :that.host != null) return false;
    if (port != null ? !port.equals(that.port) :that.port != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(host,  port,  super.hashCode());
  }
  
}