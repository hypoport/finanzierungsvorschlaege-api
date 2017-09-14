/*
 * Ergebnislisten API
 * Ein Service um eine Ergebnisliste mit Finanzierungsvorschlägen zu ermitteln.
 *
 * OpenAPI spec version: 1.0
 * Contact: helpdesk@europace2.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package de.europace.eli.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VertriebsOrganisation
 */

public class VertriebsOrganisation {
  @JsonProperty("firmenName")
  private String firmenName = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("organisationsName")
  private String organisationsName = null;

  @JsonProperty("organisationsNameFuerProvisionsClearing")
  private String organisationsNameFuerProvisionsClearing = null;

  @JsonProperty("partner")
  private String partner = null;

  @JsonProperty("vertriebsOrganisationsId")
  private String vertriebsOrganisationsId = null;

  public VertriebsOrganisation firmenName(String firmenName) {
    this.firmenName = firmenName;
    return this;
  }

   /**
   * Get firmenName
   * @return firmenName
  **/
  @ApiModelProperty(value = "")
  public String getFirmenName() {
    return firmenName;
  }

  public void setFirmenName(String firmenName) {
    this.firmenName = firmenName;
  }

  public VertriebsOrganisation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VertriebsOrganisation organisationsName(String organisationsName) {
    this.organisationsName = organisationsName;
    return this;
  }

   /**
   * Get organisationsName
   * @return organisationsName
  **/
  @ApiModelProperty(value = "")
  public String getOrganisationsName() {
    return organisationsName;
  }

  public void setOrganisationsName(String organisationsName) {
    this.organisationsName = organisationsName;
  }

  public VertriebsOrganisation organisationsNameFuerProvisionsClearing(String organisationsNameFuerProvisionsClearing) {
    this.organisationsNameFuerProvisionsClearing = organisationsNameFuerProvisionsClearing;
    return this;
  }

   /**
   * Get organisationsNameFuerProvisionsClearing
   * @return organisationsNameFuerProvisionsClearing
  **/
  @ApiModelProperty(value = "")
  public String getOrganisationsNameFuerProvisionsClearing() {
    return organisationsNameFuerProvisionsClearing;
  }

  public void setOrganisationsNameFuerProvisionsClearing(String organisationsNameFuerProvisionsClearing) {
    this.organisationsNameFuerProvisionsClearing = organisationsNameFuerProvisionsClearing;
  }

  public VertriebsOrganisation partner(String partner) {
    this.partner = partner;
    return this;
  }

   /**
   * Get partner
   * @return partner
  **/
  @ApiModelProperty(value = "")
  public String getPartner() {
    return partner;
  }

  public void setPartner(String partner) {
    this.partner = partner;
  }

  public VertriebsOrganisation vertriebsOrganisationsId(String vertriebsOrganisationsId) {
    this.vertriebsOrganisationsId = vertriebsOrganisationsId;
    return this;
  }

   /**
   * Get vertriebsOrganisationsId
   * @return vertriebsOrganisationsId
  **/
  @ApiModelProperty(value = "")
  public String getVertriebsOrganisationsId() {
    return vertriebsOrganisationsId;
  }

  public void setVertriebsOrganisationsId(String vertriebsOrganisationsId) {
    this.vertriebsOrganisationsId = vertriebsOrganisationsId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VertriebsOrganisation vertriebsOrganisation = (VertriebsOrganisation) o;
    return Objects.equals(this.firmenName, vertriebsOrganisation.firmenName) &&
        Objects.equals(this.id, vertriebsOrganisation.id) &&
        Objects.equals(this.organisationsName, vertriebsOrganisation.organisationsName) &&
        Objects.equals(this.organisationsNameFuerProvisionsClearing, vertriebsOrganisation.organisationsNameFuerProvisionsClearing) &&
        Objects.equals(this.partner, vertriebsOrganisation.partner) &&
        Objects.equals(this.vertriebsOrganisationsId, vertriebsOrganisation.vertriebsOrganisationsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firmenName, id, organisationsName, organisationsNameFuerProvisionsClearing, partner, vertriebsOrganisationsId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VertriebsOrganisation {\n");
    
    sb.append("    firmenName: ").append(toIndentedString(firmenName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organisationsName: ").append(toIndentedString(organisationsName)).append("\n");
    sb.append("    organisationsNameFuerProvisionsClearing: ").append(toIndentedString(organisationsNameFuerProvisionsClearing)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
    sb.append("    vertriebsOrganisationsId: ").append(toIndentedString(vertriebsOrganisationsId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

