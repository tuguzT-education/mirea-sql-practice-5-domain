package io.github.tuguzt.sql.domain.model

public interface GameAsset : Identifiable<Int> {
    public val name: String
    public val description: String
    public val dataUri: String
    public val type: GameAssetType
    public val gameProject: GameProject
}
