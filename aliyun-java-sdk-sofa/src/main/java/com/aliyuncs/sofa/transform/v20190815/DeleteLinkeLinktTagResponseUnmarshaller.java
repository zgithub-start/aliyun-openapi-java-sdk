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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeLinktTagResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeLinktTagResponseUnmarshaller {

	public static DeleteLinkeLinktTagResponse unmarshall(DeleteLinkeLinktTagResponse deleteLinkeLinktTagResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeLinktTagResponse.setRequestId(_ctx.stringValue("DeleteLinkeLinktTagResponse.RequestId"));
		deleteLinkeLinktTagResponse.setResultCode(_ctx.stringValue("DeleteLinkeLinktTagResponse.ResultCode"));
		deleteLinkeLinktTagResponse.setResultMessage(_ctx.stringValue("DeleteLinkeLinktTagResponse.ResultMessage"));
		deleteLinkeLinktTagResponse.setData(_ctx.booleanValue("DeleteLinkeLinktTagResponse.Data"));
		deleteLinkeLinktTagResponse.setErrorCode(_ctx.longValue("DeleteLinkeLinktTagResponse.ErrorCode"));
		deleteLinkeLinktTagResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeLinktTagResponse.ErrorMessage"));
		deleteLinkeLinktTagResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeLinktTagResponse.ResponseStatusCode"));
		deleteLinkeLinktTagResponse.setSuccess(_ctx.booleanValue("DeleteLinkeLinktTagResponse.Success"));
	 
	 	return deleteLinkeLinktTagResponse;
	}
}