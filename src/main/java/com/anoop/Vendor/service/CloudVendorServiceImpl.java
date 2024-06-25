package com.anoop.Vendor.service;

import com.anoop.Vendor.entity.CloudVendor;
import com.anoop.Vendor.repository.CloudVendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{

    CloudVendorRepository cloudVendorRepository;
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Cloud vendor saved successfully!";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Cloud Vendor updated Successfully!";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
         cloudVendorRepository.deleteById(cloudVendorId);
        return "deleted cloud vendor successfully!";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
