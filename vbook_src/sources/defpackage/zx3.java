package defpackage;

import nl.adaptivity.xmlutil.EventType;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zx3  reason: default package */
/* loaded from: classes3.dex */
public final class zx3 extends EventType {
    @Override // nl.adaptivity.xmlutil.EventType
    public final xod createEvent(zod zodVar) {
        zodVar.getClass();
        oa6 oa6Var = (oa6) zodVar;
        return new wod(oa6Var.Q(), this, oa6Var.I0());
    }

    @Override // nl.adaptivity.xmlutil.EventType
    public final boolean isIgnorable() {
        return true;
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
