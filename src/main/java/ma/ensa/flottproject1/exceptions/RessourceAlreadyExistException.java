package ma.ensa.flottproject1.exceptions;

import java.time.LocalDateTime;

public class RessourceAlreadyExistException extends RuntimeException{
    private Long resourceId;

    private String ressourceName;
    private String resourceType;
    private String errorMessage;
    private LocalDateTime timestamp;

    public RessourceAlreadyExistException(String resourceType,Long resourceId ,String errorMessage) {
        this.resourceId = resourceId;
        this.resourceType = resourceType;
        this.errorMessage = errorMessage;
        this.timestamp = LocalDateTime.now();
    }
    public RessourceAlreadyExistException(String resourceType,String ressourceName,String errorMessage) {
        this.ressourceName = ressourceName;
        this.resourceType = resourceType;
        this.errorMessage = errorMessage;
        this.timestamp = LocalDateTime.now();
    }
}
