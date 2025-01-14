package Music_Library;
import java.util.Objects;

public abstract class BaseEntity {
    private static int idGenerator = 1;
    private final int id;

    public BaseEntity() {
        this.id = idGenerator++;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BaseEntity that = (BaseEntity) obj;
        return id == that.id;
    }

    @Override
    public String toString() {
        return "ID: " + id;
    }
}
