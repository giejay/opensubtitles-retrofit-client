/*
 * OpenSubtitles API
 * Explore subtitles API here
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: support@opensubtitles.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Latest200ResponseDataInnerAttributesFilesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-26T20:07:01.076156+02:00[Europe/Amsterdam]")
public class Latest200ResponseDataInnerAttributesFilesInner {
  public static final String SERIALIZED_NAME_FILE_ID = "file_id";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private BigDecimal fileId;

  public static final String SERIALIZED_NAME_CD_NUMBER = "cd_number";
  @SerializedName(SERIALIZED_NAME_CD_NUMBER)
  private BigDecimal cdNumber;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public Latest200ResponseDataInnerAttributesFilesInner() {
  }

  public Latest200ResponseDataInnerAttributesFilesInner fileId(BigDecimal fileId) {
    
    this.fileId = fileId;
    return this;
  }

   /**
   * Get fileId
   * @return fileId
  **/
  @javax.annotation.Nonnull

  public BigDecimal getFileId() {
    return fileId;
  }


  public void setFileId(BigDecimal fileId) {
    this.fileId = fileId;
  }


  public Latest200ResponseDataInnerAttributesFilesInner cdNumber(BigDecimal cdNumber) {
    
    this.cdNumber = cdNumber;
    return this;
  }

   /**
   * Get cdNumber
   * @return cdNumber
  **/
  @javax.annotation.Nonnull

  public BigDecimal getCdNumber() {
    return cdNumber;
  }


  public void setCdNumber(BigDecimal cdNumber) {
    this.cdNumber = cdNumber;
  }


  public Latest200ResponseDataInnerAttributesFilesInner fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nonnull

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Latest200ResponseDataInnerAttributesFilesInner latest200ResponseDataInnerAttributesFilesInner = (Latest200ResponseDataInnerAttributesFilesInner) o;
    return Objects.equals(this.fileId, latest200ResponseDataInnerAttributesFilesInner.fileId) &&
        Objects.equals(this.cdNumber, latest200ResponseDataInnerAttributesFilesInner.cdNumber) &&
        Objects.equals(this.fileName, latest200ResponseDataInnerAttributesFilesInner.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, cdNumber, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Latest200ResponseDataInnerAttributesFilesInner {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    cdNumber: ").append(toIndentedString(cdNumber)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

