package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: li5  reason: default package */
/* loaded from: classes3.dex */
public final class li5 {
    public Long a = 0L;
    public Long b = 0L;
    public Long c = 0L;

    static {
        cm9.a(li5.class);
        try {
            cm9.d(li5.class);
        } catch (Throwable unused) {
        }
        if (!k4b.j0("TimeoutConfiguration")) {
            return;
        }
        vs.m("Name can't be blank");
    }

    public li5() {
        c(null);
        b(null);
        d(null);
    }

    public static void a(Long l) {
        if (l != null && l.longValue() <= 0) {
            vs.m("Only positive timeout values are allowed, for infinite timeout use HttpTimeoutConfig.INFINITE_TIMEOUT_MS");
        }
    }

    public final void b(Long l) {
        a(l);
        this.b = l;
    }

    public final void c(Long l) {
        a(l);
        this.a = l;
    }

    public final void d(Long l) {
        a(l);
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || li5.class != obj.getClass()) {
            return false;
        }
        li5 li5Var = (li5) obj;
        if (c16.i(this.a, li5Var.a) && c16.i(this.b, li5Var.b) && c16.i(this.c, li5Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        Long l = this.a;
        int i3 = 0;
        if (l != null) {
            i = Long.hashCode(l.longValue());
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Long l2 = this.b;
        if (l2 != null) {
            i2 = Long.hashCode(l2.longValue());
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Long l3 = this.c;
        if (l3 != null) {
            i3 = Long.hashCode(l3.longValue());
        }
        return i5 + i3;
    }
}
