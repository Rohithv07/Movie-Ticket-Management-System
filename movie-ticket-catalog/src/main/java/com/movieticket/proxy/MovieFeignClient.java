package com.movieticket.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.movieticket.dto.ResponseMessage;

@FeignClient(name = "movie", url = "http://localhost:8082/listAllMovies")
public interface MovieFeignClient {
	@GetMapping("/listAllMovies")
	public ResponseMessage listAllMovies();
}
