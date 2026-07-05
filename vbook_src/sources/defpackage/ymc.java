package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ymc  reason: default package */
/* loaded from: classes3.dex */
public final class ymc {
    public final String a;
    public final int b;
    public final boolean c;

    public ymc(int i, String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ymc) {
                ymc ymcVar = (ymc) obj;
                if (!c16.i(this.a, ymcVar.a) || this.b != ymcVar.b || this.c != ymcVar.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + hl5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rs8.m(")", s21.s("Word(text=", this.a, ", type=", this.b, ", isPriv="), this.c);
    }
}
