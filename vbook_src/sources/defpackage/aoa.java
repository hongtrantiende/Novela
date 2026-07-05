package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aoa  reason: default package */
/* loaded from: classes.dex */
public final class aoa extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aoa(long j, int i) {
        super(1);
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        long j = this.b;
        switch (i) {
            case 0:
                t15 t15Var = (t15) obj;
                t15Var.v(Float.intBitsToFloat((int) (j >> 32)));
                t15Var.l(Float.intBitsToFloat((int) (j & 4294967295L)));
                t15Var.Z0(y9e.j(nae.e, nae.e));
                return pvc.a;
            default:
                Long l = (Long) obj;
                if (l != null) {
                    hq7 hq7Var = wl3.b;
                    if (j > 0) {
                        return Long.valueOf(wl3.e(j) + l.longValue());
                    }
                    vs.m("Cannot call addTime with a negative duration");
                    return null;
                }
                vs.k("Start the timer with startTimer before calling addTime");
                return null;
        }
    }
}
