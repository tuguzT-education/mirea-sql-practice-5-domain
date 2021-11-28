package io.github.tuguzt.sql.domain.model

public interface Officer : Identifiable<Int> {
    public val name: String
    public val role: OfficerRole
}
