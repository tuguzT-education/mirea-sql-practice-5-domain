package io.github.tuguzt.sql.domain.model

public interface GameProjectPlatform : Identifiable<Int> {
    public val name: String
    public val gameProjects: Set<GameProject>
}
