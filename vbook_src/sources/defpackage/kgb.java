package defpackage;

import android.view.View;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kgb  reason: default package */
/* loaded from: classes.dex */
public final class kgb extends hx5 {
    public x8d N;
    public yjd O;

    @Override // defpackage.ex5, defpackage.mq7
    public final void A1() {
        View o = xoe.o(this);
        yjd yjdVar = this.O;
        if (yjdVar != null) {
            int i = yjdVar.u - 1;
            yjdVar.u = i;
            if (i == 0) {
                Field field = rcd.a;
                kcd.b(o, null);
                rcd.d(o, null);
                o.removeOnAttachStateChangeListener(yjdVar.v);
            }
        }
        super.A1();
    }

    @Override // defpackage.ex5, defpackage.mq7
    public final void z1() {
        View o = xoe.o(this);
        WeakHashMap weakHashMap = yjd.w;
        yjd o2 = h88.o(o);
        o2.a(o);
        this.N.getClass();
        rp rpVar = o2.g;
        if (!c16.i(rpVar, this.M)) {
            this.M = rpVar;
            I1();
        }
        this.O = o2;
        super.z1();
    }
}
