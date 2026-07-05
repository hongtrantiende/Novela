package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t6b  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class t6b implements vt4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ g7b d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t6b(b7b b7bVar, String str, long j, wn5 wn5Var, g7b g7bVar) {
        this.b = str;
        this.c = j;
        this.e = wn5Var;
        this.d = g7bVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        g7b g7bVar = this.d;
        Object obj = this.e;
        long j = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                return "SubsamplingState. resetTileDecoder:" + str + ". skipped. parameters are not ready yet. subsamplingImage=" + g7bVar + ", contentSize=" + eh.C(j) + ", coroutineScope=" + ((m82) obj);
            default:
                StringBuilder o = a82.o("SubsamplingState. resetTileDecoder:", str, ". success. contentSize=");
                o.append(eh.C(j));
                o.append(", imageInfo=");
                o.append(((wn5) obj).a());
                o.append(". '");
                o.append(g7bVar.a());
                o.append('\'');
                return o.toString();
        }
    }

    public /* synthetic */ t6b(b7b b7bVar, String str, g7b g7bVar, long j, m41 m41Var) {
        this.b = str;
        this.d = g7bVar;
        this.c = j;
        this.e = m41Var;
    }
}
