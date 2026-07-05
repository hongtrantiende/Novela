package defpackage;

import android.graphics.Point;
import android.media.metrics.LogSessionId;
import android.view.ScrollCaptureTarget;
import java.util.Arrays;
import java.util.function.Consumer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zz8  reason: default package */
/* loaded from: classes.dex */
public final class zz8 {
    public Object a;

    public zz8(int i) {
        LogSessionId logSessionId;
        switch (i) {
            case 1:
                this.a = yae.z(Boolean.FALSE);
                return;
            default:
                logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                this.a = logSessionId;
                return;
        }
    }

    public void a(rg rgVar, e8a e8aVar, d82 d82Var, Consumer consumer) {
        Object obj;
        gw7 gw7Var = new gw7(new v1a[16], 0);
        hxe.A(e8aVar.a(), 0, new u1a(1, gw7Var, gw7.class, "add", "add(Ljava/lang/Object;)Z", 8, 0));
        Arrays.sort(gw7Var.a, 0, gw7Var.c, hxe.i(co9.e, co9.f));
        int i = gw7Var.c;
        if (i == 0) {
            obj = null;
        } else {
            obj = gw7Var.a[i - 1];
        }
        v1a v1aVar = (v1a) obj;
        if (v1aVar == null) {
            return;
        }
        uy5 uy5Var = v1aVar.c;
        kw1 kw1Var = new kw1(v1aVar.a, uy5Var, k27.a(d82Var), this, rgVar);
        i38 i38Var = v1aVar.d;
        rk9 g0 = obe.t(i38Var).g0(i38Var, true);
        long d = uy5Var.d();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(rgVar, ipe.B(pc2.t(g0)), new Point((int) (d >> 32), (int) (d & 4294967295L)), kw1Var);
        scrollCaptureTarget.setScrollBounds(ipe.B(uy5Var));
        consumer.accept(scrollCaptureTarget);
    }

    public void b(LogSessionId logSessionId) {
        LogSessionId logSessionId2;
        logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
        wq9.D(((LogSessionId) this.a).equals(logSessionId2));
        this.a = logSessionId;
    }
}
