package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lyb  reason: default package */
/* loaded from: classes.dex */
public final class lyb {
    public final String a;
    public String b;
    public boolean c = false;
    public ol8 d = null;

    public lyb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyb)) {
            return false;
        }
        lyb lybVar = (lyb) obj;
        if (c16.i(this.a, lybVar.a) && c16.i(this.b, lybVar.b) && this.c == lybVar.c && c16.i(this.d, lybVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int k = eub.k(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ol8 ol8Var = this.d;
        if (ol8Var == null) {
            hashCode = 0;
        } else {
            hashCode = ol8Var.hashCode();
        }
        return k + hashCode;
    }

    public final String toString() {
        ol8 ol8Var = this.d;
        boolean z = this.c;
        return "TextSubstitution(layoutCache=" + ol8Var + ", isShowingSubstitution=" + z + ")";
    }
}
