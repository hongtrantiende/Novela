package defpackage;

import nl.adaptivity.xmlutil.EventType;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wod  reason: default package */
/* loaded from: classes3.dex */
public class wod extends xod {
    public final EventType b;
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wod(yod yodVar, EventType eventType, String str) {
        super(yodVar);
        eventType.getClass();
        this.b = eventType;
        this.c = str;
    }

    @Override // defpackage.xod
    public final EventType a() {
        throw null;
    }

    public String toString() {
        return this.b + " - \"" + this.c + "\" (" + this.a + ')';
    }
}
