/********************************************************************************
 * Copyright (c) 2019 TypeFox and others
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/
package org.eclipse.openvsx.json;

import java.util.List;

import jakarta.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
    name = "ReviewList",
    description = "List of reviews of an extension"
)
@JsonInclude(Include.NON_NULL)
public class ReviewListJson extends ResultJson {

    public static ReviewListJson error(String message) {
        var info = new ReviewListJson();
        info.setError(message);
        return info;
    }

    @Schema(hidden = true)
    @NotNull
    private String postUrl;

    @Schema(hidden = true)
    @NotNull
    private String deleteUrl;

    @NotNull
    private List<ReviewJson> reviews;

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }

    public String getDeleteUrl() {
        return deleteUrl;
    }

    public void setDeleteUrl(String deleteUrl) {
        this.deleteUrl = deleteUrl;
    }

    public List<ReviewJson> getReviews() {
        return reviews;
    }

    public void setReviews(List<ReviewJson> reviews) {
        this.reviews = reviews;
    }
}