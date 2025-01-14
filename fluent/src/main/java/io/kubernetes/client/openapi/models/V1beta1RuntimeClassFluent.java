package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta1RuntimeClassFluent<A extends io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public java.lang.Boolean hasApiVersion();
  
  /**
   * Method is deprecated. use withApiVersion instead.
   */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String arg0);
  public java.lang.String getHandler();
  public A withHandler(java.lang.String handler);
  public java.lang.Boolean hasHandler();
  
  /**
   * Method is deprecated. use withHandler instead.
   */
  @java.lang.Deprecated
  public A withNewHandler(java.lang.String arg0);
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  
  /**
   * Method is deprecated. use withKind instead.
   */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String arg0);
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();
  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();
  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);
  public java.lang.Boolean hasMetadata();
  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildOverhead instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1Overhead getOverhead();
  public io.kubernetes.client.openapi.models.V1beta1Overhead buildOverhead();
  public A withOverhead(io.kubernetes.client.openapi.models.V1beta1Overhead overhead);
  public java.lang.Boolean hasOverhead();
  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.OverheadNested<A> withNewOverhead();
  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.OverheadNested<A> withNewOverheadLike(io.kubernetes.client.openapi.models.V1beta1Overhead item);
  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.OverheadNested<A> editOverhead();
  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.OverheadNested<A> editOrNewOverhead();
  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.OverheadNested<A> editOrNewOverheadLike(io.kubernetes.client.openapi.models.V1beta1Overhead item);
  
  /**
   * This method has been deprecated, please use method buildScheduling instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1Scheduling getScheduling();
  public io.kubernetes.client.openapi.models.V1beta1Scheduling buildScheduling();
  public A withScheduling(io.kubernetes.client.openapi.models.V1beta1Scheduling scheduling);
  public java.lang.Boolean hasScheduling();
  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.SchedulingNested<A> withNewScheduling();
  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.SchedulingNested<A> withNewSchedulingLike(io.kubernetes.client.openapi.models.V1beta1Scheduling item);
  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.SchedulingNested<A> editScheduling();
  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.SchedulingNested<A> editOrNewScheduling();
  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.SchedulingNested<A> editOrNewSchedulingLike(io.kubernetes.client.openapi.models.V1beta1Scheduling item);
  public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface OverheadNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1OverheadFluent<io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.OverheadNested<N>>{
    public N and();
    public N endOverhead();
    
  }
  public interface SchedulingNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1SchedulingFluent<io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.SchedulingNested<N>>{
    public N and();
    public N endScheduling();
    
  }
  
}