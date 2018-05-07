package com.squareup.sqlite.migrations

interface DatabaseComparator<T : Database> {
  fun compare(db1: T, db2: T): DatabaseDiff
}
