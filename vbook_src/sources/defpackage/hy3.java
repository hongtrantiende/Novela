package defpackage;

import java.util.ArrayList;
import nl.adaptivity.xmlutil.EventType;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hy3  reason: default package */
/* loaded from: classes3.dex */
public final class hy3 extends EventType {
    @Override // nl.adaptivity.xmlutil.EventType
    public final xod createEvent(zod zodVar) {
        int i;
        zodVar.getClass();
        oa6 oa6Var = (oa6) zodVar;
        yod Q = oa6Var.Q();
        String j0 = oa6Var.j0();
        String S = oa6Var.S();
        String m0 = oa6Var.m0();
        int i2 = oa6Var.D;
        ood[] oodVarArr = new ood[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            yod Q2 = oa6Var.Q();
            String g0 = oa6Var.g0(i3);
            g0.getClass();
            String V = oa6Var.V(i3);
            V.getClass();
            String y0 = oa6Var.y0(i3);
            if (y0 == null) {
                y0 = "";
            }
            String N0 = oa6Var.N0(i3);
            N0.getClass();
            oodVarArr[i3] = new ood(Q2, g0, V, y0, N0);
        }
        yx7 yx7Var = oa6Var.O.d.a;
        vla vlaVar = new vla((String[]) b00.e0(yx7Var.a, 0, yx7Var.f() * 2));
        yx7 yx7Var2 = oa6Var.O;
        int i4 = yx7Var2.c;
        if (i4 == 0) {
            i = 0;
        } else {
            i = (yx7Var2.b[i4 - 1] * 2) >> 1;
        }
        int i5 = ((yx7Var2.b[i4] * 2) >> 1) - i;
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = i + i6;
            arrayList.add(new tod(yx7Var2.e(i7), yx7Var2.c(i7)));
        }
        return new vod(Q, j0, S, m0, oodVarArr, vlaVar, arrayList);
    }

    @Override // nl.adaptivity.xmlutil.EventType
    public final void writeEvent(epd epdVar, zod zodVar) {
        throw null;
    }
}
