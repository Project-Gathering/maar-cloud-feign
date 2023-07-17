package maar.cloud.feign.user;

import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "PROFILE-SERVICE", url = "http://localhost:8085")
@RequestMapping(value = "/user")
public interface FeignProfileRest {
	@GetMapping(value="/profile/v1")
	public List<Map<String,Object>> getLstProfileByIds(List<ObjectId>idUsers);
}
