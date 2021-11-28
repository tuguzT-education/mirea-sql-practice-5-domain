package io.github.tuguzt.sql.domain.model

public interface GameProjectDocumentation : Identifiable<Int> {
    public val businessPlan: String
    public val designDocument: String
    public val vision: String
}
