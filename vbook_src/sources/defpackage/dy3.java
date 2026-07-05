package defpackage;

import nl.adaptivity.xmlutil.EventType;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dy3  reason: default package */
/* loaded from: classes3.dex */
public final class dy3 extends EventType {
    @Override // nl.adaptivity.xmlutil.EventType
    public final xod createEvent(zod zodVar) {
        zodVar.getClass();
        oa6 oa6Var = (oa6) zodVar;
        yod Q = oa6Var.Q();
        oa6Var.S();
        return new rod(Q, EventType.ENTITY_REF, oa6Var.I0());
    }

    @Override // nl.adaptivity.xmlutil.EventType
    public final boolean isTextElement() {
        return true;
    }

    @Override // nl.adaptivity.xmlutil.EventType
    public final void writeEvent(epd epdVar, wod wodVar) {
        throw null;
    }

    @Override // nl.adaptivity.xmlutil.EventType
    public final void writeEvent(epd epdVar, zod zodVar) {
        throw null;
    }
}
