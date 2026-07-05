package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cwc  reason: default package */
/* loaded from: classes.dex */
public final class cwc {
    public static zvc a(Object obj) {
        ow4 ow4Var = (ow4) obj;
        zvc zvcVar = ow4Var.unknownFields;
        if (zvcVar == zvc.f) {
            zvc zvcVar2 = new zvc(0, new int[8], new Object[8], true);
            ow4Var.unknownFields = zvcVar2;
            return zvcVar2;
        }
        return zvcVar;
    }

    public static boolean b(int i, vh1 vh1Var, Object obj) {
        int i2 = vh1Var.b;
        xb1 xb1Var = (xb1) vh1Var.e;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            return false;
                        }
                        if (i4 == 5) {
                            vh1Var.n0(5);
                            ((zvc) obj).c(5 | (i3 << 3), Integer.valueOf(xb1Var.p()));
                            return true;
                        }
                        throw o16.b();
                    }
                    zvc zvcVar = new zvc(0, new int[8], new Object[8], true);
                    int i5 = i3 << 3;
                    int i6 = i5 | 4;
                    int i7 = i + 1;
                    if (i7 < 100) {
                        while (vh1Var.b() != Integer.MAX_VALUE && b(i7, vh1Var, zvcVar)) {
                        }
                        if (i6 == vh1Var.b) {
                            if (zvcVar.e) {
                                zvcVar.e = false;
                            }
                            ((zvc) obj).c(i5 | 3, zvcVar);
                            return true;
                        }
                        throw new IOException("Protocol message end-group tag did not match expected tag.");
                    }
                    throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                ((zvc) obj).c((i3 << 3) | 2, vh1Var.o());
                return true;
            }
            vh1Var.n0(1);
            ((zvc) obj).c((i3 << 3) | 1, Long.valueOf(xb1Var.q()));
            return true;
        }
        vh1Var.n0(0);
        ((zvc) obj).c(i3 << 3, Long.valueOf(xb1Var.t()));
        return true;
    }
}
