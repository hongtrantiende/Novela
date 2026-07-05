package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: l69  reason: default package */
/* loaded from: classes.dex */
public final class l69 {
    public static final k69 Companion = new Object();
    public final int a;
    public final String b;

    public /* synthetic */ l69(int i, int i2, String str) {
        if (3 == (i & 3)) {
            this.a = i2;
            this.b = str;
            return;
        }
        w92.x(i, 3, j69.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l69)) {
            return false;
        }
        l69 l69Var = (l69) obj;
        if (this.a == l69Var.a && c16.i(this.b, l69Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessData(pid=");
        sb.append(this.a);
        sb.append(", uuid=");
        return s21.p(sb, this.b, ')');
    }

    public l69(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }
}
