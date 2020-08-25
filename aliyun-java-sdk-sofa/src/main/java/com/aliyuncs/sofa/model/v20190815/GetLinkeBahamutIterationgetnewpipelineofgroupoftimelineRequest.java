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
public class GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineRequest extends RpcAcsRequest<GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse> {
	   

	private String pipelineInstanceId;

	private String pageSize;

	private String searchUserAccount;

	private String unitId;

	private String page;

	private String stageId;
	public GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineRequest() {
		super("SOFA", "2019-08-15", "GetLinkeBahamutIterationgetnewpipelineofgroupoftimeline", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPipelineInstanceId() {
		return this.pipelineInstanceId;
	}

	public void setPipelineInstanceId(String pipelineInstanceId) {
		this.pipelineInstanceId = pipelineInstanceId;
		if(pipelineInstanceId != null){
			putBodyParameter("PipelineInstanceId", pipelineInstanceId);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize);
		}
	}

	public String getSearchUserAccount() {
		return this.searchUserAccount;
	}

	public void setSearchUserAccount(String searchUserAccount) {
		this.searchUserAccount = searchUserAccount;
		if(searchUserAccount != null){
			putBodyParameter("SearchUserAccount", searchUserAccount);
		}
	}

	public String getUnitId() {
		return this.unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
		if(unitId != null){
			putBodyParameter("UnitId", unitId);
		}
	}

	public String getPage() {
		return this.page;
	}

	public void setPage(String page) {
		this.page = page;
		if(page != null){
			putBodyParameter("Page", page);
		}
	}

	public String getStageId() {
		return this.stageId;
	}

	public void setStageId(String stageId) {
		this.stageId = stageId;
		if(stageId != null){
			putBodyParameter("StageId", stageId);
		}
	}

	@Override
	public Class<GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse> getResponseClass() {
		return GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.class;
	}

}
