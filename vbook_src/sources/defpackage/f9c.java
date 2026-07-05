package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: f9c  reason: default package */
/* loaded from: classes.dex */
public final class f9c {
    public static final e9c Companion = new Object();
    public final long a;
    public final long b;
    public final long c;

    public /* synthetic */ f9c(int i, long j, long j2, long j3) {
        if (1 == (i & 1)) {
            this.a = j;
            this.b = (i & 2) == 0 ? j * 1000 : j2;
            if ((i & 4) == 0) {
                this.c = j / 1000;
                return;
            } else {
                this.c = j3;
                return;
            }
        }
        w92.x(i, 1, d9c.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f9c) && this.a == ((f9c) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "Time(ms=" + this.a + ')';
    }

    public f9c(long j) {
        this.a = j;
        this.b = j * 1000;
        this.c = j / 1000;
    }
}
