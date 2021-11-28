package io.github.tuguzt.sql.domain.model

public interface TestDocument : Identifiable<Int> {
    public val data: String
    public val level: TestLevel
}
