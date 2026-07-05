package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: os  reason: default package */
/* loaded from: classes.dex */
public final class os {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public os(int i, String str, Object obj, int i2) {
        boolean z;
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            mv5.a("Reversed range is not supported");
        }
    }

    public static os a(os osVar, ls lsVar, int i, int i2, int i3) {
        Object obj = lsVar;
        if ((i3 & 1) != 0) {
            obj = osVar.a;
        }
        if ((i3 & 2) != 0) {
            i = osVar.b;
        }
        if ((i3 & 4) != 0) {
            i2 = osVar.c;
        }
        String str = osVar.d;
        osVar.getClass();
        return new os(i, str, obj, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os)) {
            return false;
        }
        os osVar = (os) obj;
        if (c16.i(this.a, osVar.a) && this.b == osVar.b && this.c == osVar.c && c16.i(this.d, osVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.d.hashCode() + hl5.a(this.c, hl5.a(this.b, hashCode * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }

    public os(Object obj, int i, int i2) {
        this(i, "", obj, i2);
    }
}
