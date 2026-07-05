package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e2f  reason: default package */
/* loaded from: classes.dex */
public final class e2f implements Comparable {
    public final long a;
    public final String b;
    public final int c;
    public final long d;
    public final Object e;
    public final RuntimeException f;

    public e2f(long j, String str, int i, long j2, Object obj) {
        boolean z;
        boolean z2;
        if (j != 0) {
            z = false;
        } else {
            z = true;
        }
        if (str == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        wq9.s(z == z2);
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = j2;
        this.e = obj;
        if (i == 5) {
            if (obj == null) {
                this.f = new NullPointerException("Null stringOrBytes");
                return;
            } else if (!(obj instanceof byte[]) && !(obj instanceof szd)) {
                this.f = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
                return;
            } else {
                this.f = null;
                return;
            }
        }
        this.f = null;
    }

    public final Object a() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                long j = this.d;
                if (i != 2) {
                    if (i != 3) {
                        Object obj = this.e;
                        if (i != 4) {
                            if (i == 5) {
                                obj.getClass();
                                try {
                                    if (obj instanceof byte[]) {
                                        return (byte[]) obj;
                                    }
                                    return ((szd) obj).j();
                                } catch (Throwable th) {
                                    RuntimeException runtimeException = this.f;
                                    if (runtimeException != null) {
                                        th.addSuppressed(runtimeException);
                                    }
                                    throw th;
                                }
                            }
                            vs.j("Impossible, this was validated when parsed or created");
                            return null;
                        }
                        obj.getClass();
                        return obj;
                    }
                    return Double.valueOf(Double.longBitsToDouble(j));
                }
                return Long.valueOf(j);
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e2f e2fVar = (e2f) obj;
        long j = e2fVar.a;
        long j2 = this.a;
        int compare = Long.compare(j2, j);
        if (compare == 0) {
            if (j2 != 0) {
                return 0;
            }
            String str = this.b;
            str.getClass();
            String str2 = e2fVar.b;
            str2.getClass();
            return str.compareTo(str2);
        }
        return compare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2f)) {
            return false;
        }
        e2f e2fVar = (e2f) obj;
        if (this.a == e2fVar.a && Objects.equals(this.b, e2fVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b);
    }

    public final String toString() {
        String str = this.b;
        if (str == null) {
            str = Long.toString(this.a);
        }
        String valueOf = String.valueOf(a());
        return nk2.v(new StringBuilder(String.valueOf(str).length() + 1 + valueOf.length()), str, ":", valueOf);
    }
}
