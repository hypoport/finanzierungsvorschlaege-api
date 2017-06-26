/*
 * Ergebnislisten API
 * Ein Service um eine Ergebnisliste mit Finanzierungsvorschlägen zu ermitteln.
 *
 * OpenAPI spec version: 0.1
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
import de.europace.eli.model.AnnuitaetenOderForwardDarlehensWunsch;
import de.europace.eli.model.KfwDarlehensWunsch;
import de.europace.eli.model.PrivatDarlehensWunsch;
import de.europace.eli.model.VariablesDarlehensWunsch;
import de.europace.eli.model.ZwischenFinanzierungsWunsch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DarlehensWunsch
 */

public class DarlehensWunsch {
  @JsonProperty("annuitaetenOderForwardDarlehen")
  private AnnuitaetenOderForwardDarlehensWunsch annuitaetenOderForwardDarlehen = null;

  /**
   * Gets or Sets darlehensWunschArt
   */
  public enum DarlehensWunschArtEnum {
    ANNUITAETEN_ODER_FORWARD_DARLEHENS_WUNSCH("ANNUITAETEN_ODER_FORWARD_DARLEHENS_WUNSCH"),
    
    KFW_DARLEHENS_WUNSCH("KFW_DARLEHENS_WUNSCH"),
    
    PRIVAT_DARLEHENS_WUNSCH("PRIVAT_DARLEHENS_WUNSCH"),
    
    ZWISCHEN_FINANZIERUNGS_WUNSCH("ZWISCHEN_FINANZIERUNGS_WUNSCH"),
    
    VARIABLES_DARLEHENS_WUNSCH("VARIABLES_DARLEHENS_WUNSCH");

    private String value;

    DarlehensWunschArtEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DarlehensWunschArtEnum fromValue(String text) {
      for (DarlehensWunschArtEnum b : DarlehensWunschArtEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("darlehensWunschArt")
  private DarlehensWunschArtEnum darlehensWunschArt = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("kfwDarlehen")
  private KfwDarlehensWunsch kfwDarlehen = null;

  @JsonProperty("privatDarlehen")
  private PrivatDarlehensWunsch privatDarlehen = null;

  @JsonProperty("variablesDarlehen")
  private VariablesDarlehensWunsch variablesDarlehen = null;

  @JsonProperty("zwischenFinanzierung")
  private ZwischenFinanzierungsWunsch zwischenFinanzierung = null;

  public DarlehensWunsch annuitaetenOderForwardDarlehen(AnnuitaetenOderForwardDarlehensWunsch annuitaetenOderForwardDarlehen) {
    this.annuitaetenOderForwardDarlehen = annuitaetenOderForwardDarlehen;
    return this;
  }

   /**
   * muss leer sein, wenn eines der anderen Attribute gefüllt ist
   * @return annuitaetenOderForwardDarlehen
  **/
  @ApiModelProperty(example = "null", value = "muss leer sein, wenn eines der anderen Attribute gefüllt ist")
  public AnnuitaetenOderForwardDarlehensWunsch getAnnuitaetenOderForwardDarlehen() {
    return annuitaetenOderForwardDarlehen;
  }

  public void setAnnuitaetenOderForwardDarlehen(AnnuitaetenOderForwardDarlehensWunsch annuitaetenOderForwardDarlehen) {
    this.annuitaetenOderForwardDarlehen = annuitaetenOderForwardDarlehen;
  }

  public DarlehensWunsch darlehensWunschArt(DarlehensWunschArtEnum darlehensWunschArt) {
    this.darlehensWunschArt = darlehensWunschArt;
    return this;
  }

   /**
   * Get darlehensWunschArt
   * @return darlehensWunschArt
  **/
  @ApiModelProperty(example = "null", value = "")
  public DarlehensWunschArtEnum getDarlehensWunschArt() {
    return darlehensWunschArt;
  }

  public void setDarlehensWunschArt(DarlehensWunschArtEnum darlehensWunschArt) {
    this.darlehensWunschArt = darlehensWunschArt;
  }

  public DarlehensWunsch id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DarlehensWunsch kfwDarlehen(KfwDarlehensWunsch kfwDarlehen) {
    this.kfwDarlehen = kfwDarlehen;
    return this;
  }

   /**
   * muss leer sein, wenn eines der anderen Attribute gefüllt ist
   * @return kfwDarlehen
  **/
  @ApiModelProperty(example = "null", value = "muss leer sein, wenn eines der anderen Attribute gefüllt ist")
  public KfwDarlehensWunsch getKfwDarlehen() {
    return kfwDarlehen;
  }

  public void setKfwDarlehen(KfwDarlehensWunsch kfwDarlehen) {
    this.kfwDarlehen = kfwDarlehen;
  }

  public DarlehensWunsch privatDarlehen(PrivatDarlehensWunsch privatDarlehen) {
    this.privatDarlehen = privatDarlehen;
    return this;
  }

   /**
   * muss leer sein, wenn eines der anderen Attribute gefüllt ist
   * @return privatDarlehen
  **/
  @ApiModelProperty(example = "null", value = "muss leer sein, wenn eines der anderen Attribute gefüllt ist")
  public PrivatDarlehensWunsch getPrivatDarlehen() {
    return privatDarlehen;
  }

  public void setPrivatDarlehen(PrivatDarlehensWunsch privatDarlehen) {
    this.privatDarlehen = privatDarlehen;
  }

  public DarlehensWunsch variablesDarlehen(VariablesDarlehensWunsch variablesDarlehen) {
    this.variablesDarlehen = variablesDarlehen;
    return this;
  }

   /**
   * muss leer sein, wenn eines der anderen Attribute gefüllt ist
   * @return variablesDarlehen
  **/
  @ApiModelProperty(example = "null", value = "muss leer sein, wenn eines der anderen Attribute gefüllt ist")
  public VariablesDarlehensWunsch getVariablesDarlehen() {
    return variablesDarlehen;
  }

  public void setVariablesDarlehen(VariablesDarlehensWunsch variablesDarlehen) {
    this.variablesDarlehen = variablesDarlehen;
  }

  public DarlehensWunsch zwischenFinanzierung(ZwischenFinanzierungsWunsch zwischenFinanzierung) {
    this.zwischenFinanzierung = zwischenFinanzierung;
    return this;
  }

   /**
   * muss leer sein, wenn eines der anderen Attribute gefüllt ist
   * @return zwischenFinanzierung
  **/
  @ApiModelProperty(example = "null", value = "muss leer sein, wenn eines der anderen Attribute gefüllt ist")
  public ZwischenFinanzierungsWunsch getZwischenFinanzierung() {
    return zwischenFinanzierung;
  }

  public void setZwischenFinanzierung(ZwischenFinanzierungsWunsch zwischenFinanzierung) {
    this.zwischenFinanzierung = zwischenFinanzierung;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DarlehensWunsch darlehensWunsch = (DarlehensWunsch) o;
    return Objects.equals(this.annuitaetenOderForwardDarlehen, darlehensWunsch.annuitaetenOderForwardDarlehen) &&
        Objects.equals(this.darlehensWunschArt, darlehensWunsch.darlehensWunschArt) &&
        Objects.equals(this.id, darlehensWunsch.id) &&
        Objects.equals(this.kfwDarlehen, darlehensWunsch.kfwDarlehen) &&
        Objects.equals(this.privatDarlehen, darlehensWunsch.privatDarlehen) &&
        Objects.equals(this.variablesDarlehen, darlehensWunsch.variablesDarlehen) &&
        Objects.equals(this.zwischenFinanzierung, darlehensWunsch.zwischenFinanzierung);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annuitaetenOderForwardDarlehen, darlehensWunschArt, id, kfwDarlehen, privatDarlehen, variablesDarlehen, zwischenFinanzierung);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DarlehensWunsch {\n");
    
    sb.append("    annuitaetenOderForwardDarlehen: ").append(toIndentedString(annuitaetenOderForwardDarlehen)).append("\n");
    sb.append("    darlehensWunschArt: ").append(toIndentedString(darlehensWunschArt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kfwDarlehen: ").append(toIndentedString(kfwDarlehen)).append("\n");
    sb.append("    privatDarlehen: ").append(toIndentedString(privatDarlehen)).append("\n");
    sb.append("    variablesDarlehen: ").append(toIndentedString(variablesDarlehen)).append("\n");
    sb.append("    zwischenFinanzierung: ").append(toIndentedString(zwischenFinanzierung)).append("\n");
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
