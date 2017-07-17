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
import de.europace.eli.model.BausparAngebot;
import de.europace.eli.model.Finanzbedarf;
import de.europace.eli.model.Finanzierungswunsch;
import de.europace.eli.model.NachrangigesExternesDarlehen;
import de.europace.eli.model.Praeferenzen;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * Vorhaben
 */

public class Vorhaben   {
  @JsonProperty("eigenleistungWennNeubauOderModernisierungsmassnahmen")
  private BigDecimal eigenleistungWennNeubauOderModernisierungsmassnahmen = null;

  @JsonProperty("externeBausparAngebote")
  private List<BausparAngebot> externeBausparAngebote = new ArrayList<BausparAngebot>();

  @JsonProperty("finanzbedarf")
  private Finanzbedarf finanzbedarf = null;

  @JsonProperty("finanzierungswunsch")
  private Finanzierungswunsch finanzierungswunsch = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("nachrangigeExterneDarlehen")
  private List<NachrangigesExternesDarlehen> nachrangigeExterneDarlehen = new ArrayList<NachrangigesExternesDarlehen>();

  @JsonProperty("praeferenzen")
  private Praeferenzen praeferenzen = null;

  /**
   * Gets or Sets verwendungszweck
   */
  public enum VerwendungszweckEnum {
    ANSCHLUSSFINANZIERUNG("ANSCHLUSSFINANZIERUNG"),
    
    KAUF("KAUF"),
    
    KAUF_NEUBAU_VOM_BAUTRAEGER("KAUF_NEUBAU_VOM_BAUTRAEGER"),
    
    MODERNISIERUNG_UMBAU_ANBAU("MODERNISIERUNG_UMBAU_ANBAU"),
    
    NEUBAU("NEUBAU"),
    
    KAPITALBESCHAFFUNG("KAPITALBESCHAFFUNG");

    private String value;

    VerwendungszweckEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VerwendungszweckEnum fromValue(String text) {
      for (VerwendungszweckEnum b : VerwendungszweckEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("verwendungszweck")
  private VerwendungszweckEnum verwendungszweck = null;

  public Vorhaben eigenleistungWennNeubauOderModernisierungsmassnahmen(BigDecimal eigenleistungWennNeubauOderModernisierungsmassnahmen) {
    this.eigenleistungWennNeubauOderModernisierungsmassnahmen = eigenleistungWennNeubauOderModernisierungsmassnahmen;
    return this;
  }

   /**
   * Get eigenleistungWennNeubauOderModernisierungsmassnahmen
   * @return eigenleistungWennNeubauOderModernisierungsmassnahmen
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getEigenleistungWennNeubauOderModernisierungsmassnahmen() {
    return eigenleistungWennNeubauOderModernisierungsmassnahmen;
  }

  public void setEigenleistungWennNeubauOderModernisierungsmassnahmen(BigDecimal eigenleistungWennNeubauOderModernisierungsmassnahmen) {
    this.eigenleistungWennNeubauOderModernisierungsmassnahmen = eigenleistungWennNeubauOderModernisierungsmassnahmen;
  }

  public Vorhaben externeBausparAngebote(List<BausparAngebot> externeBausparAngebote) {
    this.externeBausparAngebote = externeBausparAngebote;
    return this;
  }

  public Vorhaben addExterneBausparAngeboteItem(BausparAngebot externeBausparAngeboteItem) {
    this.externeBausparAngebote.add(externeBausparAngeboteItem);
    return this;
  }

   /**
   * Get externeBausparAngebote
   * @return externeBausparAngebote
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<BausparAngebot> getExterneBausparAngebote() {
    return externeBausparAngebote;
  }

  public void setExterneBausparAngebote(List<BausparAngebot> externeBausparAngebote) {
    this.externeBausparAngebote = externeBausparAngebote;
  }

  public Vorhaben finanzbedarf(Finanzbedarf finanzbedarf) {
    this.finanzbedarf = finanzbedarf;
    return this;
  }

   /**
   * Get finanzbedarf
   * @return finanzbedarf
  **/
  @ApiModelProperty(example = "null", value = "")
  public Finanzbedarf getFinanzbedarf() {
    return finanzbedarf;
  }

  public void setFinanzbedarf(Finanzbedarf finanzbedarf) {
    this.finanzbedarf = finanzbedarf;
  }

  public Vorhaben finanzierungswunsch(Finanzierungswunsch finanzierungswunsch) {
    this.finanzierungswunsch = finanzierungswunsch;
    return this;
  }

   /**
   * Get finanzierungswunsch
   * @return finanzierungswunsch
  **/
  @ApiModelProperty(example = "null", value = "")
  public Finanzierungswunsch getFinanzierungswunsch() {
    return finanzierungswunsch;
  }

  public void setFinanzierungswunsch(Finanzierungswunsch finanzierungswunsch) {
    this.finanzierungswunsch = finanzierungswunsch;
  }

  public Vorhaben id(String id) {
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

  public Vorhaben nachrangigeExterneDarlehen(List<NachrangigesExternesDarlehen> nachrangigeExterneDarlehen) {
    this.nachrangigeExterneDarlehen = nachrangigeExterneDarlehen;
    return this;
  }

  public Vorhaben addNachrangigeExterneDarlehenItem(NachrangigesExternesDarlehen nachrangigeExterneDarlehenItem) {
    this.nachrangigeExterneDarlehen.add(nachrangigeExterneDarlehenItem);
    return this;
  }

   /**
   * Get nachrangigeExterneDarlehen
   * @return nachrangigeExterneDarlehen
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<NachrangigesExternesDarlehen> getNachrangigeExterneDarlehen() {
    return nachrangigeExterneDarlehen;
  }

  public void setNachrangigeExterneDarlehen(List<NachrangigesExternesDarlehen> nachrangigeExterneDarlehen) {
    this.nachrangigeExterneDarlehen = nachrangigeExterneDarlehen;
  }

  public Vorhaben praeferenzen(Praeferenzen praeferenzen) {
    this.praeferenzen = praeferenzen;
    return this;
  }

   /**
   * Get praeferenzen
   * @return praeferenzen
  **/
  @ApiModelProperty(example = "null", value = "")
  public Praeferenzen getPraeferenzen() {
    return praeferenzen;
  }

  public void setPraeferenzen(Praeferenzen praeferenzen) {
    this.praeferenzen = praeferenzen;
  }

  public Vorhaben verwendungszweck(VerwendungszweckEnum verwendungszweck) {
    this.verwendungszweck = verwendungszweck;
    return this;
  }

   /**
   * Get verwendungszweck
   * @return verwendungszweck
  **/
  @ApiModelProperty(example = "null", value = "")
  public VerwendungszweckEnum getVerwendungszweck() {
    return verwendungszweck;
  }

  public void setVerwendungszweck(VerwendungszweckEnum verwendungszweck) {
    this.verwendungszweck = verwendungszweck;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vorhaben vorhaben = (Vorhaben) o;
    return Objects.equals(this.eigenleistungWennNeubauOderModernisierungsmassnahmen, vorhaben.eigenleistungWennNeubauOderModernisierungsmassnahmen) &&
        Objects.equals(this.externeBausparAngebote, vorhaben.externeBausparAngebote) &&
        Objects.equals(this.finanzbedarf, vorhaben.finanzbedarf) &&
        Objects.equals(this.finanzierungswunsch, vorhaben.finanzierungswunsch) &&
        Objects.equals(this.id, vorhaben.id) &&
        Objects.equals(this.nachrangigeExterneDarlehen, vorhaben.nachrangigeExterneDarlehen) &&
        Objects.equals(this.praeferenzen, vorhaben.praeferenzen) &&
        Objects.equals(this.verwendungszweck, vorhaben.verwendungszweck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eigenleistungWennNeubauOderModernisierungsmassnahmen, externeBausparAngebote, finanzbedarf, finanzierungswunsch, id, nachrangigeExterneDarlehen, praeferenzen, verwendungszweck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vorhaben {\n");
    
    sb.append("    eigenleistungWennNeubauOderModernisierungsmassnahmen: ").append(toIndentedString(eigenleistungWennNeubauOderModernisierungsmassnahmen)).append("\n");
    sb.append("    externeBausparAngebote: ").append(toIndentedString(externeBausparAngebote)).append("\n");
    sb.append("    finanzbedarf: ").append(toIndentedString(finanzbedarf)).append("\n");
    sb.append("    finanzierungswunsch: ").append(toIndentedString(finanzierungswunsch)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nachrangigeExterneDarlehen: ").append(toIndentedString(nachrangigeExterneDarlehen)).append("\n");
    sb.append("    praeferenzen: ").append(toIndentedString(praeferenzen)).append("\n");
    sb.append("    verwendungszweck: ").append(toIndentedString(verwendungszweck)).append("\n");
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

