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
import de.europace.eli.model.StackTraceElement;
import de.europace.eli.model.Throwable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Throwable
 */

public class Throwable   {
  @JsonProperty("cause")
  private Throwable cause = null;

  @JsonProperty("localizedMessage")
  private String localizedMessage = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("stackTrace")
  private List<StackTraceElement> stackTrace = new ArrayList<StackTraceElement>();

  @JsonProperty("suppressed")
  private List<Throwable> suppressed = new ArrayList<Throwable>();

  public Throwable cause(Throwable cause) {
    this.cause = cause;
    return this;
  }

   /**
   * Get cause
   * @return cause
  **/
  @ApiModelProperty(example = "null", value = "")
  public Throwable getCause() {
    return cause;
  }

  public void setCause(Throwable cause) {
    this.cause = cause;
  }

  public Throwable localizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
    return this;
  }

   /**
   * Get localizedMessage
   * @return localizedMessage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLocalizedMessage() {
    return localizedMessage;
  }

  public void setLocalizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
  }

  public Throwable message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Throwable stackTrace(List<StackTraceElement> stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  public Throwable addStackTraceItem(StackTraceElement stackTraceItem) {
    this.stackTrace.add(stackTraceItem);
    return this;
  }

   /**
   * Get stackTrace
   * @return stackTrace
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<StackTraceElement> getStackTrace() {
    return stackTrace;
  }

  public void setStackTrace(List<StackTraceElement> stackTrace) {
    this.stackTrace = stackTrace;
  }

  public Throwable suppressed(List<Throwable> suppressed) {
    this.suppressed = suppressed;
    return this;
  }

  public Throwable addSuppressedItem(Throwable suppressedItem) {
    this.suppressed.add(suppressedItem);
    return this;
  }

   /**
   * Get suppressed
   * @return suppressed
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Throwable> getSuppressed() {
    return suppressed;
  }

  public void setSuppressed(List<Throwable> suppressed) {
    this.suppressed = suppressed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Throwable throwable = (Throwable) o;
    return Objects.equals(this.cause, throwable.cause) &&
        Objects.equals(this.localizedMessage, throwable.localizedMessage) &&
        Objects.equals(this.message, throwable.message) &&
        Objects.equals(this.stackTrace, throwable.stackTrace) &&
        Objects.equals(this.suppressed, throwable.suppressed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cause, localizedMessage, message, stackTrace, suppressed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Throwable {\n");
    
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    localizedMessage: ").append(toIndentedString(localizedMessage)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
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

