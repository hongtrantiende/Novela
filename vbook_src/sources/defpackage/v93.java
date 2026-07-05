package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v93  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class v93 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yya b;
    public final /* synthetic */ yt2 c;
    public final /* synthetic */ aw7 d;
    public final /* synthetic */ aw7 e;

    public /* synthetic */ v93(yt2 yt2Var, yya yyaVar, aw7 aw7Var, aw7 aw7Var2, int i) {
        this.a = i;
        this.c = yt2Var;
        this.b = yyaVar;
        this.d = aw7Var;
        this.e = aw7Var2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        long v;
        long v2;
        long v3;
        long v4;
        String str = "null";
        switch (this.a) {
            case 0:
                yya yyaVar = this.b;
                yt2 yt2Var = this.c;
                aw7 aw7Var = this.d;
                aw7 aw7Var2 = this.e;
                String str2 = (String) obj;
                str2.getClass();
                aw7Var.setValue(Boolean.FALSE);
                aw7Var2.setValue(new zl1(kve.v(str2)));
                ar4 ar4Var = (ar4) yyaVar.getValue();
                long x = sve.x(v) & 4294967295L;
                String str3 = ar4Var.c;
                if (str3 != null) {
                    str = pm0.a(str3);
                }
                String str4 = "pick text color hex=" + str2 + " argb=" + x + " focused=" + str + " canFormat=" + ar4Var.b + " collapsed=" + ar4Var.d;
                if (jy.a()) {
                    kw6 kw6Var = kw6.b;
                    iea ieaVar = iea.b;
                    if (kw6Var.a.a.compareTo(ieaVar) <= 0) {
                        kw6Var.a(ieaVar, "CreateTopicToolbar", str4, null);
                    }
                }
                iva ivaVar = new iva(sve.x(v) & 4294967295L);
                if (ar4Var.d) {
                    yt2Var.b(ivaVar);
                } else {
                    zq4 a = yt2Var.a();
                    if (a != null) {
                        yt2Var.c.a(a.a, a.b, a.c, ivaVar);
                    }
                }
                return pvc.a;
            case 1:
                yya yyaVar2 = this.b;
                yt2 yt2Var2 = this.c;
                aw7 aw7Var3 = this.d;
                aw7 aw7Var4 = this.e;
                String str5 = (String) obj;
                str5.getClass();
                aw7Var3.setValue(Boolean.FALSE);
                aw7Var4.setValue(new zl1(kve.v(str5)));
                ar4 ar4Var2 = (ar4) yyaVar2.getValue();
                long x2 = sve.x(v2) & 4294967295L;
                String str6 = ar4Var2.c;
                if (str6 != null) {
                    str = pm0.a(str6);
                }
                String str7 = "pick bg color hex=" + str5 + " argb=" + x2 + " focused=" + str + " canFormat=" + ar4Var2.b + " collapsed=" + ar4Var2.d;
                if (jy.a()) {
                    kw6 kw6Var2 = kw6.b;
                    iea ieaVar2 = iea.b;
                    if (kw6Var2.a.a.compareTo(ieaVar2) <= 0) {
                        kw6Var2.a(ieaVar2, "CreateTopicToolbar", str7, null);
                    }
                }
                jva jvaVar = new jva(sve.x(v2) & 4294967295L);
                if (ar4Var2.d) {
                    yt2Var2.b(jvaVar);
                } else {
                    zq4 a2 = yt2Var2.a();
                    if (a2 != null) {
                        yt2Var2.c.a(a2.a, a2.b, a2.c, jvaVar);
                    }
                }
                return pvc.a;
            case 2:
                yt2 yt2Var3 = this.c;
                yya yyaVar3 = this.b;
                aw7 aw7Var5 = this.d;
                aw7 aw7Var6 = this.e;
                String str8 = (String) obj;
                str8.getClass();
                aw7Var5.setValue(Boolean.FALSE);
                aw7Var6.setValue(new zl1(kve.v(str8)));
                iva ivaVar2 = new iva(sve.x(v3) & 4294967295L);
                if (((ar4) yyaVar3.getValue()).d) {
                    yt2Var3.b(ivaVar2);
                } else {
                    zq4 a3 = yt2Var3.a();
                    if (a3 != null) {
                        yt2Var3.c.a(a3.a, a3.b, a3.c, ivaVar2);
                    }
                }
                return pvc.a;
            default:
                yt2 yt2Var4 = this.c;
                yya yyaVar4 = this.b;
                aw7 aw7Var7 = this.d;
                aw7 aw7Var8 = this.e;
                String str9 = (String) obj;
                str9.getClass();
                aw7Var7.setValue(Boolean.FALSE);
                aw7Var8.setValue(new zl1(kve.v(str9)));
                jva jvaVar2 = new jva(sve.x(v4) & 4294967295L);
                if (((ar4) yyaVar4.getValue()).d) {
                    yt2Var4.b(jvaVar2);
                } else {
                    zq4 a4 = yt2Var4.a();
                    if (a4 != null) {
                        yt2Var4.c.a(a4.a, a4.b, a4.c, jvaVar2);
                    }
                }
                return pvc.a;
        }
    }

    public /* synthetic */ v93(yya yyaVar, yt2 yt2Var, aw7 aw7Var, aw7 aw7Var2, int i) {
        this.a = i;
        this.b = yyaVar;
        this.c = yt2Var;
        this.d = aw7Var;
        this.e = aw7Var2;
    }
}
