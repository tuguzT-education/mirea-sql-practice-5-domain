package io.github.tuguzt.sql.domain.model

public interface Organization {
    public val name: String
    public val description: String
    public val type: OrganizationType
    public val testDocument: TestDocument?
    public val officers: Set<Officer>
    public val gameProjects: Set<GameProject>
}
