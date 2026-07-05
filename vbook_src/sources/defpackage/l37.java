package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l37  reason: default package */
/* loaded from: classes.dex */
public abstract class l37 extends sye {
    public final MeasurementManager d;

    public l37(MeasurementManager measurementManager) {
        this.d = measurementManager;
    }

    public static Object B(l37 l37Var, lgd lgdVar, m42 m42Var) {
        new f61(1, w92.t(m42Var)).u();
        MeasurementManager measurementManager = l37Var.d;
        throw null;
    }

    public static Object s(l37 l37Var, n13 n13Var, m42 m42Var) {
        new f61(1, w92.t(m42Var)).u();
        MeasurementManager measurementManager = l37Var.d;
        throw null;
    }

    public static Object t(l37 l37Var, m42 m42Var) {
        f61 f61Var = new f61(1, w92.t(m42Var));
        f61Var.u();
        l37Var.d.getMeasurementApiStatus(new az(1), new p42(f61Var));
        return f61Var.s();
    }

    public static Object v(l37 l37Var, gua guaVar, m42 m42Var) {
        Object p = k27.p(new db(l37Var, null, 27), m42Var);
        if (p == n82.a) {
            return p;
        }
        return pvc.a;
    }

    public static Object w(l37 l37Var, Uri uri, InputEvent inputEvent, m42 m42Var) {
        f61 f61Var = new f61(1, w92.t(m42Var));
        f61Var.u();
        l37Var.d.registerSource(uri, inputEvent, new az(1), new p42(f61Var));
        Object s = f61Var.s();
        if (s == n82.a) {
            return s;
        }
        return pvc.a;
    }

    public static Object x(l37 l37Var, Uri uri, m42 m42Var) {
        f61 f61Var = new f61(1, w92.t(m42Var));
        f61Var.u();
        l37Var.d.registerTrigger(uri, new az(1), new p42(f61Var));
        Object s = f61Var.s();
        if (s == n82.a) {
            return s;
        }
        return pvc.a;
    }

    public static Object z(l37 l37Var, kgd kgdVar, m42 m42Var) {
        new f61(1, w92.t(m42Var)).u();
        MeasurementManager measurementManager = l37Var.d;
        throw null;
    }

    public Object A(lgd lgdVar, m42 m42Var) {
        return B(this, lgdVar, m42Var);
    }

    @Override // defpackage.sye
    public Object m(m42 m42Var) {
        return t(this, m42Var);
    }

    @Override // defpackage.sye
    public Object o(Uri uri, InputEvent inputEvent, m42 m42Var) {
        return w(this, uri, inputEvent, m42Var);
    }

    @Override // defpackage.sye
    public Object p(Uri uri, m42 m42Var) {
        return x(this, uri, m42Var);
    }

    public Object r(n13 n13Var, m42 m42Var) {
        return s(this, n13Var, m42Var);
    }

    public Object u(gua guaVar, m42 m42Var) {
        return v(this, guaVar, m42Var);
    }

    public Object y(kgd kgdVar, m42 m42Var) {
        return z(this, kgdVar, m42Var);
    }
}
