package io.github.tuguzt.sql.domain.model

public interface GameProjectVersion : Identifiable<Int> {
    public val hash: String
    public val major: Int
    public val minor: Int
    public val patch: Int
    public val metadata: String
}
