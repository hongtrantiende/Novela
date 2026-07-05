package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rf2  reason: default package */
/* loaded from: classes.dex */
public final class rf2 extends d34 {
    public final long a;
    public final long b;
    public final float[] c;
    public final yj d;

    public rf2(long j, float[] fArr) {
        long q = zr1.q(1);
        fArr.getClass();
        this.a = j;
        this.b = q;
        this.c = fArr;
        this.d = dk.a();
    }

    @Override // defpackage.d34
    public final qf2 a(fvb fvbVar) {
        fvbVar.getClass();
        ps psVar = fvbVar.a.a;
        return new qf2(this, psVar.e(0, psVar.b.length(), "dash_underline_span"), fvbVar, 0);
    }
}
