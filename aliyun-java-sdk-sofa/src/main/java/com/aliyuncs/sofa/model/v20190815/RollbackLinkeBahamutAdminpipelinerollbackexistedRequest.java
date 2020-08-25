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
public class RollbackLinkeBahamutAdminpipelinerollbackexistedRequest extends RpcAcsRequest<RollbackLinkeBahamutAdminpipelinerollbackexistedResponse> {
	   

	private String iteration;

	private String app;

	private String bahamutTenant;
	public RollbackLinkeBahamutAdminpipelinerollbackexistedRequest() {
		super("SOFA", "2019-08-15", "RollbackLinkeBahamutAdminpipelinerollbackexisted", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIteration() {
		return this.iteration;
	}

	public void setIteration(String iteration) {
		this.iteration = iteration;
		if(iteration != null){
			putBodyParameter("Iteration", iteration);
		}
	}

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
		if(app != null){
			putBodyParameter("App", app);
		}
	}

	public String getBahamutTenant() {
		return this.bahamutTenant;
	}

	public void setBahamutTenant(String bahamutTenant) {
		this.bahamutTenant = bahamutTenant;
		if(bahamutTenant != null){
			putBodyParameter("BahamutTenant", bahamutTenant);
		}
	}

	@Override
	public Class<RollbackLinkeBahamutAdminpipelinerollbackexistedResponse> getResponseClass() {
		return RollbackLinkeBahamutAdminpipelinerollbackexistedResponse.class;
	}

}
