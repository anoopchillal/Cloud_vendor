package com.anoop.Student.controller;

import com.anoop.Student.entity.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIController {

    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return cloudVendor;
//                new CloudVendor("C1","Vendor1","Address 1","xxxxxx");

    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor =cloudVendor;
        return "Cloud Vendor Added Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "Cloud vendor Details Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(String vendorId){
        this.cloudVendor=null;
        return "Cloud Vendor Deleted successfully!";
    }
}
