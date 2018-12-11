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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeUpBpsPeakDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUpBpsPeakDataResponse extends AcsResponse {

	private String requestId;

	private List<DescribeUpPeakTraffic> describeUpPeakTraffics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DescribeUpPeakTraffic> getDescribeUpPeakTraffics() {
		return this.describeUpPeakTraffics;
	}

	public void setDescribeUpPeakTraffics(List<DescribeUpPeakTraffic> describeUpPeakTraffics) {
		this.describeUpPeakTraffics = describeUpPeakTraffics;
	}

	public static class DescribeUpPeakTraffic {

		private String peakTime;

		private String queryTime;

		private String statName;

		private String bandWidth;

		public String getPeakTime() {
			return this.peakTime;
		}

		public void setPeakTime(String peakTime) {
			this.peakTime = peakTime;
		}

		public String getQueryTime() {
			return this.queryTime;
		}

		public void setQueryTime(String queryTime) {
			this.queryTime = queryTime;
		}

		public String getStatName() {
			return this.statName;
		}

		public void setStatName(String statName) {
			this.statName = statName;
		}

		public String getBandWidth() {
			return this.bandWidth;
		}

		public void setBandWidth(String bandWidth) {
			this.bandWidth = bandWidth;
		}
	}

	@Override
	public DescribeUpBpsPeakDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeUpBpsPeakDataResponseUnmarshaller.unmarshall(this, context);
	}
}