package io.github.tuguzt.sql.domain.model

public interface GameAsset {
    public val name: String
    public val description: String
    public val dataUri: String
    public val type: GameAssetType
}
