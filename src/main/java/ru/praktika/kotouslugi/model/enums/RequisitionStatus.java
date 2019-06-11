package ru.praktika.kotouslugi.model.enums;

public enum RequisitionStatus {

    DRAFT("черновик"),
    FILED("подана"),
    UNDER_CONSIDERATION("на рассмотрении"),
    TRANSFERRED_TO_THE_MINISTRY("передана в министерство"),
    REJECTED("отклонена"),
    ACCEPTED("принята"),
    BLOCKED("заблокирована"),
    DELETED("удалено");

    private String message;

    RequisitionStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
