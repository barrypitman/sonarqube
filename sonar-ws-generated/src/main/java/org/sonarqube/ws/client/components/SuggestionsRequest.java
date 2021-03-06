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
package org.sonarqube.ws.client.components;

import java.util.List;
import javax.annotation.Generated;

/**
 * Internal WS for the top-right search engine. The result will contain component search results, grouped by their qualifiers.<p>Each result contains:<ul><li>the organization key</li><li>the component key</li><li>the component's name (unescaped)</li><li>optionally a display name, which puts emphasis to matching characters (this text contains html tags and parts of the html-escaped name)</li></ul>
 *
 * This is part of the internal API.
 * This is a POST request.
 * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/components/suggestions">Further information about this action online (including a response example)</a>
 * @since 4.2
 */
@Generated("https://github.com/SonarSource/sonar-ws-generator")
public class SuggestionsRequest {

  private String more;
  private List<String> recentlyBrowsed;
  private String s;

  /**
   * Category, for which to display the next 20 results (skipping the first 6 results)
   *
   * Possible values:
   * <ul>
   *   <li>"VW"</li>
   *   <li>"SVW"</li>
   *   <li>"APP"</li>
   *   <li>"TRK"</li>
   *   <li>"BRC"</li>
   *   <li>"FIL"</li>
   *   <li>"UTS"</li>
   * </ul>
   */
  public SuggestionsRequest setMore(String more) {
    this.more = more;
    return this;
  }

  public String getMore() {
    return more;
  }

  /**
   * Comma separated list of component keys, that have recently been browsed by the user. Only the first 50 items will be used. Order is not taken into account.
   *
   * Example value: "org.sonarsource:sonarqube,some.other:project"
   */
  public SuggestionsRequest setRecentlyBrowsed(List<String> recentlyBrowsed) {
    this.recentlyBrowsed = recentlyBrowsed;
    return this;
  }

  public List<String> getRecentlyBrowsed() {
    return recentlyBrowsed;
  }

  /**
   * Search query: can contain several search tokens separated by spaces.
   *
   * Example value: "sonar"
   */
  public SuggestionsRequest setS(String s) {
    this.s = s;
    return this;
  }

  public String getS() {
    return s;
  }
}
