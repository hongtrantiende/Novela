package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: grb  reason: default package */
/* loaded from: classes.dex */
public final class grb implements CharSequence {
    public final yk8 C;
    public final List a;
    public final List b;
    public final hub c;
    public final CharSequence d;
    public final long e;
    public final fxb f;

    public grb(CharSequence charSequence, long j, fxb fxbVar, yk8 yk8Var, List list, List list2, hub hubVar, int i) {
        CharSequence charSequence2;
        fxb fxbVar2;
        fxbVar = (i & 4) != 0 ? null : fxbVar;
        yk8Var = (i & 8) != 0 ? null : yk8Var;
        list = (i & 16) != 0 ? null : list;
        list2 = (i & 32) != 0 ? null : list2;
        hubVar = (i & 64) != 0 ? null : hubVar;
        this.a = list;
        this.b = list2;
        this.c = hubVar;
        if (charSequence instanceof grb) {
            charSequence2 = ((grb) charSequence).d;
        } else {
            charSequence2 = charSequence;
        }
        this.d = charSequence2;
        this.e = sze.d(charSequence.length(), j);
        if (fxbVar != null) {
            fxbVar2 = new fxb(sze.d(charSequence.length(), fxbVar.a));
        } else {
            fxbVar2 = null;
        }
        this.f = fxbVar2;
        this.C = yk8Var != null ? new yk8(yk8Var.a, new fxb(sze.d(charSequence.length(), ((fxb) yk8Var.b).a))) : null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.d.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || grb.class != obj.getClass()) {
            return false;
        }
        grb grbVar = (grb) obj;
        if (!fxb.c(this.e, grbVar.e) || !c16.i(this.f, grbVar.f) || !c16.i(this.C, grbVar.C) || !c16.i(this.a, grbVar.a)) {
            return false;
        }
        if (r4b.E(this.d, grbVar.d) && c16.i(this.c, grbVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = fxb.c;
        int c = hl5.c(this.d.hashCode() * 31, this.e, 31);
        int i5 = 0;
        fxb fxbVar = this.f;
        if (fxbVar != null) {
            i = Long.hashCode(fxbVar.a);
        } else {
            i = 0;
        }
        int i6 = (c + i) * 31;
        yk8 yk8Var = this.C;
        if (yk8Var != null) {
            i2 = yk8Var.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        List list = this.a;
        if (list != null) {
            i3 = list.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        hub hubVar = this.c;
        if (hubVar != null) {
            i5 = hubVar.hashCode();
        }
        return i8 + i5;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.d.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.d.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.d.toString();
    }
}
