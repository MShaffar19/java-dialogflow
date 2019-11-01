/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/context.proto

package com.google.cloud.dialogflow.v2beta1;

public interface DeleteAllContextsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.DeleteAllContextsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the session to delete all contexts from. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or `projects/&lt;Project
   * ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User ID&gt;/sessions/&lt;Session
   * ID&gt;`. If `Environment ID` is not specified we assume default 'draft'
   * environment. If `User ID` is not specified, we assume default '-' user.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the session to delete all contexts from. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or `projects/&lt;Project
   * ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User ID&gt;/sessions/&lt;Session
   * ID&gt;`. If `Environment ID` is not specified we assume default 'draft'
   * environment. If `User ID` is not specified, we assume default '-' user.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();
}
