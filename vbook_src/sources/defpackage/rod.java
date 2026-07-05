package defpackage;

import nl.adaptivity.xmlutil.EventType;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rod  reason: default package */
/* loaded from: classes3.dex */
public final class rod extends wod {
    public final /* synthetic */ int d = 1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rod(defpackage.yod r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            r0 = 1
            r2.d = r0
            nl.adaptivity.xmlutil.EventType r0 = nl.adaptivity.xmlutil.EventType.PROCESSING_INSTRUCTION
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r4 = 32
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r2.<init>(r3, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rod.<init>(yod, java.lang.String, java.lang.String):void");
    }

    @Override // defpackage.wod
    public String toString() {
        switch (this.d) {
            case 0:
                return this.b + " - \"" + this.c + "\" (" + this.a + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ rod(yod yodVar, EventType eventType, String str) {
        super(yodVar, eventType, str);
    }
}
