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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAKSNodeDaemonSetRequest extends RpcAcsRequest<UpdateAKSNodeDaemonSetResponse> {
	   

	private String workspace;

	private String updateStrategy;

	private List<Nodes> nodess;

	private String name;

	private String namespace;

	private String updateVersion;

	private String operatorName;
	public UpdateAKSNodeDaemonSetRequest() {
		super("SOFA", "2019-08-15", "UpdateAKSNodeDaemonSet", "sofa");
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

	public String getUpdateStrategy() {
		return this.updateStrategy;
	}

	public void setUpdateStrategy(String updateStrategy) {
		this.updateStrategy = updateStrategy;
		if(updateStrategy != null){
			putBodyParameter("UpdateStrategy", updateStrategy);
		}
	}

	public List<Nodes> getNodess() {
		return this.nodess;
	}

	public void setNodess(List<Nodes> nodess) {
		this.nodess = nodess;	
		if (nodess != null) {
			for (int depth1 = 0; depth1 < nodess.size(); depth1++) {
				putBodyParameter("Nodes." + (depth1 + 1) + ".Data" , nodess.get(depth1).getData());
			}
		}	
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
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

	public String getUpdateVersion() {
		return this.updateVersion;
	}

	public void setUpdateVersion(String updateVersion) {
		this.updateVersion = updateVersion;
		if(updateVersion != null){
			putBodyParameter("UpdateVersion", updateVersion);
		}
	}

	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
		if(operatorName != null){
			putBodyParameter("OperatorName", operatorName);
		}
	}

	public static class Nodes {

		private String data;

		public String getData() {
			return this.data;
		}

		public void setData(String data) {
			this.data = data;
		}
	}

	@Override
	public Class<UpdateAKSNodeDaemonSetResponse> getResponseClass() {
		return UpdateAKSNodeDaemonSetResponse.class;
	}

}
