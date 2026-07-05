package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tjc  reason: default package */
/* loaded from: classes.dex */
public final class tjc {
    public static final tjc b;
    public final qs5 a;

    static {
        ms5 ms5Var = qs5.b;
        b = new tjc(mm9.e);
        a2d.K(0);
    }

    public tjc(mm9 mm9Var) {
        this.a = qs5.l(mm9Var);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            qs5 qs5Var = this.a;
            if (i2 >= qs5Var.size()) {
                return false;
            }
            sjc sjcVar = (sjc) qs5Var.get(i2);
            boolean[] zArr = sjcVar.e;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (zArr[i3]) {
                    if (sjcVar.b.c == i) {
                        return true;
                    }
                } else {
                    i3++;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tjc.class == obj.getClass()) {
            return this.a.equals(((tjc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
