package org.l1ving.api.pull

data class Head(
        var label: String?,
        var ref: String?,
        var repo: RepoX?,
        var sha: String?,
        var user: UserX?
)