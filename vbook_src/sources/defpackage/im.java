package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: im  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class im implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;

    public /* synthetic */ im(int i, xt4 xt4Var) {
        this.a = i;
        this.b = xt4Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        double d;
        lm3 lm3Var;
        int i;
        int i2 = this.a;
        boolean z = true;
        xt4 xt4Var = this.b;
        switch (i2) {
            case 0:
                nm nmVar = (nm) obj;
                nmVar.getClass();
                return nmVar.i(xt4Var);
            case 1:
                Long l = (Long) obj;
                l.longValue();
                xt4Var.invoke(l);
                return pvc.a;
            case 2:
                String str = (String) obj;
                str.getClass();
                xt4Var.invoke(str);
                return pvc.a;
            case 3:
                Integer num = (Integer) obj;
                num.intValue();
                xt4Var.invoke(num);
                return pvc.a;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                xt4Var.invoke(bool);
                return pvc.a;
            case 5:
                xt4Var.invoke((y78) obj);
                return pvc.a;
            case 6:
                sm3 sm3Var = (sm3) obj;
                if (sm3Var != null && (lm3Var = (lm3) xt4Var.invoke(sm3Var)) != null) {
                    d = lm3Var.a(sm3Var);
                } else {
                    d = 50.0d;
                }
                return Double.valueOf(d);
            case 7:
                rnc rncVar = (rnc) obj;
                ax4 ax4Var = null;
                if (rncVar instanceof cx4) {
                    ax4 ax4Var2 = ((cx4) rncVar).K;
                    if (ax4Var2 != null) {
                        ax4Var = ax4Var2;
                    }
                    if (ax4Var != null) {
                        z = ((Boolean) xt4Var.invoke(ax4Var)).booleanValue();
                    }
                    return Boolean.valueOf(z);
                }
                vs.k("Node is not a GestureNode instance");
                return null;
            case 8:
                ((Boolean) obj).booleanValue();
                xt4Var.invoke("");
                return pvc.a;
            case 9:
                go0 go0Var = (go0) obj;
                go0Var.getClass();
                xt4Var.invoke(go0Var.c);
                return pvc.a;
            case 10:
                f76 f76Var = (f76) obj;
                if (f76Var != null) {
                    xt4Var.invoke(f76Var);
                }
                return pvc.a;
            case 11:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                xt4Var.invoke(bool2);
                return pvc.a;
            case 12:
                Float f = (Float) obj;
                f.floatValue();
                xt4Var.invoke(f);
                return pvc.a;
            case 13:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                xt4Var.invoke(bool3);
                return pvc.a;
            case 14:
                Integer num2 = (Integer) obj;
                num2.intValue();
                xt4Var.invoke(num2);
                return pvc.a;
            case 15:
                Float f2 = (Float) obj;
                f2.floatValue();
                xt4Var.invoke(f2);
                return pvc.a;
            case 16:
                Float f3 = (Float) obj;
                f3.floatValue();
                xt4Var.invoke(f3);
                return pvc.a;
            case 17:
                Float f4 = (Float) obj;
                f4.floatValue();
                xt4Var.invoke(f4);
                return pvc.a;
            case 18:
                Float f5 = (Float) obj;
                f5.floatValue();
                xt4Var.invoke(f5);
                return pvc.a;
            case 19:
                Integer num3 = (Integer) obj;
                num3.intValue();
                xt4Var.invoke(num3);
                return pvc.a;
            case 20:
                Float f6 = (Float) obj;
                f6.floatValue();
                xt4Var.invoke(f6);
                return pvc.a;
            case 21:
                xt4Var.invoke(Integer.valueOf(((Integer) obj).intValue() - 1));
                return pvc.a;
            case 22:
                xt4Var.invoke(Float.valueOf(dce.m(((int) (((Float) obj).floatValue() / 0.05f)) * 0.05f, 0.25f, 3.0f)));
                return pvc.a;
            case 23:
                nx5 nx5Var = (nx5) obj;
                nx5Var.getClass();
                nx5Var.b.b(xt4Var, "offset");
                return pvc.a;
            case 24:
                String str2 = (String) obj;
                str2.getClass();
                Integer R = r4b.R(10, str2);
                if (R != null) {
                    i = R.intValue();
                } else {
                    i = 12;
                }
                if (i < 2) {
                    i = 2;
                }
                xt4Var.invoke(Integer.valueOf(i));
                return pvc.a;
            case 25:
                zqa zqaVar = (zqa) xt4Var.invoke((cra) obj);
                synchronized (dra.c) {
                    dra.d = dra.d.e(zqaVar.g());
                }
                return zqaVar;
            case 26:
                Long l2 = (Long) obj;
                l2.getClass();
                return xt4Var.invoke(l2);
            case 27:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                if (xt4Var != null) {
                    xt4Var.invoke(bool4);
                }
                return pvc.a;
            case 28:
                int intValue = ((Integer) obj).intValue();
                ycb.b.getClass();
                xt4Var.invoke(iv8.e(intValue));
                return pvc.a;
            default:
                jub jubVar = (jub) obj;
                jubVar.getClass();
                xt4Var.invoke(jubVar);
                return pvc.a;
        }
    }
}
