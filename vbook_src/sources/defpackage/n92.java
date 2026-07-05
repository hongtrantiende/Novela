package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n92  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n92 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n92(b60 b60Var, Object obj, long j) {
        this.c = b60Var;
        this.d = obj;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj;
                i92 i92Var = ((o92) obj2).g;
                va2 va2Var = i92Var.n;
                if (va2Var == null || !va2Var.e.get()) {
                    ((xd4) i92Var.i.b).l(j, str);
                    return;
                }
                return;
            default:
                c04 c04Var = ((b60) obj2).b;
                String str2 = a2d.a;
                i04 i04Var = c04Var.a;
                ms2 ms2Var = i04Var.r;
                cd M = ms2Var.M();
                ms2Var.N(M, 26, new nt1(M, obj, j));
                if (i04Var.V == obj) {
                    i04Var.m.e(26, new ls2(29));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ n92(o92 o92Var, long j, String str) {
        this.c = o92Var;
        this.b = j;
        this.d = str;
    }
}
