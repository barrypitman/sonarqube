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
package org.sonarqube.ws.client.metrics;

import java.util.List;
import javax.annotation.Generated;

/**
 * Search for metrics
 *
 * This is part of the internal API.
 * This is a POST request.
 * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/metrics/search">Further information about this action online (including a response example)</a>
 * @since 5.2
 */
@Generated("https://github.com/SonarSource/sonar-ws-generator")
public class SearchRequest {

  private List<String> f;
  private String isCustom;
  private String p;
  private String ps;

  /**
   * Comma-separated list of the fields to be returned in response. All the fields are returned by default.
   *
   * Possible values:
   * <ul>
   *   <li>"name"</li>
   *   <li>"description"</li>
   *   <li>"domain"</li>
   *   <li>"direction"</li>
   *   <li>"qualitative"</li>
   *   <li>"hidden"</li>
   *   <li>"custom"</li>
   *   <li>"decimalScale"</li>
   * </ul>
   */
  public SearchRequest setF(List<String> f) {
    this.f = f;
    return this;
  }

  public List<String> getF() {
    return f;
  }

  /**
   * Choose custom metrics following 3 cases:<ul><li>true: only custom metrics are returned</li><li>false: only non custom metrics are returned</li><li>not specified: all metrics are returned</li></ul>
   *
   * Example value: "true"
   */
  public SearchRequest setIsCustom(String isCustom) {
    this.isCustom = isCustom;
    return this;
  }

  public String getIsCustom() {
    return isCustom;
  }

  /**
   * 1-based page number
   *
   * Example value: "42"
   */
  public SearchRequest setP(String p) {
    this.p = p;
    return this;
  }

  public String getP() {
    return p;
  }

  /**
   * Page size. Must be greater than 0 and less than 500
   *
   * Example value: "20"
   */
  public SearchRequest setPs(String ps) {
    this.ps = ps;
    return this;
  }

  public String getPs() {
    return ps;
  }
}
