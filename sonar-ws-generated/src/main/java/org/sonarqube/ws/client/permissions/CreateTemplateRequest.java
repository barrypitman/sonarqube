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
package org.sonarqube.ws.client.permissions;

import java.util.List;
import javax.annotation.Generated;

/**
 * Create a permission template.<br />Requires the following permission: 'Administer System'.
 *
 * This is part of the internal API.
 * This is a POST request.
 * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/permissions/create_template">Further information about this action online (including a response example)</a>
 * @since 5.2
 */
@Generated("https://github.com/SonarSource/sonar-ws-generator")
public class CreateTemplateRequest {

  private String description;
  private String name;
  private String organization;
  private String projectKeyPattern;

  /**
   * Description
   *
   * Example value: "Permissions for all projects related to the financial service"
   */
  public CreateTemplateRequest setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  /**
   * Name
   *
   * This is a mandatory parameter.
   * Example value: "Financial Service Permissions"
   */
  public CreateTemplateRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  /**
   * Key of organization, used when group name is set
   *
   * This is part of the internal API.
   * Example value: "my-org"
   */
  public CreateTemplateRequest setOrganization(String organization) {
    this.organization = organization;
    return this;
  }

  public String getOrganization() {
    return organization;
  }

  /**
   * Project key pattern. Must be a valid Java regular expression
   *
   * Example value: ".*\\.finance\\..*"
   */
  public CreateTemplateRequest setProjectKeyPattern(String projectKeyPattern) {
    this.projectKeyPattern = projectKeyPattern;
    return this;
  }

  public String getProjectKeyPattern() {
    return projectKeyPattern;
  }
}
