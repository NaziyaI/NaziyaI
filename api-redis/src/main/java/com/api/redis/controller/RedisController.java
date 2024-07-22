package  com.api.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.redis.repository.RedisRepository;

@RestController
@RequestMapping("/api/redis")
public class RedisController {

	@Autowired
	private RedisRepository redisRepository;

	@PostMapping("/save")
	public String save(@RequestParam String key, @RequestParam String value) {

		try {
			redisRepository.save(key, value);
			return "Saved!";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Not Saved!";
	}

	@GetMapping("/find")
	public Object find(@RequestParam String key) {
		return redisRepository.find(key);
	}

	@DeleteMapping("/delete")
	public String delete(@RequestParam String key) {
		redisRepository.delete(key);
		return "Deleted!";
	}
}
