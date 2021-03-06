package io.github.tuguzt.sql.domain.model

public interface GameProject : Identifiable<Int> {
    public val name: String
    public val description: String
    public val documentation: GameProjectDocumentation
    public val assets: Set<GameAsset>
    public val platforms: Set<GameProjectPlatform>
    public val versions: Set<GameProjectVersion>
    public val organizations: Set<Organization>
}
