/*
 * SonarQube
 * Copyright (C) 2009-2017 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonarqube.ws.client.qualityprofiles;

import java.util.List;
import javax.annotation.Generated;

/**
 * Search quality profiles
 *
 * This is part of the internal API.
 * This is a POST request.
 * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/qualityprofiles/search">Further information about this action online (including a response example)</a>
 * @since 5.2
 */
@Generated("https://github.com/SonarSource/sonar-ws-generator")
public class SearchRequest {

  private String defaults;
  private String language;
  private String organization;
  private String project;
  private String qualityProfile;

  /**
   * If set to true, return only the quality profiles marked as default for each language
   *
   * Possible values:
   * <ul>
   *   <li>"true"</li>
   *   <li>"false"</li>
   *   <li>"yes"</li>
   *   <li>"no"</li>
   * </ul>
   */
  public SearchRequest setDefaults(String defaults) {
    this.defaults = defaults;
    return this;
  }

  public String getDefaults() {
    return defaults;
  }

  /**
   * Language key. If provided, only profiles for the given language are returned.
   *
   */
  public SearchRequest setLanguage(String language) {
    this.language = language;
    return this;
  }

  public String getLanguage() {
    return language;
  }

  /**
   * Organization key. If no organization is provided, the default organization is used.
   *
   * This is part of the internal API.
   * Example value: "my-org"
   */
  public SearchRequest setOrganization(String organization) {
    this.organization = organization;
    return this;
  }

  public String getOrganization() {
    return organization;
  }

  /**
   * Project key
   *
   * Example value: "my_project"
   */
  public SearchRequest setProject(String project) {
    this.project = project;
    return this;
  }

  public String getProject() {
    return project;
  }

  /**
   * Quality profile name
   *
   * Example value: "SonarQube Way"
   */
  public SearchRequest setQualityProfile(String qualityProfile) {
    this.qualityProfile = qualityProfile;
    return this;
  }

  public String getQualityProfile() {
    return qualityProfile;
  }
}
