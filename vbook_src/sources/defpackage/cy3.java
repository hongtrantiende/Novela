package defpackage;

import nl.adaptivity.xmlutil.EventType;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cy3  reason: default package */
/* loaded from: classes3.dex */
public final class cy3 extends EventType {
    @Override // nl.adaptivity.xmlutil.EventType
    public final xod createEvent(zod zodVar) {
        zodVar.getClass();
        oa6 oa6Var = (oa6) zodVar;
        yod Q = oa6Var.Q();
        String j0 = oa6Var.j0();
        String S = oa6Var.S();
        String m0 = oa6Var.m0();
        xx7 xx7Var = oa6Var.O.d;
        sod sodVar = new sod(Q, j0, S, m0);
        yx7 yx7Var = xx7Var.a;
        String[] strArr = (String[]) b00.e0(yx7Var.a, 0, yx7Var.f() * 2);
        return sodVar;
    }

    @Override // nl.adaptivity.xmlutil.EventType
    public final void writeEvent(epd epdVar, zod zodVar) {
        throw null;
    }
}
