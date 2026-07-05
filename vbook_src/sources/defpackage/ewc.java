package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ewc  reason: default package */
/* loaded from: classes.dex */
public final class ewc {
    public static bwc a(Object obj) {
        qw4 qw4Var = (qw4) obj;
        bwc bwcVar = qw4Var.unknownFields;
        if (bwcVar == bwc.f) {
            bwc bwcVar2 = new bwc(0, new int[8], new Object[8], true);
            qw4Var.unknownFields = bwcVar2;
            return bwcVar2;
        }
        return bwcVar;
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
                            ((bwc) obj).c(5 | (i3 << 3), Integer.valueOf(xb1Var.p()));
                            return true;
                        }
                        throw q16.b();
                    }
                    bwc bwcVar = new bwc(0, new int[8], new Object[8], true);
                    int i5 = i3 << 3;
                    int i6 = i5 | 4;
                    int i7 = i + 1;
                    if (i7 < 100) {
                        while (vh1Var.b() != Integer.MAX_VALUE && b(i7, vh1Var, bwcVar)) {
                        }
                        if (i6 == vh1Var.b) {
                            if (bwcVar.e) {
                                bwcVar.e = false;
                            }
                            ((bwc) obj).c(i5 | 3, bwcVar);
                            return true;
                        }
                        throw new IOException("Protocol message end-group tag did not match expected tag.");
                    }
                    throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                ((bwc) obj).c((i3 << 3) | 2, vh1Var.q());
                return true;
            }
            vh1Var.n0(1);
            ((bwc) obj).c((i3 << 3) | 1, Long.valueOf(xb1Var.q()));
            return true;
        }
        vh1Var.n0(0);
        ((bwc) obj).c(i3 << 3, Long.valueOf(xb1Var.t()));
        return true;
    }
}
