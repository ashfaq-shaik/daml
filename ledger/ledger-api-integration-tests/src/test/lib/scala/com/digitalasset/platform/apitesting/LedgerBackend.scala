// Copyright (c) 2019 Digital Asset (Switzerland) GmbH and/or its affiliates. All rights reserved.
// SPDX-License-Identifier: Apache-2.0

package com.digitalasset.platform.apitesting

sealed abstract class LedgerBackend extends Product with Serializable

object LedgerBackend {
  case object SandboxInMemory extends LedgerBackend
  case object SandboxSql extends LedgerBackend
  case object RemoteAPIProxy extends LedgerBackend
}
