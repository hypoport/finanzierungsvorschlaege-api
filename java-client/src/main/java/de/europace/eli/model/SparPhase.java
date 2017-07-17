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
import java.math.BigDecimal;


/**
 * SparPhase
 */

public class SparPhase   {
  @JsonProperty("guthabenBeiZuteilung")
  private BigDecimal guthabenBeiZuteilung = null;

  @JsonProperty("sparBeitragMonatlich")
  private BigDecimal sparBeitragMonatlich = null;

  @JsonProperty("sparPhaseInJahren")
  private Integer sparPhaseInJahren = null;

  public SparPhase guthabenBeiZuteilung(BigDecimal guthabenBeiZuteilung) {
    this.guthabenBeiZuteilung = guthabenBeiZuteilung;
    return this;
  }

   /**
   * Get guthabenBeiZuteilung
   * @return guthabenBeiZuteilung
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getGuthabenBeiZuteilung() {
    return guthabenBeiZuteilung;
  }

  public void setGuthabenBeiZuteilung(BigDecimal guthabenBeiZuteilung) {
    this.guthabenBeiZuteilung = guthabenBeiZuteilung;
  }

  public SparPhase sparBeitragMonatlich(BigDecimal sparBeitragMonatlich) {
    this.sparBeitragMonatlich = sparBeitragMonatlich;
    return this;
  }

   /**
   * Get sparBeitragMonatlich
   * @return sparBeitragMonatlich
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getSparBeitragMonatlich() {
    return sparBeitragMonatlich;
  }

  public void setSparBeitragMonatlich(BigDecimal sparBeitragMonatlich) {
    this.sparBeitragMonatlich = sparBeitragMonatlich;
  }

  public SparPhase sparPhaseInJahren(Integer sparPhaseInJahren) {
    this.sparPhaseInJahren = sparPhaseInJahren;
    return this;
  }

   /**
   * Get sparPhaseInJahren
   * @return sparPhaseInJahren
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSparPhaseInJahren() {
    return sparPhaseInJahren;
  }

  public void setSparPhaseInJahren(Integer sparPhaseInJahren) {
    this.sparPhaseInJahren = sparPhaseInJahren;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SparPhase sparPhase = (SparPhase) o;
    return Objects.equals(this.guthabenBeiZuteilung, sparPhase.guthabenBeiZuteilung) &&
        Objects.equals(this.sparBeitragMonatlich, sparPhase.sparBeitragMonatlich) &&
        Objects.equals(this.sparPhaseInJahren, sparPhase.sparPhaseInJahren);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guthabenBeiZuteilung, sparBeitragMonatlich, sparPhaseInJahren);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SparPhase {\n");
    
    sb.append("    guthabenBeiZuteilung: ").append(toIndentedString(guthabenBeiZuteilung)).append("\n");
    sb.append("    sparBeitragMonatlich: ").append(toIndentedString(sparBeitragMonatlich)).append("\n");
    sb.append("    sparPhaseInJahren: ").append(toIndentedString(sparPhaseInJahren)).append("\n");
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

