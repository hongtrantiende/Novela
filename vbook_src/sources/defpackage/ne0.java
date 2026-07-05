package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ne0  reason: default package */
/* loaded from: classes3.dex */
public final class ne0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(ne0.class, "notCompletedCount$volatile");
    public final gz2[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public ne0(gz2[] gz2VarArr) {
        this.a = gz2VarArr;
        this.notCompletedCount$volatile = gz2VarArr.length;
    }

    public final Object a(m42 m42Var) {
        f61 f61Var = new f61(1, w92.t(m42Var));
        f61Var.u();
        gz2[] gz2VarArr = this.a;
        int length = gz2VarArr.length;
        le0[] le0VarArr = new le0[length];
        for (int i = 0; i < length; i++) {
            gz2 gz2Var = gz2VarArr[i];
            gz2Var.start();
            le0 le0Var = new le0(this, f61Var);
            le0Var.E = k27.t(gz2Var, true, le0Var);
            le0VarArr[i] = le0Var;
        }
        me0 me0Var = new me0(le0VarArr);
        for (int i2 = 0; i2 < length; i2++) {
            le0VarArr[i2].t(me0Var);
        }
        if (!(f61Var.t() instanceof f48)) {
            me0Var.b();
        } else {
            f61Var.x(me0Var);
        }
        return f61Var.s();
    }
}
