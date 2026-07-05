package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rjc  reason: default package */
/* loaded from: classes.dex */
public final class rjc extends u57 {
    public final xy0 f;
    public iya g;

    public rjc(t3a t3aVar, su1 su1Var, r13 r13Var) {
        super(t3aVar, su1Var, r13Var);
        this.f = xpe.a(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bb, code lost:
        if (r16.j(r0, r7) == r10) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e4, code lost:
        if (((defpackage.lu4) r16.c).invoke(r3, r7) != r10) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e6, code lost:
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Type inference failed for: r3v5, types: [zl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.rjc r16, defpackage.t3a r17, defpackage.pjc r18, defpackage.n42 r19) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjc.k(rjc, t3a, pjc, n42):java.lang.Object");
    }

    public static pjc m(xy0 xy0Var) {
        pjc pjcVar = null;
        c9a O = h9a.O(new d(new yr7(xy0Var, 1), null, 5));
        while (O.hasNext()) {
            pjc pjcVar2 = (pjc) O.next();
            if (pjcVar != null) {
                pjcVar2 = pjcVar.a(pjcVar2);
            }
            pjcVar = pjcVar2;
        }
        return pjcVar;
    }

    public final boolean l(r09 r09Var) {
        boolean z;
        boolean z2;
        boolean z3;
        xy0 xy0Var;
        boolean z4;
        boolean z5;
        boolean z6;
        t3a t3aVar = (t3a) this.b;
        z09 z09Var = (z09) sl1.e0(r09Var.a);
        if (z09Var != null) {
            List b = z09Var.b();
            int size = b.size();
            int i = 0;
            z3 = false;
            while (true) {
                xy0Var = this.f;
                if (i >= size) {
                    break;
                }
                m65 m65Var = (m65) b.get(i);
                long j = m65Var.d ^ (-9223372034707292160L);
                if (t3aVar.j(t3aVar.f(j)) == nae.e) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6) {
                    if ((xy0Var.j(new pjc(j, m65Var.a, false)) instanceof ib1) && !z3) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = z09Var.l ^ (-9223372034707292160L);
            if (r09Var.f == 12) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (t3aVar.j(t3aVar.f(j2)) == nae.e) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5 || z4) {
                if (!(xy0Var.j(new pjc(j2, z09Var.b, z4)) instanceof ib1) || z3) {
                    z3 = true;
                }
            }
            if (z3 && !this.a) {
                return z2;
            }
            return z;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
        return z;
    }
}
