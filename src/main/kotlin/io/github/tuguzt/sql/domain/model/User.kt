package io.github.tuguzt.sql.domain.model

public interface User : Identifiable<Int> {
    public val login: String
    public val passwordEncrypted: String
    public val officer: Officer?
}
