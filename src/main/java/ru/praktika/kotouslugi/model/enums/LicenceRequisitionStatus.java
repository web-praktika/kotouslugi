package ru.praktika.kotouslugi.model.enums;

public enum LicenceRequisitionStatus {

    DRAFT("создана"),
    FILED("подана"),
    REJECTED("отклонена"),
    ACCEPTED("одобрена"),
    DELETED("удалена");

    private String message;

    LicenceRequisitionStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
