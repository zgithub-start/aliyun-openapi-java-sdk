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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetLinkeLinklogKnowledgefeedbacklistResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeLinklogKnowledgefeedbacklistResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMsg;

	private String responseContentRange;

	private String responseContentType;

	private Long responseStatusCode;

	private Boolean success;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getResponseContentRange() {
		return this.responseContentRange;
	}

	public void setResponseContentRange(String responseContentRange) {
		this.responseContentRange = responseContentRange;
	}

	public String getResponseContentType() {
		return this.responseContentType;
	}

	public void setResponseContentType(String responseContentType) {
		this.responseContentType = responseContentType;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long begin;

		private String beginText;

		private Long end;

		private String endText;

		private String feedback;

		private Long storeIds;

		private List<String> data;

		private List<String> fields;

		private List<String> list;

		public Long getBegin() {
			return this.begin;
		}

		public void setBegin(Long begin) {
			this.begin = begin;
		}

		public String getBeginText() {
			return this.beginText;
		}

		public void setBeginText(String beginText) {
			this.beginText = beginText;
		}

		public Long getEnd() {
			return this.end;
		}

		public void setEnd(Long end) {
			this.end = end;
		}

		public String getEndText() {
			return this.endText;
		}

		public void setEndText(String endText) {
			this.endText = endText;
		}

		public String getFeedback() {
			return this.feedback;
		}

		public void setFeedback(String feedback) {
			this.feedback = feedback;
		}

		public Long getStoreIds() {
			return this.storeIds;
		}

		public void setStoreIds(Long storeIds) {
			this.storeIds = storeIds;
		}

		public List<String> getData() {
			return this.data;
		}

		public void setData(List<String> data) {
			this.data = data;
		}

		public List<String> getFields() {
			return this.fields;
		}

		public void setFields(List<String> fields) {
			this.fields = fields;
		}

		public List<String> getList() {
			return this.list;
		}

		public void setList(List<String> list) {
			this.list = list;
		}
	}

	@Override
	public GetLinkeLinklogKnowledgefeedbacklistResponse getInstance(UnmarshallerContext context) {
		return	GetLinkeLinklogKnowledgefeedbacklistResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
