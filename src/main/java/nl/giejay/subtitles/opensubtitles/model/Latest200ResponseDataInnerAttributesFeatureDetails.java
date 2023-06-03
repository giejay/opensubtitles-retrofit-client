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


package nl.giejay.subtitles.opensubtitles.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * Latest200ResponseDataInnerAttributesFeatureDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-26T20:07:01.076156+02:00[Europe/Amsterdam]")
public class Latest200ResponseDataInnerAttributesFeatureDetails {
  public static final String SERIALIZED_NAME_FEATURE_ID = "feature_id";
  @SerializedName(SERIALIZED_NAME_FEATURE_ID)
  private BigDecimal featureId;

  public static final String SERIALIZED_NAME_FEATURE_TYPE = "feature_type";
  @SerializedName(SERIALIZED_NAME_FEATURE_TYPE)
  private String featureType;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private BigDecimal year;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_MOVIE_NAME = "movie_name";
  @SerializedName(SERIALIZED_NAME_MOVIE_NAME)
  private String movieName;

  public static final String SERIALIZED_NAME_IMDB_ID = "imdb_id";
  @SerializedName(SERIALIZED_NAME_IMDB_ID)
  private BigDecimal imdbId;

  public static final String SERIALIZED_NAME_TMDB_ID = "tmdb_id";
  @SerializedName(SERIALIZED_NAME_TMDB_ID)
  private Object tmdbId;

  public Latest200ResponseDataInnerAttributesFeatureDetails() {
  }

  public Latest200ResponseDataInnerAttributesFeatureDetails featureId(BigDecimal featureId) {

    this.featureId = featureId;
    return this;
  }

   /**
   * Get featureId
   * @return featureId
  **/
  @javax.annotation.Nonnull

  public BigDecimal getFeatureId() {
    return featureId;
  }


  public void setFeatureId(BigDecimal featureId) {
    this.featureId = featureId;
  }


  public Latest200ResponseDataInnerAttributesFeatureDetails featureType(String featureType) {

    this.featureType = featureType;
    return this;
  }

   /**
   * Get featureType
   * @return featureType
  **/
  @javax.annotation.Nonnull

  public String getFeatureType() {
    return featureType;
  }


  public void setFeatureType(String featureType) {
    this.featureType = featureType;
  }


  public Latest200ResponseDataInnerAttributesFeatureDetails year(BigDecimal year) {

    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @javax.annotation.Nonnull

  public BigDecimal getYear() {
    return year;
  }


  public void setYear(BigDecimal year) {
    this.year = year;
  }


  public Latest200ResponseDataInnerAttributesFeatureDetails title(String title) {

    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nonnull

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Latest200ResponseDataInnerAttributesFeatureDetails movieName(String movieName) {

    this.movieName = movieName;
    return this;
  }

   /**
   * Get movieName
   * @return movieName
  **/
  @javax.annotation.Nonnull

  public String getMovieName() {
    return movieName;
  }


  public void setMovieName(String movieName) {
    this.movieName = movieName;
  }


  public Latest200ResponseDataInnerAttributesFeatureDetails imdbId(BigDecimal imdbId) {

    this.imdbId = imdbId;
    return this;
  }

   /**
   * Get imdbId
   * @return imdbId
  **/
  @javax.annotation.Nonnull

  public BigDecimal getImdbId() {
    return imdbId;
  }


  public void setImdbId(BigDecimal imdbId) {
    this.imdbId = imdbId;
  }


  public Latest200ResponseDataInnerAttributesFeatureDetails tmdbId(Object tmdbId) {

    this.tmdbId = tmdbId;
    return this;
  }

   /**
   * Get tmdbId
   * @return tmdbId
  **/
  @javax.annotation.Nullable

  public Object getTmdbId() {
    return tmdbId;
  }


  public void setTmdbId(Object tmdbId) {
    this.tmdbId = tmdbId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Latest200ResponseDataInnerAttributesFeatureDetails latest200ResponseDataInnerAttributesFeatureDetails = (Latest200ResponseDataInnerAttributesFeatureDetails) o;
    return Objects.equals(this.featureId, latest200ResponseDataInnerAttributesFeatureDetails.featureId) &&
        Objects.equals(this.featureType, latest200ResponseDataInnerAttributesFeatureDetails.featureType) &&
        Objects.equals(this.year, latest200ResponseDataInnerAttributesFeatureDetails.year) &&
        Objects.equals(this.title, latest200ResponseDataInnerAttributesFeatureDetails.title) &&
        Objects.equals(this.movieName, latest200ResponseDataInnerAttributesFeatureDetails.movieName) &&
        Objects.equals(this.imdbId, latest200ResponseDataInnerAttributesFeatureDetails.imdbId) &&
        Objects.equals(this.tmdbId, latest200ResponseDataInnerAttributesFeatureDetails.tmdbId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureId, featureType, year, title, movieName, imdbId, tmdbId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Latest200ResponseDataInnerAttributesFeatureDetails {\n");
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    featureType: ").append(toIndentedString(featureType)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    movieName: ").append(toIndentedString(movieName)).append("\n");
    sb.append("    imdbId: ").append(toIndentedString(imdbId)).append("\n");
    sb.append("    tmdbId: ").append(toIndentedString(tmdbId)).append("\n");
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
