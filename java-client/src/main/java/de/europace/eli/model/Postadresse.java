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
 * Postadresse
 */

public class Postadresse   {
  @JsonProperty("hausnummer")
  private String hausnummer = null;

  @JsonProperty("ort")
  private String ort = null;

  @JsonProperty("postleitzahl")
  private String postleitzahl = null;

  @JsonProperty("strasse")
  private String strasse = null;

  public Postadresse hausnummer(String hausnummer) {
    this.hausnummer = hausnummer;
    return this;
  }

   /**
   * Get hausnummer
   * @return hausnummer
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHausnummer() {
    return hausnummer;
  }

  public void setHausnummer(String hausnummer) {
    this.hausnummer = hausnummer;
  }

  public Postadresse ort(String ort) {
    this.ort = ort;
    return this;
  }

   /**
   * Get ort
   * @return ort
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrt() {
    return ort;
  }

  public void setOrt(String ort) {
    this.ort = ort;
  }

  public Postadresse postleitzahl(String postleitzahl) {
    this.postleitzahl = postleitzahl;
    return this;
  }

   /**
   * Get postleitzahl
   * @return postleitzahl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPostleitzahl() {
    return postleitzahl;
  }

  public void setPostleitzahl(String postleitzahl) {
    this.postleitzahl = postleitzahl;
  }

  public Postadresse strasse(String strasse) {
    this.strasse = strasse;
    return this;
  }

   /**
   * Get strasse
   * @return strasse
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStrasse() {
    return strasse;
  }

  public void setStrasse(String strasse) {
    this.strasse = strasse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Postadresse postadresse = (Postadresse) o;
    return Objects.equals(this.hausnummer, postadresse.hausnummer) &&
        Objects.equals(this.ort, postadresse.ort) &&
        Objects.equals(this.postleitzahl, postadresse.postleitzahl) &&
        Objects.equals(this.strasse, postadresse.strasse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hausnummer, ort, postleitzahl, strasse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Postadresse {\n");
    
    sb.append("    hausnummer: ").append(toIndentedString(hausnummer)).append("\n");
    sb.append("    ort: ").append(toIndentedString(ort)).append("\n");
    sb.append("    postleitzahl: ").append(toIndentedString(postleitzahl)).append("\n");
    sb.append("    strasse: ").append(toIndentedString(strasse)).append("\n");
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

