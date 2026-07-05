package defpackage;

import j$.time.DateTimeException;
import j$.time.LocalTime;
import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a(with = jv6.class)
/* renamed from: fv6  reason: default package */
/* loaded from: classes3.dex */
public final class fv6 implements Comparable<fv6>, Serializable {
    public static final ev6 Companion = new Object();
    public final LocalTime a;

    /* JADX WARN: Type inference failed for: r0v0, types: [ev6, java.lang.Object] */
    static {
        LocalTime localTime = LocalTime.MIN;
        localTime.getClass();
        new fv6(localTime);
        LocalTime localTime2 = LocalTime.MAX;
        localTime2.getClass();
        new fv6(localTime2);
    }

    public fv6(int i, int i2, int i3, int i4) {
        try {
            LocalTime of = LocalTime.of(i, i2, i3, i4);
            of.getClass();
            this.a = of;
        } catch (DateTimeException e) {
            xk5.m(e);
            throw null;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(fv6 fv6Var) {
        fv6 fv6Var2 = fv6Var;
        fv6Var2.getClass();
        return this.a.compareTo(fv6Var2.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fv6) {
                if (!c16.i(this.a, ((fv6) obj).a)) {
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
        String localTime = this.a.toString();
        localTime.getClass();
        return localTime;
    }

    public fv6(LocalTime localTime) {
        localTime.getClass();
        this.a = localTime;
    }
}
