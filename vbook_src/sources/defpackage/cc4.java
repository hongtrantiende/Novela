package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cc4  reason: default package */
/* loaded from: classes3.dex */
public final class cc4 {
    public final String a;
    public final String b;
    public final String c;
    public int d = -1;

    public cc4(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cc4)) {
            return false;
        }
        cc4 cc4Var = (cc4) obj;
        if (!this.a.equals(cc4Var.a) || !this.b.equals(cc4Var.b) || !this.c.equals(cc4Var.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.d == -1) {
            this.d = (this.a.hashCode() ^ this.b.hashCode()) ^ this.c.hashCode();
        }
        return this.d;
    }
}
