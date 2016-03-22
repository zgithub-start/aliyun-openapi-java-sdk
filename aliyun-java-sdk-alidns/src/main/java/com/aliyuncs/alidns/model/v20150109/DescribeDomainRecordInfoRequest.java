/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainRecordInfoRequest extends RpcAcsRequest<DescribeDomainRecordInfoResponse> {
	
	public DescribeDomainRecordInfoRequest() {
		super("Alidns", "2015-01-09", "DescribeDomainRecordInfo");
	}

	private String recordId;

	public String getRecordId() {
		return this.recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
		putQueryParameter("RecordId", recordId);
	}

	@Override
	public Class<DescribeDomainRecordInfoResponse> getResponseClass() {
		return DescribeDomainRecordInfoResponse.class;
	}

}
