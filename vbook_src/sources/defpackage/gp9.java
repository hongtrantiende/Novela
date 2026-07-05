package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gp9  reason: default package */
/* loaded from: classes.dex */
public final class gp9 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public gp9(w2f w2fVar, AtomicReference atomicReference, d8f d8fVar) {
        this.a = 10;
        this.b = atomicReference;
        this.c = d8fVar;
        Objects.requireNonNull(w2fVar);
        this.d = w2fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0409  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gp9.run():void");
    }

    public String toString() {
        switch (this.a) {
            case 15:
                sid sidVar = (sid) this.d;
                StringBuilder sb = new StringBuilder(sidVar.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(sidVar);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ gp9(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ gp9(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ gp9(int i) {
        this.a = i;
    }
}
