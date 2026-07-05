package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dwc  reason: default package */
/* loaded from: classes.dex */
public final class dwc {
    public static awc a(Object obj) {
        pw4 pw4Var = (pw4) obj;
        awc awcVar = pw4Var.c;
        if (awcVar == awc.e) {
            awc awcVar2 = new awc(0, new int[8], new Object[8], true);
            pw4Var.c = awcVar2;
            return awcVar2;
        }
        return awcVar;
    }

    public static boolean b(Object obj, vh1 vh1Var) {
        cl1 cl1Var = (cl1) vh1Var.e;
        int i = vh1Var.b;
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            return false;
                        }
                        if (i3 == 5) {
                            vh1Var.n0(5);
                            ((awc) obj).b((i2 << 3) | 5, Integer.valueOf(cl1Var.p0()));
                            return true;
                        }
                        throw p16.b();
                    }
                    awc awcVar = new awc(0, new int[8], new Object[8], true);
                    int i4 = i2 << 3;
                    int i5 = i4 | 4;
                    while (vh1Var.b() != Integer.MAX_VALUE && b(awcVar, vh1Var)) {
                    }
                    if (i5 == vh1Var.b) {
                        awcVar.d = false;
                        ((awc) obj).b(i4 | 3, awcVar);
                        return true;
                    }
                    throw new IOException("Protocol message end-group tag did not match expected tag.");
                }
                ((awc) obj).b((i2 << 3) | 2, vh1Var.p());
                return true;
            }
            vh1Var.n0(1);
            ((awc) obj).b((i2 << 3) | 1, Long.valueOf(cl1Var.q0()));
            return true;
        }
        vh1Var.n0(0);
        ((awc) obj).b(i2 << 3, Long.valueOf(cl1Var.s0()));
        return true;
    }
}
