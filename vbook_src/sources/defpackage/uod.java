package defpackage;

import nl.adaptivity.xmlutil.EventType;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uod  reason: default package */
/* loaded from: classes3.dex */
public final class uod extends xod {
    public final String b;
    public final String c;
    public final Boolean d;

    public uod(yod yodVar, String str, String str2, Boolean bool) {
        super(yodVar);
        this.b = str;
        this.c = str2;
        this.d = bool;
    }

    @Override // defpackage.xod
    public final EventType a() {
        throw null;
    }

    public final String toString() {
        return EventType.START_DOCUMENT + " - encoding:" + this.b + ", version: " + this.c + ", standalone: " + this.d + " (" + this.a + ')';
    }
}
