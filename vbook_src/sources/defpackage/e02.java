package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e02  reason: default package */
/* loaded from: classes3.dex */
public final class e02 {
    public int a;
    public String b;
    public String c;
    public int d;

    public final boolean equals(Object obj) {
        String str = this.c;
        String str2 = this.b;
        int i = this.a;
        if (obj instanceof e02) {
            e02 e02Var = (e02) obj;
            String str3 = e02Var.c;
            String str4 = e02Var.b;
            if (i == e02Var.a && str2.equals(str4) && str.equals(str3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }
}
