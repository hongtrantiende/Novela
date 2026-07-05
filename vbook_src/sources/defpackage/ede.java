package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ede  reason: default package */
/* loaded from: classes.dex */
public final class ede implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ xke c;

    public ede(gge ggeVar, long j) {
        this.b = j;
        Objects.requireNonNull(ggeVar);
        this.c = ggeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        xke xkeVar = this.c;
        switch (i) {
            case 0:
                ((gge) xkeVar).d0(j);
                return;
            default:
                b1f b1fVar = (b1f) xkeVar;
                gge ggeVar = ((lte) b1fVar.a).J;
                lte.j(ggeVar);
                ggeVar.a0(j);
                b1fVar.e = null;
                return;
        }
    }

    public ede(b1f b1fVar, long j) {
        this.b = j;
        Objects.requireNonNull(b1fVar);
        this.c = b1fVar;
    }
}
