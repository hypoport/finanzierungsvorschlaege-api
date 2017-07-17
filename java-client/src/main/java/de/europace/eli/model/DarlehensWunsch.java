/**
 * Ergebnislisten API
 * Ein Service um eine Ergebnisliste mit Finanzierungsvorschlägen zu ermitteln.
 *
 * OpenAPI spec version: 0.1
 * Contact: helpdesk@europace2.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package de.europace.eli.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import de.europace.eli.model.AnnuitaetenDarlehensWunsch;
import de.europace.eli.model.ForwardDarlehensWunsch;
import de.europace.eli.model.KfwDarlehensWunsch;
import de.europace.eli.model.PrivatDarlehensWunsch;
import de.europace.eli.model.VariablesDarlehensWunsch;
import de.europace.eli.model.ZwischenFinanzierungsWunsch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * DarlehensWunsch
 */

public class DarlehensWunsch   {
  @JsonProperty("annuitaetenDarlehen")
  private AnnuitaetenDarlehensWunsch annuitaetenDarlehen = null;

  @JsonProperty("forwardDarlehen")
  private ForwardDarlehensWunsch forwardDarlehen = null;

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

  public DarlehensWunsch annuitaetenDarlehen(AnnuitaetenDarlehensWunsch annuitaetenDarlehen) {
    this.annuitaetenDarlehen = annuitaetenDarlehen;
    return this;
  }

   /**
   * muss leer sein, wenn eines der anderen Attribute gefüllt ist
   * @return annuitaetenDarlehen
  **/
  @ApiModelProperty(example = "null", value = "muss leer sein, wenn eines der anderen Attribute gefüllt ist")
  public AnnuitaetenDarlehensWunsch getAnnuitaetenDarlehen() {
    return annuitaetenDarlehen;
  }

  public void setAnnuitaetenDarlehen(AnnuitaetenDarlehensWunsch annuitaetenDarlehen) {
    this.annuitaetenDarlehen = annuitaetenDarlehen;
  }

  public DarlehensWunsch forwardDarlehen(ForwardDarlehensWunsch forwardDarlehen) {
    this.forwardDarlehen = forwardDarlehen;
    return this;
  }

   /**
   * muss leer sein, wenn eines der anderen Attribute gefüllt ist
   * @return forwardDarlehen
  **/
  @ApiModelProperty(example = "null", value = "muss leer sein, wenn eines der anderen Attribute gefüllt ist")
  public ForwardDarlehensWunsch getForwardDarlehen() {
    return forwardDarlehen;
  }

  public void setForwardDarlehen(ForwardDarlehensWunsch forwardDarlehen) {
    this.forwardDarlehen = forwardDarlehen;
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
    return Objects.equals(this.annuitaetenDarlehen, darlehensWunsch.annuitaetenDarlehen) &&
        Objects.equals(this.forwardDarlehen, darlehensWunsch.forwardDarlehen) &&
        Objects.equals(this.id, darlehensWunsch.id) &&
        Objects.equals(this.kfwDarlehen, darlehensWunsch.kfwDarlehen) &&
        Objects.equals(this.privatDarlehen, darlehensWunsch.privatDarlehen) &&
        Objects.equals(this.variablesDarlehen, darlehensWunsch.variablesDarlehen) &&
        Objects.equals(this.zwischenFinanzierung, darlehensWunsch.zwischenFinanzierung);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annuitaetenDarlehen, forwardDarlehen, id, kfwDarlehen, privatDarlehen, variablesDarlehen, zwischenFinanzierung);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DarlehensWunsch {\n");
    
    sb.append("    annuitaetenDarlehen: ").append(toIndentedString(annuitaetenDarlehen)).append("\n");
    sb.append("    forwardDarlehen: ").append(toIndentedString(forwardDarlehen)).append("\n");
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

