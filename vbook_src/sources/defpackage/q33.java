package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: q33  reason: default package */
/* loaded from: classes3.dex */
public final class q33 implements lz7 {
    public static final p33 Companion = new Object();
    public final String a;
    public final String b;

    public /* synthetic */ q33(String str, String str2, int i) {
        if (1 == (i & 1)) {
            this.a = str;
            if ((i & 2) == 0) {
                this.b = null;
                return;
            } else {
                this.b = str2;
                return;
            }
        }
        w92.x(i, 1, o33.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q33)) {
            return false;
        }
        q33 q33Var = (q33) obj;
        if (c16.i(this.a, q33Var.a) && c16.i(this.b, q33Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return hl5.o("DetailRoute(path=", this.a, ", extensionId=", this.b, ")");
    }

    public q33(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }
}
