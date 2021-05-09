package design.pattern.delegate;

public class BusinessDelegate {
    private BusinessLookUp lookUpService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void doTask() {
        businessService = lookUpService.getBusinessService(serviceType);
        businessService.doProcessing();
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
