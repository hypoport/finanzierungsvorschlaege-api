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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * MiteigentumsAnteil
 */

public class MiteigentumsAnteil   {
  @JsonProperty("anteil")
  private Double anteil = null;

  @JsonProperty("gesamt")
  private Integer gesamt = null;

  public MiteigentumsAnteil anteil(Double anteil) {
    this.anteil = anteil;
    return this;
  }

   /**
   * Get anteil
   * @return anteil
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getAnteil() {
    return anteil;
  }

  public void setAnteil(Double anteil) {
    this.anteil = anteil;
  }

  public MiteigentumsAnteil gesamt(Integer gesamt) {
    this.gesamt = gesamt;
    return this;
  }

   /**
   * Get gesamt
   * @return gesamt
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getGesamt() {
    return gesamt;
  }

  public void setGesamt(Integer gesamt) {
    this.gesamt = gesamt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MiteigentumsAnteil miteigentumsAnteil = (MiteigentumsAnteil) o;
    return Objects.equals(this.anteil, miteigentumsAnteil.anteil) &&
        Objects.equals(this.gesamt, miteigentumsAnteil.gesamt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anteil, gesamt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiteigentumsAnteil {\n");
    
    sb.append("    anteil: ").append(toIndentedString(anteil)).append("\n");
    sb.append("    gesamt: ").append(toIndentedString(gesamt)).append("\n");
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

