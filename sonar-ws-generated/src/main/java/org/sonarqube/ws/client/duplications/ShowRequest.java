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
package org.sonarqube.ws.client.duplications;

import java.util.List;
import javax.annotation.Generated;

/**
 * Get duplications. Require Browse permission on file's project
 *
 * This is part of the internal API.
 * This is a POST request.
 * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/duplications/show">Further information about this action online (including a response example)</a>
 * @since 4.4
 */
@Generated("https://github.com/SonarSource/sonar-ws-generator")
public class ShowRequest {

  private String branch;
  private String key;
  private String uuid;

  /**
   * Branch key
   *
   * This is part of the internal API.
   * Example value: "feature/my_branch"
   */
  public ShowRequest setBranch(String branch) {
    this.branch = branch;
    return this;
  }

  public String getBranch() {
    return branch;
  }

  /**
   * File key
   *
   * Example value: "my_project:/src/foo/Bar.php"
   */
  public ShowRequest setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  /**
   * File ID. If provided, 'key' must not be provided.
   *
   * Example value: "584a89f2-8037-4f7b-b82c-8b45d2d63fb2"
   * @deprecated since 6.5
   */
  @Deprecated
  public ShowRequest setUuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  public String getUuid() {
    return uuid;
  }
}
