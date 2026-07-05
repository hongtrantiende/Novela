package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sid  reason: default package */
/* loaded from: classes.dex */
public final class sid implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public sid(yze yzeVar, AtomicReference atomicReference, String str, String str2) {
        this.a = 4;
        this.b = atomicReference;
        this.c = str;
        this.d = str2;
        Objects.requireNonNull(yzeVar);
        this.e = yzeVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:168|169|(5:171|(1:173)|175|176|177)|179|(2:182|180)|183|184|185|186|(2:189|187)|190|191|(1:193)|194|176|177) */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0513, code lost:
        if (java.lang.System.currentTimeMillis() >= (r5 + r9)) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x05e3, code lost:
        r1.c().E.f(r2, "Failed to parse queued batch. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01eb, code lost:
        if (r3.isEmpty() == false) goto L73;
     */
    /* JADX WARN: Type inference failed for: r5v16, types: [zm9, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sid.run():void");
    }

    public /* synthetic */ sid(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.a = i;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj;
    }

    public /* synthetic */ sid(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
