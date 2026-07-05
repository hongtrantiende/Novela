package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: reb  reason: default package */
/* loaded from: classes3.dex */
public final class reb {
    public static final qeb Companion = new Object();
    public final String a;
    public final long b;

    public /* synthetic */ reb(String str, long j, int i) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = 0L;
        } else {
            this.b = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof reb)) {
            return false;
        }
        reb rebVar = (reb) obj;
        if (c16.i(this.a, rebVar.a) && this.b == rebVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SyncSearch(key=" + this.a + ", createAt=" + this.b + ")";
    }

    public reb(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }
}
