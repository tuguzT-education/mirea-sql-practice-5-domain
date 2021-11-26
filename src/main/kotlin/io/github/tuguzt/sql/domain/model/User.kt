package io.github.tuguzt.sql.domain.model

public interface User {
    public val login: String
    public val passwordEncrypted: String
    public val officer: Officer?
}
