package j$.time.temporal;

import j$.time.DayOfWeek;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class u implements Serializable {
    public static final ConcurrentMap g = new ConcurrentHashMap(4, 0.75f, 2);
    public static final h h;
    private static final long serialVersionUID = -1177360819670808121L;
    public final DayOfWeek a;
    public final int b;
    public final transient t c;
    public final transient t d;
    public final transient t e;
    public final transient t f;

    static {
        new u(DayOfWeek.MONDAY, 4);
        a(DayOfWeek.SUNDAY, 1);
        h = i.d;
    }

    public u(DayOfWeek dayOfWeek, int i) {
        a aVar = a.DAYS;
        a aVar2 = a.WEEKS;
        this.c = new t("DayOfWeek", this, aVar, aVar2, t.f);
        this.d = new t("WeekOfMonth", this, aVar2, a.MONTHS, t.g);
        h hVar = i.d;
        this.e = new t("WeekOfWeekBasedYear", this, aVar2, hVar, t.i);
        this.f = new t("WeekBasedYear", this, hVar, a.FOREVER, ChronoField.YEAR.b);
        Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i >= 1 && i <= 7) {
            this.a = dayOfWeek;
            this.b = i;
            return;
        }
        throw new IllegalArgumentException("Minimal number of days is invalid");
    }

    public static u a(DayOfWeek dayOfWeek, int i) {
        String str = dayOfWeek.toString() + i;
        ConcurrentMap concurrentMap = g;
        u uVar = (u) concurrentMap.get(str);
        if (uVar == null) {
            concurrentMap.putIfAbsent(str, new u(dayOfWeek, i));
            return (u) concurrentMap.get(str);
        }
        return uVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.a != null) {
            int i = this.b;
            if (i >= 1 && i <= 7) {
                return;
            }
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
        throw new InvalidObjectException("firstDayOfWeek is null");
    }

    private Object readResolve() {
        try {
            return a(this.a, this.b);
        } catch (IllegalArgumentException e) {
            String message = e.getMessage();
            throw new InvalidObjectException("Invalid serialized WeekFields: " + message);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u) && hashCode() == obj.hashCode()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.ordinal() * 7) + this.b;
    }

    public final String toString() {
        DayOfWeek dayOfWeek = this.a;
        int i = this.b;
        return "WeekFields[" + dayOfWeek + "," + i + "]";
    }
}
