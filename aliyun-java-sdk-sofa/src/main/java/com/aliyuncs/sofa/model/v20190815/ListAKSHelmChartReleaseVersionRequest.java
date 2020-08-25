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
public class ListAKSHelmChartReleaseVersionRequest extends RpcAcsRequest<ListAKSHelmChartReleaseVersionResponse> {
	   

	private String workspace;

	private String releaseName;

	private String paginationQueryJsonStr;

	private String clusterId;

	private String namespace;
	public ListAKSHelmChartReleaseVersionRequest() {
		super("SOFA", "2019-08-15", "ListAKSHelmChartReleaseVersion", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWorkspace() {
		return this.workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
		if(workspace != null){
			putBodyParameter("Workspace", workspace);
		}
	}

	public String getReleaseName() {
		return this.releaseName;
	}

	public void setReleaseName(String releaseName) {
		this.releaseName = releaseName;
		if(releaseName != null){
			putBodyParameter("ReleaseName", releaseName);
		}
	}

	public String getPaginationQueryJsonStr() {
		return this.paginationQueryJsonStr;
	}

	public void setPaginationQueryJsonStr(String paginationQueryJsonStr) {
		this.paginationQueryJsonStr = paginationQueryJsonStr;
		if(paginationQueryJsonStr != null){
			putBodyParameter("PaginationQueryJsonStr", paginationQueryJsonStr);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putBodyParameter("ClusterId", clusterId);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putBodyParameter("Namespace", namespace);
		}
	}

	@Override
	public Class<ListAKSHelmChartReleaseVersionResponse> getResponseClass() {
		return ListAKSHelmChartReleaseVersionResponse.class;
	}

}
