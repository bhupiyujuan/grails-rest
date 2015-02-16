package com.rest.request

import grails.converters.*
import groovyx.net.http.ContentType
import groovyx.net.http.HTTPBuilder
import groovyx.net.http.RESTClient
import net.sf.json.JSONArray
import net.sf.json.JSONObject

import org.codehaus.groovy.grails.web.json.*;
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*

class SecureJsonHttpRequest {

	public String getJsonHttpBuilderResponse() {
		def restEndpointUrl = "http://localhost:9000/bankAccountView/a";
		def http = new HTTPBuilder(restEndpointUrl);

		http.request( GET, ContentType.JSON ) {
			response.success = { resp, json ->
				return json
			}
		}
	}


	public JSONObject getHttpResponse(uri){
		def client = new RESTClient( 'http://localhost:9000/' )
		def resp = client.get( path : '/bankAccountView/a' )
		return new JSONObject(new JSONArray(resp.getData()))
	}
}
