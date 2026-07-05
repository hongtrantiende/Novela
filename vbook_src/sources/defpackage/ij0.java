package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ij0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ij0 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n7a b;

    public /* synthetic */ ij0(n7a n7aVar, int i) {
        this.a = i;
        this.b = n7aVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        n7a n7aVar = this.b;
        switch (i) {
            case 0:
                AtomicLong atomicLong = n7aVar.d;
                long andIncrement = atomicLong.getAndIncrement();
                while (andIncrement == 0) {
                    andIncrement = atomicLong.getAndIncrement();
                }
                return Long.valueOf(andIncrement);
            default:
                AtomicLong atomicLong2 = n7aVar.d;
                long andIncrement2 = atomicLong2.getAndIncrement();
                while (andIncrement2 == 0) {
                    andIncrement2 = atomicLong2.getAndIncrement();
                }
                return Long.valueOf(andIncrement2);
        }
    }
}
