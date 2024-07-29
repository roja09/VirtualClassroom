package virtual;

public class VirtualClassroomManager {
    private static VirtualClassroomManager instance;
    private ClassroomService classroomService;

    private VirtualClassroomManager() {
        this.classroomService = new ClassroomServiceImpl();
    }

    public static synchronized VirtualClassroomManager getInstance() {
        if (instance == null) {
            instance = new VirtualClassroomManager();
        }
        return instance;
    }

    public ClassroomService getClassroomService() {
        return classroomService;
    }
}
