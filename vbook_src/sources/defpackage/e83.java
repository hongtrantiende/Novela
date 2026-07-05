package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e83  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class e83 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cz7 b;
    public final /* synthetic */ String c;

    public /* synthetic */ e83(cz7 cz7Var, String str) {
        this.a = 3;
        this.c = str;
        this.b = cz7Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        String str = this.c;
        cz7 cz7Var = this.b;
        switch (i) {
            case 0:
                ww4 ww4Var = (ww4) obj;
                ww4Var.getClass();
                mue.m(cz7Var, str, ww4Var.a, ww4Var.b);
                return pvcVar;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                lpe.t(cz7Var, str2, str);
                return pvcVar;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                lpe.t(cz7Var, str3, str);
                return pvcVar;
            case 3:
                g14 g14Var = (g14) obj;
                g14Var.getClass();
                String str4 = g14Var.a;
                String str5 = g14Var.d;
                if (str4.equals("detail")) {
                    if (str5.length() > 0) {
                        lpe.t(cz7Var, str5, str);
                    }
                } else if (str4.equals("list")) {
                    String str6 = g14Var.b;
                    s46 s46Var = v46.a;
                    Map s = o17.s(new yk8("script", g14Var.c), new yk8("input", str5));
                    s46Var.getClass();
                    c4b c4bVar = c4b.a;
                    mue.m(cz7Var, str, str6, s46Var.b(new b45(c4bVar, c4bVar, 1), s));
                }
                return pvcVar;
            default:
                String str7 = (String) obj;
                str7.getClass();
                lpe.t(cz7Var, str7, str);
                return pvcVar;
        }
    }

    public /* synthetic */ e83(cz7 cz7Var, String str, int i) {
        this.a = i;
        this.b = cz7Var;
        this.c = str;
    }
}
