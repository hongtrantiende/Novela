package defpackage;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.chrono.ChronoLocalDateTime;
import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a(with = bu6.class)
/* renamed from: xt6  reason: default package */
/* loaded from: classes3.dex */
public final class xt6 implements Comparable<xt6>, Serializable {
    public static final vt6 Companion = new Object();
    public final LocalDateTime a;

    /* JADX WARN: Type inference failed for: r0v0, types: [vt6, java.lang.Object] */
    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        localDateTime.getClass();
        new xt6(localDateTime);
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
        localDateTime2.getClass();
        new xt6(localDateTime2);
    }

    public xt6(nt6 nt6Var, fv6 fv6Var) {
        LocalDateTime of = LocalDateTime.of(nt6Var.a, fv6Var.a);
        of.getClass();
        this.a = of;
    }

    public final nt6 a() {
        LocalDate m = this.a.m();
        m.getClass();
        return new nt6(m);
    }

    @Override // java.lang.Comparable
    public final int compareTo(xt6 xt6Var) {
        xt6 xt6Var2 = xt6Var;
        xt6Var2.getClass();
        return this.a.compareTo((ChronoLocalDateTime<?>) xt6Var2.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xt6) {
                if (!c16.i(this.a, ((xt6) obj).a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String localDateTime = this.a.toString();
        localDateTime.getClass();
        return localDateTime;
    }

    public xt6(LocalDateTime localDateTime) {
        localDateTime.getClass();
        this.a = localDateTime;
    }
}
