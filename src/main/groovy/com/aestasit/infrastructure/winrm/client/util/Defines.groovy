/*
 * Copyright (C) 2011-2014 Aestas/IT
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aestasit.infrastructure.winrm.client.util

/**
 * Constants storage
 *
 * @author Sergey Korenko
 */
interface Defines {
  static String CMD_IS_RUNNING = 'Remote command is still running!'
  static String CMD_IS_STOPPED_BY_TIMEOUT = 'WinRM Shell session timeout!'
  static String CMD_IS_TERMINATED_BY_EXCEPTION = 'Execution of command is terminated by exception!'

  static String PROTOCOL_HTTP  = 'http'
  static String PROTOCOL_HTTPS = 'https'
  static int PORT_HTTP  = 5985
  static int PORT_HTTPS = 5986

  // shell open timeout in milliseconds = 1h
  static long SHELL_DEFAULT_TIMEOUT = 3600000l
  // 60 sec
  static int REQUEST_DEFAULT_TIMEOUT = 60
}