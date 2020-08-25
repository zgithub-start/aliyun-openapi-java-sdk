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
public class ExecLinkeLinklogKnowledgefeedbackRequest extends RpcAcsRequest<ExecLinkeLinklogKnowledgefeedbackResponse> {
	   

	private String storeId;

	private String knowledgeFeedbackVOJsonStr;

	private String knowledgeId;

	private String logId;
	public ExecLinkeLinklogKnowledgefeedbackRequest() {
		super("SOFA", "2019-08-15", "ExecLinkeLinklogKnowledgefeedback", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId);
		}
	}

	public String getKnowledgeFeedbackVOJsonStr() {
		return this.knowledgeFeedbackVOJsonStr;
	}

	public void setKnowledgeFeedbackVOJsonStr(String knowledgeFeedbackVOJsonStr) {
		this.knowledgeFeedbackVOJsonStr = knowledgeFeedbackVOJsonStr;
		if(knowledgeFeedbackVOJsonStr != null){
			putBodyParameter("KnowledgeFeedbackVOJsonStr", knowledgeFeedbackVOJsonStr);
		}
	}

	public String getKnowledgeId() {
		return this.knowledgeId;
	}

	public void setKnowledgeId(String knowledgeId) {
		this.knowledgeId = knowledgeId;
		if(knowledgeId != null){
			putBodyParameter("KnowledgeId", knowledgeId);
		}
	}

	public String getLogId() {
		return this.logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
		if(logId != null){
			putBodyParameter("LogId", logId);
		}
	}

	@Override
	public Class<ExecLinkeLinklogKnowledgefeedbackResponse> getResponseClass() {
		return ExecLinkeLinklogKnowledgefeedbackResponse.class;
	}

}
