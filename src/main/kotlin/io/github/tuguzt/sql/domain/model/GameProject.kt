package io.github.tuguzt.sql.domain.model

public interface GameProject {
    public val name: String
    public val description: String
    public val documentation: GameProjectDocumentation
    public val assets: Set<GameAsset>
    public val platforms: Set<GameProjectPlatform>
}
