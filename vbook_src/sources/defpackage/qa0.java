package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qa0  reason: default package */
/* loaded from: classes.dex */
public final class qa0 {
    public final long a;
    public final long b;
    public final long c;

    public qa0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        long j4 = e4c.c;
        if (!e4c.a(j, j4)) {
            if (!e4c.a(j2, j4)) {
                if (!e4c.a(j3, j4)) {
                    if (f4c.a(e4c.b(j), e4c.b(j2))) {
                        zr1.l(j, j2);
                        if (Float.compare(e4c.c(j), e4c.c(j2)) > 0) {
                            this.a = j2;
                        }
                    }
                    if (f4c.a(e4c.b(j3), 4294967296L)) {
                        long x = zr1.x(1.0E-4f, 4294967296L);
                        zr1.l(j3, x);
                        if (Float.compare(e4c.c(j3), e4c.c(x)) < 0) {
                            vs.m("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
                            throw null;
                        }
                    }
                    if (e4c.c(this.a) >= nae.e) {
                        if (e4c.c(j2) >= nae.e) {
                            return;
                        }
                        vs.m("AutoSize.StepBased: maxFontSize must not be negative");
                        throw null;
                    }
                    vs.m("AutoSize.StepBased: minFontSize must not be negative");
                    throw null;
                }
                vs.m("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
                throw null;
            }
            vs.m("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
            throw null;
        }
        vs.m("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
        throw null;
    }

    public static boolean a(fvb fvbVar) {
        it7 it7Var = fvbVar.b;
        long j = fvbVar.c;
        int i = fvbVar.a.f;
        if (i == 1 || i == 3) {
            if (((int) (j >> 32)) >= it7Var.d && !fvbVar.d()) {
                return false;
            }
            return true;
        } else if (i == 4 || i == 5 || i == 2) {
            int i2 = it7Var.f;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i == 4 || i == 5) {
                        if (((int) (j >> 32)) >= it7Var.d && !fvbVar.d()) {
                            return false;
                        }
                        return true;
                    } else if (i == 2) {
                        return fvbVar.l(i2 - 1);
                    }
                } else {
                    return fvbVar.l(0);
                }
            }
            return false;
        } else {
            vs.m(hl5.n("TextOverflow type ", vye.s(i), " is not supported."));
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof qa0)) {
            return false;
        }
        qa0 qa0Var = (qa0) obj;
        if (e4c.a(qa0Var.a, this.a) && e4c.a(qa0Var.b, this.b) && e4c.a(qa0Var.c, this.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        f4c[] f4cVarArr = e4c.b;
        return Long.hashCode(this.c) + hl5.c(Long.hashCode(this.a) * 31, this.b, 31);
    }
}
