package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rt1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rt1 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bu1 b;

    public /* synthetic */ rt1(bu1 bu1Var, int i) {
        this.a = i;
        this.b = bu1Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, e08] */
    @Override // defpackage.vt4
    public final Object invoke() {
        Bundle bundle;
        int i = this.a;
        bu1 bu1Var = this.b;
        switch (i) {
            case 0:
                bu1Var.reportFullyDrawn();
                return pvc.a;
            case 1:
                return new ut4(bu1Var.f, new rt1(bu1Var, 0));
            case 2:
                ?? obj = new Object();
                bu1Var.getNavigationEventDispatcher().b(obj);
                return obj;
            case 3:
                Application application = bu1Var.getApplication();
                if (bu1Var.getIntent() != null) {
                    bundle = bu1Var.getIntent().getExtras();
                } else {
                    bundle = null;
                }
                return new vy9(application, bu1Var, bundle);
            default:
                tb8 tb8Var = new tb8(new qt1(bu1Var, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!c16.i(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new b9(12, bu1Var, tb8Var));
                    } else {
                        bu1Var.a.a(new st1(0, tb8Var, bu1Var));
                    }
                }
                return tb8Var;
        }
    }
}
