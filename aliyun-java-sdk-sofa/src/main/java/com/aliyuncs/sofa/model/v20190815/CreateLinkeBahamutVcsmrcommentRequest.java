/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkeBahamutVcsmrcommentRequest extends RpcAcsRequest<CreateLinkeBahamutVcsmrcommentResponse> {
	   

	private String lineCode;

	private String commitId;

	private String path;

	private String tenantId;

	private String commentId;

	private String projectId;

	private String mergeRequestId;

	private String commentStr;
	public CreateLinkeBahamutVcsmrcommentRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeBahamutVcsmrcomment", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLineCode() {
		return this.lineCode;
	}

	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
		if(lineCode != null){
			putBodyParameter("LineCode", lineCode);
		}
	}

	public String getCommitId() {
		return this.commitId;
	}

	public void setCommitId(String commitId) {
		this.commitId = commitId;
		if(commitId != null){
			putBodyParameter("CommitId", commitId);
		}
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
		if(path != null){
			putBodyParameter("Path", path);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getCommentId() {
		return this.commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
		if(commentId != null){
			putBodyParameter("CommentId", commentId);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getMergeRequestId() {
		return this.mergeRequestId;
	}

	public void setMergeRequestId(String mergeRequestId) {
		this.mergeRequestId = mergeRequestId;
		if(mergeRequestId != null){
			putBodyParameter("MergeRequestId", mergeRequestId);
		}
	}

	public String getCommentStr() {
		return this.commentStr;
	}

	public void setCommentStr(String commentStr) {
		this.commentStr = commentStr;
		if(commentStr != null){
			putBodyParameter("CommentStr", commentStr);
		}
	}

	@Override
	public Class<CreateLinkeBahamutVcsmrcommentResponse> getResponseClass() {
		return CreateLinkeBahamutVcsmrcommentResponse.class;
	}

}
