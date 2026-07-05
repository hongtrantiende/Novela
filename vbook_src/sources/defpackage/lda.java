package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lda  reason: default package */
/* loaded from: classes3.dex */
public final class lda {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final kb6 d;

    public lda(boolean z, boolean z2, String str, kb6 kb6Var) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = kb6Var;
    }

    public static lda a(lda ldaVar, boolean z, boolean z2, String str, kb6 kb6Var, int i) {
        if ((i & 1) != 0) {
            z = ldaVar.a;
        }
        if ((i & 2) != 0) {
            z2 = ldaVar.b;
        }
        if ((i & 4) != 0) {
            str = ldaVar.c;
        }
        if ((i & 8) != 0) {
            kb6Var = ldaVar.d;
        }
        ldaVar.getClass();
        ldaVar.getClass();
        str.getClass();
        return new lda(z, z2, str, kb6Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lda) {
                lda ldaVar = (lda) obj;
                if (this.a != ldaVar.a || this.b != ldaVar.b || !this.c.equals(ldaVar.c) || !c16.i(this.d, ldaVar.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int j = eub.j(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        kb6 kb6Var = this.d;
        if (kb6Var == null) {
            hashCode = 0;
        } else {
            hashCode = kb6Var.hashCode();
        }
        return (j + hashCode) * 31;
    }

    public final String toString() {
        StringBuilder p = rs8.p("SettingState(isDeveloperModeEnabled=", this.a, ", isDeveloperModeActive=", this.b, ", networkIP=");
        p.append(this.c);
        p.append(", currentLanguage=");
        p.append(this.d);
        p.append(", systemLanguage=null)");
        return p.toString();
    }
}
