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
package org.sonarqube.ws.client.settings;

import java.util.stream.Collectors;
import javax.annotation.Generated;
import org.sonarqube.ws.MediaTypes;
import org.sonarqube.ws.Settings.CheckSecretKeyWsResponse;
import org.sonarqube.ws.Settings.EncryptWsResponse;
import org.sonarqube.ws.Settings.GenerateSecretKeyWsResponse;
import org.sonarqube.ws.Settings.ListDefinitionsWsResponse;
import org.sonarqube.ws.Settings.ValuesWsResponse;
import org.sonarqube.ws.client.BaseService;
import org.sonarqube.ws.client.GetRequest;
import org.sonarqube.ws.client.PostRequest;
import org.sonarqube.ws.client.WsConnector;

/**
 * Manage settings.
 * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/settings">Further information about this web service online</a>
 */
@Generated("https://github.com/SonarSource/sonar-ws-generator")
public class SettingsService extends BaseService {

  public SettingsService(WsConnector wsConnector) {
    super(wsConnector, "api/settings");
  }

  /**
   * Check if a secret key is available.<br>Requires the 'Administer System' permission.
   *
   * This is part of the internal API.
   * This is a GET request.
   * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/settings/check_secret_key">Further information about this action online (including a response example)</a>
   * @since 6.1
   */
  public CheckSecretKeyWsResponse checkSecretKey() {
    return call(
      new GetRequest(path("check_secret_key")),
      CheckSecretKeyWsResponse.parser());
  }

  /**
   * Encrypt a setting value.<br>Requires 'Administer System' permission.
   *
   * This is part of the internal API.
   * This is a GET request.
   * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/settings/encrypt">Further information about this action online (including a response example)</a>
   * @since 6.1
   */
  public EncryptWsResponse encrypt(EncryptRequest request) {
    return call(
      new GetRequest(path("encrypt"))
        .setParam("value", request.getValue()),
      EncryptWsResponse.parser());
  }

  /**
   * Generate a secret key.<br>Requires the 'Administer System' permission
   *
   * This is part of the internal API.
   * This is a GET request.
   * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/settings/generate_secret_key">Further information about this action online (including a response example)</a>
   * @since 6.1
   */
  public GenerateSecretKeyWsResponse generateSecretKey() {
    return call(
      new GetRequest(path("generate_secret_key")),
      GenerateSecretKeyWsResponse.parser());
  }

  /**
   * List settings definitions.<br>Requires 'Browse' permission when a component is specified<br/>
   *
   * This is part of the internal API.
   * This is a GET request.
   * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/settings/list_definitions">Further information about this action online (including a response example)</a>
   * @since 6.3
   */
  public ListDefinitionsWsResponse listDefinitions(ListDefinitionsRequest request) {
    return call(
      new GetRequest(path("list_definitions"))
        .setParam("branch", request.getBranch())
        .setParam("component", request.getComponent()),
      ListDefinitionsWsResponse.parser());
  }

  /**
   * Remove a setting value.<br>Requires one of the following permissions: <ul><li>'Administer System'</li><li>'Administer' rights on the specified component</li></ul>
   *
   * This is part of the internal API.
   * This is a POST request.
   * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/settings/reset">Further information about this action online (including a response example)</a>
   * @since 6.1
   */
  public void reset(ResetRequest request) {
    call(
      new PostRequest(path("reset"))
        .setParam("branch", request.getBranch())
        .setParam("component", request.getComponent())
        .setParam("keys", request.getKeys() == null ? null : request.getKeys().stream().collect(Collectors.joining(",")))
        .setMediaType(MediaTypes.JSON)
      ).content();
  }

  /**
   * Update a setting value.<br>Either 'value' or 'values' must be provided.<br> Requires one of the following permissions: <ul><li>'Administer System'</li><li>'Administer' rights on the specified component</li></ul>
   *
   * This is part of the internal API.
   * This is a POST request.
   * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/settings/set">Further information about this action online (including a response example)</a>
   * @since 6.1
   */
  public void set(SetRequest request) {
    call(
      new PostRequest(path("set"))
        .setParam("branch", request.getBranch())
        .setParam("component", request.getComponent())
        .setParam("fieldValues", request.getFieldValues() == null ? null : request.getFieldValues().stream().collect(Collectors.joining(",")))
        .setParam("key", request.getKey())
        .setParam("value", request.getValue())
        .setParam("values", request.getValues() == null ? null : request.getValues().stream().collect(Collectors.joining(",")))
        .setMediaType(MediaTypes.JSON)
      ).content();
  }

  /**
   * List settings values.<br>If no value has been set for a setting, then the default value is returned.<br>Requires 'Browse' permission when a component is specified<br/>
   *
   * This is part of the internal API.
   * This is a GET request.
   * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/settings/values">Further information about this action online (including a response example)</a>
   * @since 6.3
   */
  public ValuesWsResponse values(ValuesRequest request) {
    return call(
      new GetRequest(path("values"))
        .setParam("branch", request.getBranch())
        .setParam("component", request.getComponent())
        .setParam("keys", request.getKeys() == null ? null : request.getKeys().stream().collect(Collectors.joining(","))),
      ValuesWsResponse.parser());
  }
}
