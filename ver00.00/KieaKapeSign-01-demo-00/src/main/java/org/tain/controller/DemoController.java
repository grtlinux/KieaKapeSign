package org.tain.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.tain.tools.node.MonJsonNode;
import org.tain.utils.CurrentInfo;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class DemoController {

	/*
	 * S621
	 */
	@RequestMapping(value = {"/sign/request/S621"}, method = {RequestMethod.POST})
	public ResponseEntity<?> s621(HttpEntity<String> httpEntity) throws Exception {
		log.info("KANG-20200623 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			log.info("--------------- Request of S621 --------------------");
			log.info(">>>>> Headers = " + httpEntity.getHeaders());
			log.info(">>>>> Body = " + httpEntity.getBody());
		}
		
		MultiValueMap<String,String> headers = null;
		if (Boolean.TRUE) {
			headers = new LinkedMultiValueMap<>();
			headers.add(HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");
			headers.add("AccessToken", "1234567890ABCDEFG");
		}
		
		Map<String,Object> mapResponse = null;
		if (Boolean.TRUE) {
			Map<String,Object> mapData = new HashMap<>();
			mapData.put("tx_id", "d3c57x08c2c97590ay23d6f6940e7815");
			mapData.put("result", "Y");
			
			mapResponse = new HashMap<>();
			mapResponse.put("data", mapData);
		}
		
		if (Boolean.TRUE) {
			log.info("--------------- Response of S621 --------------------");
			log.info(">>>>> Headers = " + headers);
			log.info(">>>>> Body = " + mapResponse);
			log.info(">>>>> jsonBody = " + MonJsonNode.getPrettyJson(mapResponse));
			log.info("==================================================");
		}
		
		return new ResponseEntity<>(mapResponse, headers, HttpStatus.OK);
	}
	
	/*
	 * status
	 */
	@RequestMapping(value = {"/v1/sign/status"}, method = {RequestMethod.GET})
	public ResponseEntity<?> status(HttpEntity<String> httpEntity, @RequestParam Map<String,String> param) {
		log.info("KANG-20200623 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			log.info("--------------- Request of status --------------------");
			log.info(">>>>> Headers = " + httpEntity.getHeaders());
			log.info(">>>>> Body = " + httpEntity.getBody());
			log.info(">>>>> param = " + param);
		}
		
		MultiValueMap<String,String> headers = null;
		if (Boolean.TRUE) {
			headers = new LinkedMultiValueMap<>();
			headers.add(HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");
			headers.add("AccessToken", "1234567890ABCDEFG");
		}
		
		Map<String,Object> mapResponse = null;
		if (Boolean.TRUE) {
			Map<String,Object> mapData = new HashMap<>();
			mapData.put("tx_id", "d3c57x08c2c97590ay23d6f6940e7815");
			mapData.put("status", "COMPLETE");
			mapData.put("request_at", 1527590620000L);
			mapData.put("viewed_at", 1527590620000L);
			mapData.put("completed_at", 1527590620000L);
			mapData.put("expired_at", 1527590620000L);
			mapData.put("payload", "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY_PAYLOAD");
			mapData.put("org_notified_at", 1527590620000L);
			
			mapResponse = new HashMap<>();
			mapResponse.put("data", mapData);
		}
		
		if (Boolean.TRUE) {
			log.info("--------------- Response of status --------------------");
			log.info(">>>>> Headers = " + headers);
			log.info(">>>>> Body = " + mapResponse);
			log.info(">>>>> jsonBody = " + MonJsonNode.getPrettyJson(mapResponse));
			log.info("==================================================");
		}
		
		return new ResponseEntity<>(mapResponse, headers, HttpStatus.OK);
	}
	
	/*
	 * verify
	 */
	@RequestMapping(value = {"/v1/sign/verify"}, method = {RequestMethod.GET})
	public ResponseEntity<?> verify(HttpEntity<String> httpEntity, @RequestParam Map<String,String> param) {
		log.info("KANG-20200623 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			log.info("--------------- Request of verify --------------------");
			log.info(">>>>> Headers = " + httpEntity.getHeaders());
			log.info(">>>>> Body = " + httpEntity.getBody());
			log.info(">>>>> param = " + param);
		}
		
		MultiValueMap<String,String> headers = null;
		if (Boolean.TRUE) {
			headers = new LinkedMultiValueMap<>();
			headers.add(HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");
			headers.add("AccessToken", "1234567890ABCDEFG");
		}
		
		Map<String,Object> mapResponse = null;
		if (Boolean.TRUE) {
			Map<String,Object> mapData = new HashMap<>();
			mapData.put("tx_id", "d3c57x08c2c97590ay23d6f6940e7815");
			mapData.put("service_user_id", 123);
			mapData.put("one_time_certificate", "MIAGCSQqGSIb3DQEH......49BAMCMHUxCzAJBgNv");
			mapData.put("user_certificate", "UxaZ3QsUTN1Y0gV...GJveCBLYWthbyBDZXJ0I");
			
			mapResponse = new HashMap<>();
			mapResponse.put("data", mapData);
		}
		
		if (Boolean.TRUE) {
			log.info("--------------- Response of verify --------------------");
			log.info(">>>>> Headers = " + headers);
			log.info(">>>>> Body = " + mapResponse);
			log.info(">>>>> jsonBody = " + MonJsonNode.getPrettyJson(mapResponse));
			log.info("==================================================");
		}
		
		return new ResponseEntity<>(mapResponse, headers, HttpStatus.OK);
	}
	
	/*
	 * deregister
	 */
	@RequestMapping(value = {"/v1/service-user/{service_user_id}/deregister"}, method = {RequestMethod.POST})
	public ResponseEntity<?> deregister(HttpEntity<String> httpEntity, @PathVariable(value = "service_user_id") String serviceUserId) throws Exception {
		log.info("KANG-20200623 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			log.info("--------------- Request of deregister --------------------");
			log.info(">>>>> Headers = " + httpEntity.getHeaders());
			log.info(">>>>> Body = " + httpEntity.getBody());
			log.info(">>>>> serviceUserId = " + serviceUserId);
		}
		
		MultiValueMap<String,String> headers = null;
		if (Boolean.TRUE) {
			headers = new LinkedMultiValueMap<>();
			headers.add(HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");
			headers.add("AccessToken", "1234567890ABCDEFG");
		}
		
		Map<String,Object> mapResponse = null;
		if (Boolean.TRUE) {
			Map<String,Object> mapData = new HashMap<>();
			mapData.put("result", "Y");
			
			mapResponse = new HashMap<>();
			mapResponse.put("data", mapData);
		}
		
		if (Boolean.TRUE) {
			log.info("--------------- Response of deregister --------------------");
			log.info(">>>>> Headers = " + headers);
			log.info(">>>>> Body = " + mapResponse);
			log.info(">>>>> jsonBody = " + MonJsonNode.getPrettyJson(mapResponse));
			log.info("==================================================");
		}
		
		return new ResponseEntity<>(mapResponse, headers, HttpStatus.OK);
	}
}
