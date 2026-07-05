package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yu1 implements ru4 {
    @Override // defpackage.ru4
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Number number) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        nq7 nq7Var = (nq7) obj;
        String str = (String) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        n32 n32Var = (n32) obj4;
        mu4 mu4Var = (mu4) obj5;
        vt4 vt4Var = (vt4) obj6;
        rv4 rv4Var = (rv4) obj7;
        int intValue = ((Integer) number).intValue();
        if ((intValue & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i = i7 | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            if (rv4Var.f(str)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i |= i6;
        }
        if ((intValue & 384) == 0) {
            if (rv4Var.g(booleanValue)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i |= i5;
        }
        if ((intValue & 3072) == 0) {
            if (rv4Var.f(n32Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i |= i4;
        }
        if ((intValue & 24576) == 0) {
            if (rv4Var.h(mu4Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i |= i3;
        }
        if ((intValue & 196608) == 0) {
            if (rv4Var.h(vt4Var)) {
                i2 = 131072;
            } else {
                i2 = Parser.ARGC_LIMIT;
            }
            i |= i2;
        }
        if ((599187 & i) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            e42.c(str, booleanValue, n32Var, nq7Var, mu4Var, vt4Var, rv4Var, ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i) | (i & 458752));
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }
}
