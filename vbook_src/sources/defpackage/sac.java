package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sac */
/* loaded from: classes3.dex */
public final class sac {
    public static final long b;
    public final zxa a;

    static {
        hq7 hq7Var = wl3.b;
        am3 am3Var = am3.MILLISECONDS;
        b = jue.P(4000L, am3Var);
        jue.O(10000, am3Var);
    }

    public sac(zxa zxaVar) {
        zxaVar.getClass();
        this.a = zxaVar;
    }

    public static /* synthetic */ void b(sac sacVar, String str) {
        sacVar.a(b, str);
    }

    public static void c(sac sacVar, String str) {
        sacVar.getClass();
        str.getClass();
        zxa zxaVar = sacVar.a;
        long e = wl3.e(b);
        zxaVar.getClass();
        zxaVar.b(new yxa(str, fsc.Info, by5.a.k().b() + e));
    }

    public static void d(sac sacVar, String str) {
        sacVar.getClass();
        str.getClass();
        zxa zxaVar = sacVar.a;
        long e = wl3.e(b);
        zxaVar.getClass();
        zxaVar.b(new yxa(str, fsc.Success, by5.a.k().b() + e));
    }

    public final void a(long j, String str) {
        str.getClass();
        long e = wl3.e(j);
        zxa zxaVar = this.a;
        zxaVar.getClass();
        zxaVar.b(new yxa(str, fsc.Error, by5.a.k().b() + e));
    }
}
