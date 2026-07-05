package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oeb  reason: default package */
/* loaded from: classes3.dex */
public final class oeb extends aab implements lu4 {
    public final /* synthetic */ aw7 C;
    public final /* synthetic */ aw7 D;
    public final /* synthetic */ aw7 E;
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xfd c;
    public final /* synthetic */ zm4 d;
    public final /* synthetic */ aw7 e;
    public final /* synthetic */ aw7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oeb(boolean z, xfd xfdVar, zm4 zm4Var, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, aw7 aw7Var4, aw7 aw7Var5, m42 m42Var) {
        super(2, m42Var);
        this.b = z;
        this.c = xfdVar;
        this.d = zm4Var;
        this.e = aw7Var;
        this.f = aw7Var2;
        this.C = aw7Var3;
        this.D = aw7Var4;
        this.E = aw7Var5;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new oeb(this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((oeb) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        int i = this.a;
        String str4 = null;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            if (this.b) {
                xfd xfdVar = this.c;
                if (xfdVar != null) {
                    str = xfdVar.a;
                } else {
                    str = null;
                }
                String str5 = "";
                if (str == null) {
                    str = "";
                }
                this.e.setValue(str);
                if (xfdVar != null) {
                    str2 = xfdVar.b;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                this.f.setValue(str2);
                if (xfdVar != null) {
                    str4 = xfdVar.c;
                }
                if (str4 != null) {
                    str5 = str4;
                }
                this.C.setValue(str5);
                String str6 = "vbook_backup";
                if (xfdVar != null && (str3 = xfdVar.d) != null && !k4b.j0(str3)) {
                    str6 = str3;
                }
                this.D.setValue(str6);
                this.E.setValue(Boolean.FALSE);
                hq7 hq7Var = wl3.b;
                long O = jue.O(100, am3.MILLISECONDS);
                this.a = 1;
                Object r = ade.r(O, this);
                n82 n82Var = n82.a;
                if (r == n82Var) {
                    return n82Var;
                }
            }
            return pvc.a;
        }
        zm4.a(this.d);
        return pvc.a;
    }
}
