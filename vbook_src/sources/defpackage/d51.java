package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d51  reason: default package */
/* loaded from: classes.dex */
public final class d51 {
    public final evb a;

    public d51(evb evbVar) {
        this.a = evbVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d51) {
                evb evbVar = this.a;
                ps psVar = evbVar.a;
                evb evbVar2 = ((d51) obj).a;
                if (c16.i(psVar, evbVar2.a) && evbVar.b.d(evbVar2.b) && c16.i(evbVar.c, evbVar2.c) && evbVar.d == evbVar2.d && evbVar.e == evbVar2.e && evbVar.f == evbVar2.f && c16.i(evbVar.g, evbVar2.g) && evbVar.h == evbVar2.h && evbVar.i == evbVar2.i && x02.c(evbVar.j, evbVar2.j)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        evb evbVar = this.a;
        int hashCode = evbVar.a.hashCode() * 31;
        oyb oybVar = evbVar.b;
        uva uvaVar = oybVar.a;
        long j = uvaVar.b;
        f4c[] f4cVarArr = e4c.b;
        int hashCode2 = Long.hashCode(j) * 31;
        dq4 dq4Var = uvaVar.c;
        int i10 = 0;
        if (dq4Var != null) {
            i = dq4Var.a;
        } else {
            i = 0;
        }
        int i11 = (hashCode2 + i) * 31;
        wp4 wp4Var = uvaVar.d;
        if (wp4Var != null) {
            i2 = Integer.hashCode(wp4Var.a);
        } else {
            i2 = 0;
        }
        int i12 = (i11 + i2) * 31;
        xp4 xp4Var = uvaVar.e;
        if (xp4Var != null) {
            i3 = Integer.hashCode(xp4Var.a);
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 31;
        eo4 eo4Var = uvaVar.f;
        if (eo4Var != null) {
            i4 = eo4Var.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 31;
        String str = uvaVar.g;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int c = hl5.c((i14 + i5) * 31, uvaVar.h, 31);
        oi0 oi0Var = uvaVar.i;
        if (oi0Var != null) {
            i6 = Float.hashCode(oi0Var.a);
        } else {
            i6 = 0;
        }
        int i15 = (c + i6) * 31;
        nub nubVar = uvaVar.j;
        if (nubVar != null) {
            i7 = nubVar.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 31;
        ov6 ov6Var = uvaVar.k;
        if (ov6Var != null) {
            i8 = ov6Var.a.hashCode();
        } else {
            i8 = 0;
        }
        long j2 = uvaVar.l;
        int i17 = zl1.j;
        int c2 = hl5.c((i16 + i8) * 31, j2, 31);
        zx8 zx8Var = uvaVar.o;
        if (zx8Var != null) {
            i9 = zx8Var.hashCode();
        } else {
            i9 = 0;
        }
        int hashCode3 = (oybVar.b.hashCode() + ((c2 + i9) * 31)) * 31;
        gy8 gy8Var = oybVar.c;
        if (gy8Var != null) {
            i10 = gy8Var.hashCode();
        }
        int a = hl5.a(evbVar.f, eub.k((eub.l((hashCode3 + i10 + hashCode) * 31, evbVar.c, 31) + evbVar.d) * 31, 31, evbVar.e), 31);
        int hashCode4 = evbVar.h.hashCode();
        return Long.hashCode(evbVar.j) + ((evbVar.i.hashCode() + ((hashCode4 + ((evbVar.g.hashCode() + a) * 31)) * 31)) * 31);
    }
}
