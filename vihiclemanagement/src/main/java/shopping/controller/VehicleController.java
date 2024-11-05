package shopping.controller;

import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import shopping.dto.entity.Vehicle;
import shopping.service.VehicleService;

@RestController
@RequestMapping(value = "/vehicles")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<?> getList() {
        HashMap<String, Object> result = new HashMap<>();

        result.put("data", vehicleService.getList());

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Vehicle getById(@PathVariable(value = "id") Long id) {
        Vehicle vehicle = vehicleService.getById(id);

        return vehicle;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Vehicle post(@RequestBody Vehicle vehicle) {
        vehicleService.save(vehicle);

        return vehicle;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void put(
        @PathVariable(value = "id") Long id,
        @RequestBody Vehicle vehicle
    ) {
        vehicle.setId(id);
        vehicleService.update(vehicle);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deletebyId(@PathVariable(value = "id") Long id) {
        vehicleService.delete(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
