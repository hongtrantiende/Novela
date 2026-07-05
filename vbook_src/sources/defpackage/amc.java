package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: amc  reason: default package */
/* loaded from: classes3.dex */
public final class amc {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final tmc f;
    public final vmc g;
    public final vmc h;

    public amc(boolean z, boolean z2, boolean z3, boolean z4, String str, tmc tmcVar, vmc vmcVar, vmc vmcVar2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = tmcVar;
        this.g = vmcVar;
        this.h = vmcVar2;
    }

    public static amc a(amc amcVar, boolean z, boolean z2, boolean z3, boolean z4, String str, tmc tmcVar, vmc vmcVar, vmc vmcVar2, int i) {
        vmc vmcVar3;
        vmc vmcVar4;
        if ((i & 1) != 0) {
            z = amcVar.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = amcVar.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = amcVar.c;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = amcVar.d;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            str = amcVar.e;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            tmcVar = amcVar.f;
        }
        tmc tmcVar2 = tmcVar;
        if ((i & 64) != 0) {
            vmcVar3 = amcVar.g;
        } else {
            vmcVar3 = vmcVar;
        }
        if ((i & Token.CASE) != 0) {
            vmcVar4 = amcVar.h;
        } else {
            vmcVar4 = vmcVar2;
        }
        amcVar.getClass();
        return new amc(z5, z6, z7, z8, str2, tmcVar2, vmcVar3, vmcVar4);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof amc) {
                amc amcVar = (amc) obj;
                if (this.a != amcVar.a || this.b != amcVar.b || this.c != amcVar.c || this.d != amcVar.d || !this.e.equals(amcVar.e) || !c16.i(this.f, amcVar.f) || !c16.i(this.g, amcVar.g) || !c16.i(this.h, amcVar.h)) {
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
        int hashCode2;
        int j = eub.j(eub.k(eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        int i = 0;
        tmc tmcVar = this.f;
        if (tmcVar == null) {
            hashCode = 0;
        } else {
            hashCode = tmcVar.hashCode();
        }
        int i2 = (j + hashCode) * 31;
        vmc vmcVar = this.g;
        if (vmcVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = vmcVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        vmc vmcVar2 = this.h;
        if (vmcVar2 != null) {
            i = vmcVar2.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder p = rs8.p("TranslateState(isTranslateEnabled=", this.a, ", isTranslating=", this.b, ", isShowRaw=");
        rs8.z(p, this.c, ", isSupportTranslate=", this.d, ", detectLanguage=");
        p.append(this.e);
        p.append(", currentEngine=");
        p.append(this.f);
        p.append(", fromLanguage=");
        p.append(this.g);
        p.append(", toLanguage=");
        p.append(this.h);
        p.append(")");
        return p.toString();
    }
}
