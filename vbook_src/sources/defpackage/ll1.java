package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ll1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ll1 implements vt4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ll1(m10 m10Var, long j, Object obj) {
        this.c = m10Var;
        this.b = j;
        this.d = obj;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        String str;
        int i = this.a;
        long j = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                m10 m10Var = (m10) obj2;
                if (m10Var instanceof k10) {
                    str = "Loading";
                } else if (m10Var instanceof l10) {
                    str = "Success";
                } else if (m10Var instanceof j10) {
                    str = "Error";
                } else if (m10Var instanceof i10) {
                    str = "Empty";
                } else {
                    xk5.o();
                    return null;
                }
                StringBuilder y = nk2.y("CoilZoomAsyncImage. ", str, ". contentSize=", zy5.c(j), ". data='");
                y.append(obj);
                y.append("'");
                return y.toString();
            default:
                yrd yrdVar = (yrd) obj2;
                StringBuilder sb = new StringBuilder("ZoomableState. fling. end. offset=");
                yrdVar.getClass();
                sb.append(mue.t(yrdVar.r.b));
                sb.append(", bounds=");
                sb.append(fpe.x((sk9) obj));
                sb.append(", velocity=");
                sb.append(mue.t(j));
                return sb.toString();
        }
    }

    public /* synthetic */ ll1(yrd yrdVar, sk9 sk9Var, long j) {
        this.c = yrdVar;
        this.d = sk9Var;
        this.b = j;
    }
}
