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

/**
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-26T20:07:01.076156+02:00[Europe/Amsterdam]")
public class Features200Response {
  public static final String SERIALIZED_NAME_MOVIE = "movie";
  @SerializedName(SERIALIZED_NAME_MOVIE)
  private FeatureMovie movie;

  public static final String SERIALIZED_NAME_EPISODE = "episode";
  @SerializedName(SERIALIZED_NAME_EPISODE)
  private FeatureEpisode episode;

  public static final String SERIALIZED_NAME_TV = "tv";
  @SerializedName(SERIALIZED_NAME_TV)
  private FeatureTvshow tv;

  public Features200Response() {
  }

  public Features200Response movie(FeatureMovie movie) {

    this.movie = movie;
    return this;
  }

   /**
   * Get movie
   * @return movie
  **/
  @javax.annotation.Nullable

  public FeatureMovie getMovie() {
    return movie;
  }


  public void setMovie(FeatureMovie movie) {
    this.movie = movie;
  }


  public Features200Response episode(FeatureEpisode episode) {

    this.episode = episode;
    return this;
  }

   /**
   * Get episode
   * @return episode
  **/
  @javax.annotation.Nullable

  public FeatureEpisode getEpisode() {
    return episode;
  }


  public void setEpisode(FeatureEpisode episode) {
    this.episode = episode;
  }


  public Features200Response tv(FeatureTvshow tv) {

    this.tv = tv;
    return this;
  }

   /**
   * Get tv
   * @return tv
  **/
  @javax.annotation.Nullable

  public FeatureTvshow getTv() {
    return tv;
  }


  public void setTv(FeatureTvshow tv) {
    this.tv = tv;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Features200Response features200Response = (Features200Response) o;
    return Objects.equals(this.movie, features200Response.movie) &&
        Objects.equals(this.episode, features200Response.episode) &&
        Objects.equals(this.tv, features200Response.tv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movie, episode, tv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Features200Response {\n");
    sb.append("    movie: ").append(toIndentedString(movie)).append("\n");
    sb.append("    episode: ").append(toIndentedString(episode)).append("\n");
    sb.append("    tv: ").append(toIndentedString(tv)).append("\n");
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
