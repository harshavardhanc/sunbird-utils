/**
 * Copyright 2010-2015 Axel Fontaine
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.contrastsecurity.cassandra.migration.logging.slf4j;

import com.contrastsecurity.cassandra.migration.logging.Log;
import com.contrastsecurity.cassandra.migration.logging.LogCreator;
import org.slf4j.LoggerFactory;

/** Log Creator for Slf4j. */
public class Slf4jLogCreator implements LogCreator {
  public Log createLogger(Class<?> clazz) {
    return new Slf4jLog(LoggerFactory.getLogger(clazz));
  }
}
