/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.livy

import org.json4s.JField

package object repl {
  type MimeTypeMap = List[JField]

  val APPLICATION_JSON = "application/json"
  val APPLICATION_LIVY_TABLE_JSON = "application/vnd.livy.table.v1+json"
  val IMAGE_PNG = "image/png"
  val TEXT_PLAIN = "text/plain"
}
