package defpackage;

import android.os.IBinder;
import android.os.Parcelable;
import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fy9  reason: default package */
/* loaded from: classes.dex */
public abstract class fy9 {
    public static final o9a a = new m19(cm9.a(CharSequence.class)).e();
    public static final o9a b = new m19(cm9.a(Parcelable.class)).e();
    public static final o9a c = new m19(cm9.a(Serializable.class)).e();
    public static final o9a d = new m19(cm9.a(IBinder.class)).e();
    public static final qz e;
    public static final qz f;
    public static final qz g;
    public static final qz h;
    public static final qz i;
    public static final qz j;
    public static final qz k;
    public static final qz l;
    public static final o9a m;
    public static final o9a n;
    public static final o9a o;

    static {
        kw2 kw2Var = kw2.b;
        cm9.a(Parcelable.class);
        kw2Var.getClass();
        o9a e2 = kw2Var.e();
        e2.getClass();
        e = new qz(e2, 0);
        m19 m19Var = new m19(cm9.a(Parcelable.class));
        cm9.a(Parcelable.class);
        o9a e3 = m19Var.e();
        e3.getClass();
        f = new qz(e3, 0);
        o9a e4 = kw2Var.e();
        e4.getClass();
        g = new qz(e4, 1);
        o9a e5 = new m19(cm9.a(Parcelable.class)).e();
        e5.getClass();
        h = new qz(e5, 1);
        qc1 qc1Var = qc1.a;
        cm9.a(CharSequence.class);
        o9a e6 = qc1Var.e();
        e6.getClass();
        i = new qz(e6, 0);
        m19 m19Var2 = new m19(cm9.a(CharSequence.class));
        cm9.a(CharSequence.class);
        o9a e7 = m19Var2.e();
        e7.getClass();
        j = new qz(e7, 0);
        q9a q9aVar = qc1.b;
        q9aVar.getClass();
        k = new qz(q9aVar, 1);
        o9a e8 = new m19(cm9.a(CharSequence.class)).e();
        e8.getClass();
        l = new qz(e8, 1);
        dwa dwaVar = ewa.Companion;
        m = dwaVar.serializer(kw2Var).e();
        n = dwaVar.serializer(new m19(cm9.a(Parcelable.class))).e();
        o = dwaVar.serializer(wq9.H(new m19(cm9.a(Parcelable.class)))).e();
    }
}
