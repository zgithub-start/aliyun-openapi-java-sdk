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
public class AddMsDrmDataRequest extends RpcAcsRequest<AddMsDrmDataResponse> {
	   

	private String pushTargetType;

	private String pushCells;

	private String value;

	private String instanceId;

	private String dataId;
	public AddMsDrmDataRequest() {
		super("SOFA", "2019-08-15", "AddMsDrmData", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPushTargetType() {
		return this.pushTargetType;
	}

	public void setPushTargetType(String pushTargetType) {
		this.pushTargetType = pushTargetType;
		if(pushTargetType != null){
			putBodyParameter("PushTargetType", pushTargetType);
		}
	}

	public String getPushCells() {
		return this.pushCells;
	}

	public void setPushCells(String pushCells) {
		this.pushCells = pushCells;
		if(pushCells != null){
			putBodyParameter("PushCells", pushCells);
		}
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
		if(value != null){
			putBodyParameter("Value", value);
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

	public String getDataId() {
		return this.dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
		if(dataId != null){
			putBodyParameter("DataId", dataId);
		}
	}

	@Override
	public Class<AddMsDrmDataResponse> getResponseClass() {
		return AddMsDrmDataResponse.class;
	}

}
