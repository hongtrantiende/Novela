package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l18  reason: default package */
/* loaded from: classes.dex */
public final class l18 implements rb4 {
    public final mfb a;
    public final mfb b;
    public final s26 c;
    public final mfb d;

    public l18(vt4 vt4Var) {
        rh7 rh7Var = new rh7(25);
        k18 k18Var = k18.a;
        rh7 rh7Var2 = new rh7(26);
        this.a = new mfb(vt4Var);
        this.b = ipe.y(rh7Var);
        s26 s26Var = new s26(22, false);
        s26Var.b = k18Var;
        s26Var.c = abf.M;
        this.c = s26Var;
        this.d = ipe.y(rh7Var2);
    }

    @Override // defpackage.rb4
    public final sb4 a(Object obj, xe8 xe8Var, io5 io5Var) {
        lyc lycVar = (lyc) obj;
        if (!c16.i(lycVar.c, "http") && !c16.i(lycVar.c, "https")) {
            return null;
        }
        String str = lycVar.a;
        mfb mfbVar = this.a;
        mfb mfbVar2 = new mfb(new io0(io5Var, 4));
        mfb mfbVar3 = this.b;
        s26 s26Var = this.c;
        Context context = xe8Var.a;
        Object obj2 = s26Var.c;
        abf abfVar = abf.M;
        if (obj2 == abfVar) {
            synchronized (s26Var) {
                obj2 = s26Var.c;
                if (obj2 == abfVar) {
                    xt4 xt4Var = (xt4) s26Var.b;
                    xt4Var.getClass();
                    Object invoke = xt4Var.invoke(context);
                    s26Var.c = invoke;
                    s26Var.b = null;
                    obj2 = invoke;
                }
            }
        }
        return new p18(str, xe8Var, mfbVar, mfbVar2, mfbVar3, new fv5(obj2), this.d);
    }
}
