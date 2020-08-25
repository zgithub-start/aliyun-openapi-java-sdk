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
public class CreateDTXAppsRequest extends RpcAcsRequest<CreateDTXAppsResponse> {
	   

	private Long activityMode;

	private String appName;

	private String splitRuleJsonStr;

	private String instanceId;

	private String desc;
	public CreateDTXAppsRequest() {
		super("SOFA", "2019-08-15", "CreateDTXApps", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getActivityMode() {
		return this.activityMode;
	}

	public void setActivityMode(Long activityMode) {
		this.activityMode = activityMode;
		if(activityMode != null){
			putBodyParameter("ActivityMode", activityMode.toString());
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putBodyParameter("AppName", appName);
		}
	}

	public String getSplitRuleJsonStr() {
		return this.splitRuleJsonStr;
	}

	public void setSplitRuleJsonStr(String splitRuleJsonStr) {
		this.splitRuleJsonStr = splitRuleJsonStr;
		if(splitRuleJsonStr != null){
			putBodyParameter("SplitRuleJsonStr", splitRuleJsonStr);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
		if(desc != null){
			putBodyParameter("Desc", desc);
		}
	}

	@Override
	public Class<CreateDTXAppsResponse> getResponseClass() {
		return CreateDTXAppsResponse.class;
	}

}
