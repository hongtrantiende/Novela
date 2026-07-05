package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ms  reason: default package */
/* loaded from: classes.dex */
public final class ms {
    public final Object a;
    public final int b;
    public int c;
    public final String d;

    public /* synthetic */ ms(int i, int i2, int i3, Object obj, String str) {
        this(i, (i3 & 8) != 0 ? "" : str, obj, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2);
    }

    public final os a(int i) {
        boolean z;
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (i != Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            mv5.c("Item.end should be set first");
        }
        return new os(this.b, this.d, this.a, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms)) {
            return false;
        }
        ms msVar = (ms) obj;
        if (c16.i(this.a, msVar.a) && this.b == msVar.b && this.c == msVar.c && c16.i(this.d, msVar.d)) {
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
        int i = this.c;
        return "MutableRange(item=" + this.a + ", start=" + this.b + ", end=" + i + ", tag=" + this.d + ")";
    }

    public ms(int i, String str, Object obj, int i2) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }
}
